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
