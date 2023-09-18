package to.avax.avalanche.common.utxos;

import to.avax.avalanche.common.output.Output;

public abstract class StandardUTXO {
    protected String _typeName;
    protected Object _typeID;
    protected byte[] codecID;
    protected byte[] txid;
    protected byte[] outputidx;
    protected byte[] assetID;

    protected Output output;
}
