/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2020-2023 REKTBuildr
 *
 * BSD 3-Clause License
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CB58Test {

    private final static byte[] testBuff = new byte[256];

    static {
        new Random().nextBytes(testBuff);
    }

    @Test
    void testDecode() {
        byte[] ret = CB58.decode(CB58.encode(testBuff));
        assertArrayEquals(testBuff, ret);
    }
}
