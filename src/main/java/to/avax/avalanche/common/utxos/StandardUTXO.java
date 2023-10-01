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
import to.avax.avalanche.utils.Buffer;
import to.avax.avalanche.utils.serialization.AvalancheSerializable;

public abstract class StandardUTXO extends AvalancheSerializable {
    protected String _typeName = "StandardUTXO";
    protected Object _typeID = null;
    protected byte[] codecID;
    protected byte[] txid;
    protected byte[] outputidx;
    protected byte[] assetID;

    protected Output output;

    /**
     * Class for representing a single StandardUTXO.
     *
     * @param codecID Optional number which specifies the codeID of the UTXO. Default 0
     * @param txID Optional {@link https://github.com/feross/buffer|Buffer} of transaction ID for the StandardUTXO
     * @param txidx Optional {@link https://github.com/feross/buffer|Buffer} or number for the index of the transaction's [[Output]]
     * @param assetID Optional {@link https://github.com/feross/buffer|Buffer} of the asset ID for the StandardUTXO
     * @param outputid Optional {@link https://github.com/feross/buffer|Buffer} or number of the output ID for the StandardUTXO
     */
    public StandardUTXO(
            int codecID,
            byte[] txID,
            byte[] outputidx,
            byte[] assetID,
            Output output
    ) {
        super();
        System.arraycopy(codecID, 0, this.codecID, 0, 2);
        this.txid = txID;
        this.outputidx = outputidx;
        this.assetID = assetID;
        this.output = output;
    }

    public StandardUTXO(
            int codecID,
            byte[] txID,
            int outputIdx,
            byte[] assetID,
            Output output
    ) {
        super();
        Buffer.wrap(this.codecID).writeUInt8(codecID, 0);
        this.txid = txID;
        Buffer.wrap(this.outputidx).writeUInt32BE(outputIdx, 0);
        this.assetID = assetID;
        this.output = output;
    }
    public StandardUTXO(){}

}
