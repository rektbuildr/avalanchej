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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelperFunctionsTest {

    private final static int STRING_LENGTH = 256;
    @Test
    void testRandomString(){
        String tst = HelperFunctions.getRandomString(STRING_LENGTH);
        assertEquals(tst.length(), STRING_LENGTH);
    }
}
