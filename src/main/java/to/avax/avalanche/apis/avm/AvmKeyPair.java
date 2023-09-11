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

import to.avax.avalanche.crypto.AvmDigest;
import to.avax.avalanche.crypto.KeyPair;

public class AvmKeyPair extends KeyPair {
    protected String chainID;
    protected String hrp;

    public AvmKeyPair(String hrp, String chainID) {
        super();
        this.chainID = chainID;
        this.hrp = hrp;
    }

    public static byte[] addressFromPublicKey(byte[] publicKey) {

        if (publicKey.length == 33) {
            return AvmDigest.sha256ripemd160(publicKey);
        }

        if (publicKey.length == 65) {
            byte[] ret = new byte[66];
            System.arraycopy(publicKey, 0, ret, 1, 65);
            return ret;
        }

        throw new RuntimeException("Invalid public key length: " + publicKey.length);
    }
}
