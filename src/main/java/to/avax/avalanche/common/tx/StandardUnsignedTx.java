package to.avax.avalanche.common.tx;

import to.avax.avalanche.common.keychain.StandardKeyChain;
import to.avax.avalanche.common.keychain.StandardKeyPair;

public abstract class StandardUnsignedTx<
        KPClass extends StandardKeyPair,
        KCClass extends StandardKeyChain<KPClass>,
        SBTx extends StandardBaseTx<KPClass, KCClass>
        > {
}
