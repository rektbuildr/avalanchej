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

import java.security.SecureRandom;

public class HelperFunctions {
    public static String getNetworkName(String networkId) {
        return getNetworkName(Integer.parseInt(networkId));
    }
    public static String getNetworkName(int networkId) {
        return switch (networkId) {
            case 1 -> "Mainnet";
            case 2 -> "Fuji";
            case 3 -> "Local";
            default -> "Unknown";
        };
    }
    public static String getPreferredHRP(int networkID){
        return switch (networkID) {
            case 1 -> "avax";
            case 2 -> "fuji";
            case 3 -> "local";
            default -> "unknown";
        };
    }
    /**
     * Takes a private key string and produces a private key {@link https://github.com/feross/buffer|Buffer}.
     *
     * @param pk A string for the private key.
     */
    public byte[] privateKeyStringToBuffer(String pk) {
        if (!pk.startsWith("PrivateKey-")) {
            throw new RuntimeException("Error - privateKeyStringToBuffer: private keys must start with 'PrivateKey-'");
        }
        String[] pksplit = pk.split("-");
        return BinTools.cb58Decode(pksplit[pksplit.length - 1]);
    }

    /*
    * Original getRandomString code by Baeldung https://www.baeldung.com/java-random-string
    * Modified to use SecureRandom
    * */
    public static String getRandomString(int length) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        SecureRandom random = new SecureRandom();
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    /**
     * Takes a nodeID buffer and produces a nodeID string with prefix.
     *
     * @param pk A {@link https://github.com/feross/buffer|Buffer} for the nodeID.
     */
    public static String bufferToNodeIDString(byte[] pk) {
        return String.format("NodeID-%s", BinTools.cb58Encode(pk));
    }

    /**
     * Takes a private key buffer and produces a private key string with prefix.
     *
     * @param pk A {@link https://github.com/feross/buffer|Buffer} for the private key.
     */
    public static String bufferToPrivateKeyString(byte[] pk) {
        return String.format("PrivateKey-%s", BinTools.cb58Encode(pk));
    }
}
