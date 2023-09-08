/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2020-2023 AVAXBuildr
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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CypherAESTest {


    private static final int KEY_LENGTH = 32;
    private static final String cleartextMessage = "Avalanche AVAX original message 12345678 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam porta vestibulum bibendum. Aliquam sapien sapien, eleifend ac tortor eu, faucibus pellentesque arcu. Etiam finibus euismod augue a bibendum. Ut ornare enim in pellentesque ornare. Donec nec sollicitudin ligula, ut fermentum orci. Nulla facilisi. Etiam pellentesque, nibh ut vestibulum volutpat, justo dui euismod quam, ac euismod augue arcu quis dolor. Integer neque est, suscipit id sapien vitae, sagittis euismod nunc. Suspendisse tincidunt neque vel feugiat rutrum. Integer pharetra sit amet ipsum sit amet ornare. Integer rhoncus pretium augue, tincidunt faucibus sapien eleifend luctus.\n";

    private CypherAES caes;
    @BeforeAll
    public void init() {
        caes = new CypherAES(cleartextMessage);
    }

    @Test
    public void testDecrypt(){
        assertEquals(caes.getValue(), cleartextMessage);
    }

    @Test
    public void testKeyLength() {
        String key = CypherAES.generateKeyString(KEY_LENGTH * 8);
        assertNotNull(key);
        assertEquals(Base64.getDecoder().decode(key).length, KEY_LENGTH);
    }
}
