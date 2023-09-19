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

package to.avax.avalanche.utils.errors;

public class Bech32Error extends AvalancheError {
    public Bech32Error(String m) {
        super(m, BECH32_ERROR_CODE);
    }
}
