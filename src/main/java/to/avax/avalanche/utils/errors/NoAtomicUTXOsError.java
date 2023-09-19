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

public class NoAtomicUTXOsError extends AvalancheError {
    public NoAtomicUTXOsError(String m) {
        super(m, NO_ATOMIX_UTXOS_ERROR_CODE);
    }
}
