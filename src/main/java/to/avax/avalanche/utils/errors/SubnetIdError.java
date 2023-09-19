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

public class SubnetIdError extends AvalancheError {
    public SubnetIdError(String m) {
        super(m, SUBNET_ID_ERROR_CODE);
    }
}
