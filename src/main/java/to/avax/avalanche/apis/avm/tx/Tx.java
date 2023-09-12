package to.avax.avalanche.apis.avm.tx;

import to.avax.avalanche.apis.avm.keychain.KeyChain;
import to.avax.avalanche.apis.avm.keychain.KeyPair;
import to.avax.avalanche.common.tx.StandardTx;

public class Tx extends StandardTx<KeyPair, KeyChain, UnsignedTx> {
    protected String _typeName = "Tx";
    protected String _typeID = null;


}