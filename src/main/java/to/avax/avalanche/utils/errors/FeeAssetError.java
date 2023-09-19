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

public class FeeAssetError extends AvalancheError {
    public FeeAssetError(String m) {
        super(m, FEE_ASSET_ERROR_CODE);
    }
}
