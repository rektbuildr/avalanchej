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

public class SECPMintOutputError extends AvalancheError {
    public SECPMintOutputError(String m) {
        super(m, SECP_MINT_OUTPUT_ERROR_CODE);
    }
}
