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

import to.avax.avalanche.common.input.StandardTransferableInput;
import to.avax.avalanche.common.keychain.StandardKeyChain;
import to.avax.avalanche.common.keychain.StandardKeyPair;
import to.avax.avalanche.common.output.StandardTransferableOutput;

public abstract class StandardBaseTx <KPClass extends StandardKeyPair, KCClass extends StandardKeyChain<KPClass>>{
    protected String _typeName = "StandardBaseTx";
    protected String _typeID = null;
    protected byte[] networkID = new byte[4];
    protected byte[] blockchainID = new byte[32];
    protected byte[] numouts = new byte[4];
    protected StandardTransferableOutput[] outs;
    protected byte[] numins = new byte[4];
    protected StandardTransferableInput[] ins;
    protected byte[] memo = new byte[0];
}
