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

/*
*
* Original code at:
* https://github.com/ava-labs/avalanchejs/blob/master/src/utils/base58.ts
*
* */

import com.google.common.collect.Lists;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CB58 {
    final static protected String[] b58alphabet = Arrays.copyOfRange("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".split(""), 0, 58);

    final static protected char alphabetIdx0 = '1';

    final static protected int[] b58 = {
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 255, 255, 255, 255, 255, 255,
            255, 9, 10, 11, 12, 13, 14, 15, 16, 255, 17, 18, 19, 20, 21, 255, 22, 23,
            24, 25, 26, 27, 28, 29, 30, 31, 32, 255, 255, 255, 255, 255, 255, 33, 34,
            35, 36, 37, 38, 39, 40, 41, 42, 43, 255, 44, 45, 46, 47, 48, 49, 50, 51, 52,
            53, 54, 55, 56, 57, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255,
            255, 255
    };

    final static protected BigInteger big58Radix = new BigInteger("58");

    final static protected BigInteger bigZero = BigInteger.ZERO;

    /**
     * Encodes a {@link https://github.com/feross/buffer|Buffer} as a base-58 string
     *
     * @param buff A {@link https://github.com/feross/buffer|Buffer} to encode
     *
     * @returns A base-58 string.
     */
    public static String encode(byte[] buff) {
        String buffStr = Hex.encodeHexString(buff);
        BigInteger x = new BigInteger(buffStr, 16);
        StringBuffer answer = new StringBuffer(); // = Buffer.alloc(buff.length*136/100, 0);

        while (x.compareTo(bigZero) > 0) {
            BigInteger mod = x.mod(big58Radix);
            x = x.divide(big58Radix);
            answer.append(b58alphabet[mod.intValue()]);
        }

        for (var i = 0; i < buff.length; i++) {
            if (buff[i] != 0) {
                break;
            }
            answer.append(alphabetIdx0);
        }

        List<String> revCB58 = Lists.reverse( List.of(answer.toString().split("")) );

        return String.join("", revCB58);
    }

    /**
     * Decodes a base-58 into a {@link https://github.com/feross/buffer|Buffer}
     *
     * @param b A base-58 string to decode
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer} from the decoded string.
     */
    public static byte[] decode(String b) {

        BigInteger answer = BigInteger.ZERO;
        BigInteger j = BigInteger.ONE;

        for (var i = b.length() - 1; i >= 0; i--) {
            final int tmp = b58[b.charAt(i)];
            if (tmp == 255) {
                throw new RuntimeException("Error - Base58.decode: not a valid base58 string");
            }
            BigInteger scratch = BigInteger.valueOf(tmp);
            scratch = scratch.multiply(j);
            answer = answer.add(scratch);
            j = j.multiply(big58Radix);
        }

        /* we need to make sure the prefaced 0's are put back to be even in this string */
        var anshex = answer.toString(16);
        anshex = (anshex.length() % 2) > 0 ? String.format("0%s", anshex) : anshex;

        /**
         * We need to replace all zeros that were removed during our conversation process.
         * This ensures the buffer returns is the appropriate length.
         */
        byte[] tmpval;
        try {
            tmpval = Hex.decodeHex(anshex);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }

        int numZeros = 0;
        for (; numZeros < b.length(); numZeros++) {
            if (b.charAt(numZeros) != alphabetIdx0) {
                break;
            }
        }

        return Arrays.copyOfRange(tmpval, numZeros, numZeros + tmpval.length);
    }
}
