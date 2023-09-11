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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelperFunctionsTest {

    private final static int STRING_LENGTH = 256;
    @Test
    void testRandomString(){
        String tst = HelperFunctions.getRandomString(STRING_LENGTH);
        assertEquals(tst.length(), STRING_LENGTH);
    }

    @Test
    void testNetworkName() {
        assertEquals(HelperFunctions.getNetworkName(1), HelperFunctions.getNetworkName("1"));
    }
}
