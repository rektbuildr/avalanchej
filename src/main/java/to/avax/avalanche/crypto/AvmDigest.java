/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/
package to.avax.avalanche.crypto;

import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class AvmDigest {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static byte[] digest(byte[] data, String algo) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algo);
            messageDigest.update(data);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static byte[] sha256(byte[] data) {
        return digest(data, "SHA-256");
    }
    public static byte[] ripeMd160(byte[] data) {
        return digest(data, "RIPEMD160");
    }
    public static byte[] sha256ripemd160(byte[] data) {
        return ripeMd160(sha256(data));
    }

    public static String sha256ripemd160String(byte[] data) {
        return Hex.encodeHexString(ripeMd160(sha256(data)));
    }
}
