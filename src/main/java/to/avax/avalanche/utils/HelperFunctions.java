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

import java.math.BigInteger;
import java.security.SecureRandom;

public class HelperFunctions {
    public static String getNetworkName(String networkId) {
        switch (networkId) {
            case "1":
                return "Mainnet";
            case "2":
                return "Fuji";
            case "3":
                return "Local";
            default:
                return "Unknown";
        }
    }

    public static String getPreferredHRP(int networkID){
            switch (networkID) {
            case 1:
                return "avax";
            case 2:
                return "fuji";
            case 3:
                return "local";
            default:
                return "unknown";
        }
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
