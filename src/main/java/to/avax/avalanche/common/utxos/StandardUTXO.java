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

package to.avax.avalanche.common.utxos;

import to.avax.avalanche.common.output.Output;
import to.avax.avalanche.utils.serialization.AvalancheSerializable;

public abstract class StandardUTXO extends AvalancheSerializable {
    protected String _typeName = "StandardUTXO";
    protected Object _typeID = null;
    protected byte[] codecID;
    protected byte[] txid;
    protected byte[] outputidx;
    protected byte[] assetID;

    protected Output output;


}
