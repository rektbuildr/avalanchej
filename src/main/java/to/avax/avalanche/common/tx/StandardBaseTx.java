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
import to.avax.avalanche.utils.serialization.AvalancheSerializable;
import to.avax.avalanche.utils.serialization.SerializedEncoding;

import java.util.Map;

public abstract class StandardBaseTx <KPClass extends StandardKeyPair, KCClass extends StandardKeyChain<KPClass>> extends AvalancheSerializable {
    protected String _typeName = "StandardBaseTx";
    protected String _typeID = null;
    protected byte[] networkID = new byte[4];
    protected byte[] blockchainID = new byte[32];
    protected byte[] numouts = new byte[4];
    protected StandardTransferableOutput[] outs;
    protected byte[] numins = new byte[4];
    protected StandardTransferableInput[] ins;
    protected byte[] memo = new byte[0];
/*
    public void deserialize(Map<String, Object> fields, SerializedEncoding encoding) {
        super.deserialize(fields, encoding);
        this.networkID = serialization.decoder(
                fields.get("networkID"),
                encoding,
                decimalString,
                buffer,
                4
        )
        this.blockchainID = serialization.decoder(
                fields["blockchainID"],
                encoding,
                cb58,
                buffer,
                32
        )
        this.memo = serialization.decoder(fields["memo"], encoding, hex, buffer)
    }
    public void deserialize(Object fields) {
        deserialize(fields, SerializedEncoding.HEX);
    }
    */

}
