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

import java.util.Map;

public abstract class AvalancheSerializable {
    protected String _typeName;
    protected int _typeID;
    protected int _codecID;

    /**
     * Used in serialization. TypeName is a string name for the type of object being output.
     */
    public String getTypeName() {
        return this._typeName;
    }

    /**
     * Used in serialization. Optional. TypeID is a number for the typeID of object being output.
     */
    public int getTypeID() {
        return this._typeID;
    }

    /**
     * Used in serialization. Optional. TypeID is a number for the typeID of object being output.
     */
    public int getCodecID() {
        return this._codecID;
    }

    public void deserialize(Map<String, Object> fields, SerializedEncoding encoding) {
    }

    /**
     * Convert value to type of [[SerializedType]] or [[SerializedEncoding]]
     *
     * @param value
     * @param encoding [[SerializedEncoding]]
     * @param intype [[SerializedType]]
     * @param outtype [[SerializedType]]
     * @param ...args remaining arguments
     * @returns type of [[SerializedType]] or [[SerializedEncoding]]

    public SerializedTypeOrEncoding decoder(String value,
                                            SerializedEncoding encoding,
                                            SerializedTypeOrEncoding intype,
                                            SerializedType outtype,
                                            Object[] args) {
        if (value == null) {
            throw new RuntimeException("Error - Serializable.decoder: value passed is undefined");
        }

        if (encoding != SerializedEncoding.DISPLAY) {
            intype = encoding;
        }

        byte[] vb = this.typeToBuffer(value, intype, args);
        return this.bufferToType(vb, outtype, args);
    }
     */
}
