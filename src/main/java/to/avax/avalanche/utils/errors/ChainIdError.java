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

public class ChainIdError extends AvalancheError {
    public ChainIdError(String m) {
        super(m, CHAIN_ID_ERROR_CODE);
    }
}
