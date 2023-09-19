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

public class TransferableInputError extends AvalancheError {
    public TransferableInputError(String m) {
        super(m, TRANSFERABLE_INPUT_ERROR_CODE);
    }
}
