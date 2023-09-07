/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
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
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;

public class CypherAES {
    private final int PASS_LENGTH = 32 * 8;

    private final static String HASHING_ALGO = "SHA-256";
    private final static String KEY_ENCRYPTION_ALGO = "AES";
    private final static String ENCRYPTION_ALGO = "AES/CBC/PKCS5Padding";

    private final String pass;
    private final String encrypted;
    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ENCRYPTION_ALGO);
        keyGenerator.init(n);
        return keyGenerator.generateKey();
    }

    public static String generateKeyString(int n) throws NoSuchAlgorithmException {
        return generateKey(n).toString();
    }

    public CypherAES(String value) {

        try {
            this.pass = generateKeyString(PASS_LENGTH);
            this.encrypted = encryptToString(value, this.pass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encryptToString (String plainText, String key) throws Exception {
        return new String(encrypt(plainText, key), StandardCharsets.UTF_8);
    }

    public static byte[] encrypt (String plainText, String key) throws Exception {
        byte[] clean = plainText.getBytes();

        // Generating IV.
        int ivSize = 16;
        byte[] iv = new byte[ivSize];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        // Hashing key.
        MessageDigest digest = MessageDigest.getInstance(HASHING_ALGO);
        digest.update(key.getBytes(StandardCharsets.UTF_8));
        byte[] keyBytes = new byte[16];
        System.arraycopy(digest.digest(), 0, keyBytes, 0, keyBytes.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, KEY_ENCRYPTION_ALGO);

        // Encrypt.
        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGO);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(clean);

        // Combine IV and encrypted part.
        byte[] encryptedIVAndText = new byte[ivSize + encrypted.length];
        System.arraycopy(iv, 0, encryptedIVAndText, 0, ivSize);
        System.arraycopy(encrypted, 0, encryptedIVAndText, ivSize, encrypted.length);

        return encryptedIVAndText;
    }

    public static String decrypt ( byte[] encryptedIvTextBytes, String key) throws Exception {
        int ivSize = 16;
        int keySize = 16;

        // Extract IV.
        byte[] iv = new byte[ivSize];
        System.arraycopy(encryptedIvTextBytes, 0, iv, 0, iv.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

        // Extract encrypted part.
        int encryptedSize = encryptedIvTextBytes.length - ivSize;
        byte[] encryptedBytes = new byte[encryptedSize];
        System.arraycopy(encryptedIvTextBytes, ivSize, encryptedBytes, 0, encryptedSize);

        // Hash key.
        byte[] keyBytes = new byte[keySize];
        MessageDigest md = MessageDigest.getInstance(HASHING_ALGO);
        md.update(key.getBytes());
        System.arraycopy(md.digest(), 0, keyBytes, 0, keyBytes.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, KEY_ENCRYPTION_ALGO);

        // Decrypt.
        Cipher cipherDecrypt = Cipher.getInstance(ENCRYPTION_ALGO);
        cipherDecrypt.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] decrypted = cipherDecrypt.doFinal(encryptedBytes);

        return new String(decrypted);
    }

    public String getValue() throws Exception {
        return decrypt(this.encrypted.getBytes(StandardCharsets.UTF_8), this.pass);
    }
}