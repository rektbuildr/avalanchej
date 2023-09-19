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

public class PrivateKeyError extends AvalancheError {
    public PrivateKeyError(String m) {
        super(m, PRIVATE_KEY_ERROR_CODE);
    }
}
