/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils.serialization;

import to.avax.avalanche.utils.BinTools;

public class Serialization {
    final private BinTools bintools;
    final private static Serialization instance;

    static {
        instance = new Serialization();
    }

    public static Serialization getInstance() {
        return instance;
    }

    public Serialization() {
        bintools = BinTools.getInstance();
    }
}
