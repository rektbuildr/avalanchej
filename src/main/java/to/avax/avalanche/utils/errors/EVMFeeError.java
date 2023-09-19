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

public class EVMFeeError extends AvalancheError {
    public EVMFeeError(String m) {
        super(m, EVM_FEE_ERROR_CODE);
    }
}
