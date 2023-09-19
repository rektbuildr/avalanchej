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

public class GooseEggCheckError extends AvalancheError {
    public GooseEggCheckError(String m) {
        super(m, GOOSE_EGG_CHECK_ERROR_CODE);
    }
}
