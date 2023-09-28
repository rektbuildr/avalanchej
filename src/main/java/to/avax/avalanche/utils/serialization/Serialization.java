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

package to.avax.avalanche.utils.serialization;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import to.avax.avalanche.utils.BinTools;
import to.avax.avalanche.utils.HelperFunctions;
import to.avax.avalanche.wallet.Types;

import java.math.BigInteger;
import java.util.Base64;

public class Serialization {
    final private BinTools bintools;
    final private static Serialization instance;

    static {
        instance = new Serialization();
    }

    public static Serialization getInstance() {
        return instance;
    }

    public Serialization() {
        bintools = BinTools.getInstance();
    }

    /**
     * Convert {@link https://github.com/feross/buffer|Buffer} to [[SerializedType]]
     *
     * @param vb {@link https://github.com/feross/buffer|Buffer}
     * @param type [[SerializedType]]
     * @param ...args remaining arguments
     * @returns type of [[SerializedType]]
     */
    public Object bufferToType(byte[] vb, SerializedType type, Object...args) {
        if (type == SerializedType.BN) {
            return new BigInteger(Hex.encodeHexString(vb), 16);
        } else if (type == SerializedType.BUFFER) {
            if (args.length == 1 && args[0] instanceof Number) {
                StringBuilder sb = new StringBuilder();
                if (vb.length < (Integer)args[0] * 2) {
                    for (int i=0;i<((Integer)args[0]*2 - vb.length);i++) {
                        sb.append("0");
                    }
                }
                sb.append(Hex.encodeHexString(vb));
                try {
                    vb = Hex.decodeHex(sb.toString());
                } catch (DecoderException e) {
                    throw new RuntimeException(e);
                }
            }
            return vb;
        } else if (type == SerializedType.BECH32) {
            return BinTools.addressToString((String)args[0], (Types.ChainAlias)args[1], vb);
        } else if (type == SerializedType.NODEID) {
            return HelperFunctions.bufferToNodeIDString(vb);
        } else if (type == SerializedType.PRIVATEKEY) {
            return HelperFunctions.bufferToPrivateKeyString(vb);
        } else if (type == SerializedType.CB58) {
            return BinTools.cb58Encode(vb);
        } else if (type == SerializedType.BASE58) {
            return BinTools.bufferToB58(vb);
        } else if (type == SerializedType.BASE64) {
            return Base64.getEncoder().encode(vb);
        } else if (type == SerializedType.HEX) {
            return Hex.encodeHex(vb);
        } else if (type == SerializedType.DECIMALSTRING) {
            return new BigInteger(new String(vb));
        } else if (type == SerializedType.NUMBER) {
            return new BigInteger(vb);
        } else if (type == SerializedType.UTF8) {
            return Hex.encodeHexString(vb);
        }

        return null;
    }
}
