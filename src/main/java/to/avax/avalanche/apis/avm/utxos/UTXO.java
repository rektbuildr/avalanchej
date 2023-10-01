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
package to.avax.avalanche.apis.avm.utxos;

import to.avax.avalanche.common.utxos.StandardUTXO;
import to.avax.avalanche.utils.BinTools;

import java.nio.ByteBuffer;

public class UTXO extends StandardUTXO {

    private String _typeName = "UTXO";
    private String _typeID = null;

    public UTXO(){}

}
