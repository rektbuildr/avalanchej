package to.avax.avalanche.common.tx;

import to.avax.avalanche.common.keychain.StandardKeyChain;
import to.avax.avalanche.common.keychain.StandardKeyPair;

public class StandardTx<
        KPClass extends StandardKeyPair,
        KCClass extends StandardKeyChain<KPClass>,
        SUBTx extends StandardUnsignedTx<
                KPClass,
                KCClass,
                ? extends StandardBaseTx<KPClass, KCClass>
                >
        > {

}
