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
import to.avax.avalanche.apis.avm.outputs.TransferableOutput;
import to.avax.avalanche.common.tx.StandardBaseTx;
import to.avax.avalanche.utils.serialization.SerializedEncoding;

import java.util.Map;

public class BaseTx extends StandardBaseTx<KeyPair, KeyChain> {
    protected String _typeName = "Tx";
    protected int _codecID = AVMConstants.LATESTCODEC;
    protected int _typeID = this._codecID == 0 ? AVMConstants.BASETX : AVMConstants.BASETX_CODECONE;
    public BaseTx(Object ... args) {}
/*
    public void deserialize(Map<String, Object> fields, SerializedEncoding encoding) {
        super.deserialize(fields, encoding);

        this.outs = fields["outs"].map((TransferableOutput o) => {
            var newOut = new TransferableOutput();
            newOut.deserialize(o, encoding)
            return newOut
        })
        this.ins = fields["ins"].map((i: TransferableInput) => {
            let newIn: TransferableInput = new TransferableInput()
            newIn.deserialize(i, encoding)
            return newIn
        })
        this.numouts = serialization.decoder(
                this.outs.length.toString(),
                display,
                decimalString,
                buffer,
                4
        )
        this.numins = serialization.decoder(
                this.ins.length.toString(),
                display,
                decimalString,
                buffer,
                4
        )
    }
    public void deserialize(Object fields) {
        deserialize(fields, SerializedEncoding.HEX);
    }
    */

}
