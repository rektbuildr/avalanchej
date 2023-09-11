/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 * encrypt and decrypt functions by Erik Howard :
 * https://gist.github.com/erikhoward/9dd641eeb8e6d1a6aa52a9f6bc8010b7
 *
 **/

package to.avax.avalanche.utils;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class CypherAES {
    private final int PASS_SIZE_BITS = 32 * 8;
    private final static String HASHING_ALGO = "SHA-256";
    private final static int KEY_BYTE_SIZE = 16;
    private final static String KEY_ENCRYPTION_ALGO = "AES";
    private final static String ENCRYPTION_ALGO = "AES/CBC/PKCS5Padding";
    private final static int IV_BYTE_SIZE = 16;
    private final static int KEY_SIZE = 16;
    private final String pass;
    private final String encrypted;
    public static SecretKey generateKey(int n) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ENCRYPTION_ALGO);
            keyGenerator.init(n);
            return keyGenerator.generateKey();
        } catch (Throwable t) {
            t.printStackTrace();
            return null;
        }

    }

    public static String generateKeyString(int n) {
        SecretKey s = generateKey(n);

        if (s != null)
            return Base64.getEncoder().encodeToString(s.getEncoded());

        return null;
    }

    public CypherAES(String value) {

        try {
            this.pass = generateKeyString(PASS_SIZE_BITS);
            this.encrypted = encryptToString(value, this.pass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encryptToString (String plainText, String key) {
        byte[] cipher = encrypt(plainText, key);
        if (cipher != null)
            return Base64.getEncoder().encodeToString(cipher);

        return null;
    }

    public static byte[] encrypt (String plainText, String key) {

        byte[] bytesClear = plainText.getBytes(StandardCharsets.UTF_8);
        byte[] clean = Base64.getEncoder().encode(bytesClear);

        // Generating IV.
        byte[] iv = new byte[IV_BYTE_SIZE];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        try {
            // Hashing key.
            MessageDigest digest = MessageDigest.getInstance(HASHING_ALGO);
            digest.update(Base64.getDecoder().decode(key));
            byte[] keyBytes = new byte[KEY_BYTE_SIZE];
            System.arraycopy(digest.digest(), 0, keyBytes, 0, keyBytes.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, KEY_ENCRYPTION_ALGO);

            // Encrypt.
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGO);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] encrypted = cipher.doFinal(clean);

            // Combine IV and encrypted part.
            byte[] encryptedIVAndText = new byte[IV_BYTE_SIZE + encrypted.length];
            System.arraycopy(iv, 0, encryptedIVAndText, 0, IV_BYTE_SIZE);
            System.arraycopy(encrypted, 0, encryptedIVAndText, IV_BYTE_SIZE, encrypted.length);

            return encryptedIVAndText;
        } catch (Throwable t) {
            return null;
        }
    }

    public static String decrypt ( byte[] encryptedIvTextBytes, String key) {

        try {
            // Extract IV.
            byte[] iv = new byte[IV_BYTE_SIZE];
            System.arraycopy(encryptedIvTextBytes, 0, iv, 0, iv.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

            // Extract encrypted part.
            int encryptedSize = encryptedIvTextBytes.length - IV_BYTE_SIZE;
            byte[] encryptedBytes = new byte[encryptedSize];
            System.arraycopy(encryptedIvTextBytes, IV_BYTE_SIZE, encryptedBytes, 0, encryptedSize);

            // Hash key.
            byte[] keyBytes = new byte[KEY_SIZE];
            MessageDigest md = MessageDigest.getInstance(HASHING_ALGO);
            md.update(Base64.getDecoder().decode(key));
            System.arraycopy(md.digest(), 0, keyBytes, 0, keyBytes.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, KEY_ENCRYPTION_ALGO);

            // Decrypt.
            Cipher cipherDecrypt = Cipher.getInstance(ENCRYPTION_ALGO);
            cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] decrypted = cipherDecrypt.doFinal(encryptedBytes);
            byte[] decoded = Base64.getDecoder().decode(decrypted);

            return new String(decoded, StandardCharsets.UTF_8);
        } catch (Throwable t) {
            return null;
        }
    }

    public String getValue() {
        return decrypt(Base64.getDecoder().decode(this.encrypted), this.pass);
    }
}