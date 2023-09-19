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

public class UnknownTypeError extends AvalancheError {
    public UnknownTypeError(String m) {
        super(m, UNKNOWN_TYPE_ERROR_CODE);
    }
}
