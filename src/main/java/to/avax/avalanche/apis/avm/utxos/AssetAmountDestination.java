/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/
package to.avax.avalanche.apis.avm.utxos;

import to.avax.avalanche.common.assetamount.StandardAssetAmountDestination;
import to.avax.avalanche.apis.avm.inputs.TransferableInput;
import to.avax.avalanche.apis.avm.outputs.TransferableOutput;

public class AssetAmountDestination extends StandardAssetAmountDestination<
        TransferableOutput,
        TransferableInput
        > {}