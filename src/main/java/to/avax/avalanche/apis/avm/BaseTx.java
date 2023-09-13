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

package to.avax.avalanche.apis.avm;

import to.avax.avalanche.apis.avm.keychain.KeyChain;
import to.avax.avalanche.apis.avm.keychain.KeyPair;
import to.avax.avalanche.common.tx.StandardBaseTx;

public class BaseTx extends StandardBaseTx<KeyPair, KeyChain> {
    public BaseTx(Object ... args) {}
}
