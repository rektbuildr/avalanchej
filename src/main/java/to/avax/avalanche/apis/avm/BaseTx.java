package to.avax.avalanche.apis.avm;

import to.avax.avalanche.apis.avm.keychain.KeyChain;
import to.avax.avalanche.apis.avm.keychain.KeyPair;
import to.avax.avalanche.common.tx.StandardBaseTx;

public class BaseTx extends StandardBaseTx<KeyPair, KeyChain> {
    public BaseTx(Object ... args) {}
}
