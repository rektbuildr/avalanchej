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
}
