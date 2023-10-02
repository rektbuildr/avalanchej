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

package to.avax.avalanche.utils;

import java.nio.ByteBuffer;

/*
* A wrapper around byte[], ByteBuffer and Data IO Streams made as close as possible to the AvalancheJS Buffer interface
* */
public class Buffer  {
    private ByteBuffer _bf;
    private final static short BYTE_MASK = 0xFF;
    private final static long SHORT_MASK = 0xFFFFL;
    private final static long INT_MASK = 0xFFFFFFFFL;
    private final static long LONG_MASK = 0xFFFFFFFFFFFFFFFFL;

    public static Buffer allocate(int capacity){
        Buffer b = new Buffer();
        b._bf = ByteBuffer.allocate(capacity);
        return b;
    }
    public static Buffer alloc(int capacity) {
        return allocate(capacity);
    }
    public static Buffer wrap(byte[] b) {
        Buffer buf = new Buffer();
        buf._bf = ByteBuffer.wrap(b);
        return buf;
    }
    public int writeUInt8(int inValue, int offset){
        byte b = (byte)(inValue & BYTE_MASK);
        _bf.put(b);
        return _bf.arrayOffset();
    }
    public int writeUInt8(int inValue){
        return writeUInt8(inValue, 0);
    }
    public int writeUInt32BE(int inValue, int offset){
        long b = (int)(inValue & INT_MASK);
        _bf.putInt((int)b);
        return _bf.arrayOffset();
    }
    public int writeUInt32BE(int inValue){
        return writeUInt32BE(inValue, 0);

    }
}
