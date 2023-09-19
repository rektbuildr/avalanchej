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

public class BufferSizeError extends AvalancheError {
    public BufferSizeError(String m) {
        super(m, BUFFER_SIZE_ERROR_CODE);
    }
}
