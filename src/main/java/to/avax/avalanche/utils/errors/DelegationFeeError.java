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

public class DelegationFeeError extends AvalancheError {
    public DelegationFeeError(String m) {
        super(m, DELEGATION_FEE_ERROR_CODE);
    }
}
