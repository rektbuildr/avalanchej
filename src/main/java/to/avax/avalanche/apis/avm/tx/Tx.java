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

package to.avax.avalanche.apis.avm.tx;

import to.avax.avalanche.apis.avm.keychain.KeyChain;
import to.avax.avalanche.apis.avm.keychain.KeyPair;
import to.avax.avalanche.common.tx.StandardTx;

public class Tx extends StandardTx<KeyPair, KeyChain, UnsignedTx> {
    protected String _typeName = "Tx";
    protected int _typeID = -1;


}