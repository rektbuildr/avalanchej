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
}
