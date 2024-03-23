/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils;

import org.bitcoinj.core.Base58;
import org.bitcoinj.core.Bech32;
import to.avax.avalanche.utils.errors.ChecksumError;
import to.avax.avalanche.wallet.Types;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinTools {

    final private static BinTools instance;

    static {
        instance = new BinTools();
    }

    private BinTools(){
    }

    public static BinTools getInstance() {
        return instance;
    }

    public static String addressToString(String hrp, Types.ChainAlias chainId, byte[] addrBuf) {
        byte[] b8t5 = AvaxtoBech32.encode8to5(addrBuf);
        String addr = Bech32.encode(Bech32.Encoding.BECH32, hrp, b8t5);
        return String.format("%s-%s", chainId, addr);
    }
    public static String bytesToHex(byte[] input) {
        StringBuilder sb = new StringBuilder(input.length * 2);
        for(byte b: input) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

    /**
     * Returns true if base64, otherwise false
     * @param str the string to verify is Base64
     */
    public static boolean isBase64(String str) {
        if (str.isEmpty() || str.trim().isEmpty()) {
            return false;
        }
        try {
            byte[] b64 = Base64.getDecoder().decode(str);
            byte[] r64 = Base64.getEncoder().encode(b64);
            return new String(r64).equals(str);
        } catch (Throwable t) {
            return false;
        }
    }

    /**
     * Returns true if cb58, otherwise false
     * @param cb58 the string to verify is cb58
     */
    public static boolean isCB58(String cb58) {
        return isBase58(cb58);
    }

    /**
     * Returns true if base58, otherwise false
     * @param base58 the string to verify is base58
     */
    public static boolean isBase58(String base58) {
        BinTools bt = getInstance();
        if (base58.isEmpty() || base58.trim().isEmpty()) {
            return false;
        }
        try {
            return Base58.encode(Base58.decode(base58)).equals(base58);
        } catch (Throwable t) {
            return false;
        }
    }

    /**
     * Returns true if hexdecimal, otherwise false
     * @param hex the string to verify is hexidecimal
     */
    public boolean isHex(String hex) {
        if (hex.isEmpty() || hex.trim().isEmpty()) {
            return false;
        }
        final Pattern p1 = Pattern.compile("[0-9A-Fa-f]");

        final boolean startsWith0x = hex.startsWith("0x");
        final Matcher matchResult = startsWith0x ? p1.matcher(hex.substring(2)) : p1.matcher(hex);
        final long matchCount = matchResult.results().count();
        return (startsWith0x && (hex.length() - 2 == matchCount)) || (hex.length() == matchCount);
    }

    /**
     * Takes a {@link https://github.com/feross/buffer|Buffer} and returns a base-58 string with
     * checksum as per the cb58 standard.
     *
     * @param bytes A {@link https://github.com/feross/buffer|Buffer} to serialize
     *
     * @returns A serialized base-58 string of the Buffer.
     */
    public static String cb58Encode(byte[] bytes) {
        byte[] x = addChecksum(bytes);
        return bufferToB58(x);
    }

    /**
     * Takes a {@link https://github.com/feross/buffer|Buffer} and adds a checksum, returning
     * a {@link https://github.com/feross/buffer|Buffer} with the 4-byte checksum appended.
     *
     * @param buff The {@link https://github.com/feross/buffer|Buffer} to append a checksum
     */
    public static byte[] addChecksum(byte[] buff) {
        try {
            MessageDigest dig = MessageDigest.getInstance("SHA256");
            dig.update(buff);
            byte[] hashslice = dig.digest();

            ByteBuffer newBuff = ByteBuffer.allocate(buff.length + hashslice.length);
            return newBuff.array();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Takes a {@link https://github.com/feross/buffer|Buffer} with an appended 4-byte checksum
     * and returns true if the checksum is valid, otherwise false.
     *
     * @param b The {@link https://github.com/feross/buffer|Buffer} to validate the checksum
     */
    public static boolean validateChecksum(byte[] buff) {
        byte[] checkslice = Arrays.copyOfRange(buff, buff.length - 4, buff.length);
        try {
            MessageDigest md = MessageDigest.getInstance("SHA256");
            md.update(Arrays.copyOfRange(buff,0,buff.length - 4));
            byte[] hash = md.digest();
            byte[] hashslice = Arrays.copyOfRange(hash, 28, hash.length);
            return Arrays.equals(checkslice, hashslice);
        } catch (NoSuchAlgorithmException e) {
            return false;
        }
    }

    /**
     * Takes a cb58 serialized {@link https://github.com/feross/buffer|Buffer} or base-58 string
     * and returns a {@link https://github.com/feross/buffer|Buffer} of the original data. Throws on error.
     *
     * @param bytes A cb58 serialized {@link https://github.com/feross/buffer|Buffer} or base-58 string
     */
    public static byte[] cb58Decode(byte[] bytes) {

        if (validateChecksum(bytes)) {
            return Arrays.copyOfRange(bytes, 0, bytes.length - 4);
        }

        throw new ChecksumError("Error - BinTools.cb58Decode: invalid checksum");
    }

    public static byte[] cb58Decode(String str) {
        return cb58Decode(str.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Takes a {@link https://github.com/feross/buffer|Buffer} and returns a base-58 string of
     * the {@link https://github.com/feross/buffer|Buffer}.
     *
     * @param buff The {@link https://github.com/feross/buffer|Buffer} to convert to base-58
     */
    public static String bufferToB58(byte[] buff){
        return Base58.encode(buff);
    }
}
