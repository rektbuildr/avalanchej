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

package to.avax.avalanche.apis.avm.keychain;

import to.avax.avalanche.common.keychain.StandardKeyPair;
import to.avax.avalanche.common.secp256k1.SECP256k1KeyPair;
import to.avax.avalanche.crypto.AvmDigest;

public class KeyPair extends SECP256k1KeyPair {
    protected String chainID;
    protected String hrp;

    public KeyPair(String hrp, String chainID) {
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

    @Override
    public void generateKey(byte[] entropy) {

    }

    @Override
    protected boolean importKey(byte[] privk) {
        return false;
    }

    @Override
    protected byte[] sign(byte[] msg) {
        return new byte[0];
    }

    @Override
    protected byte[] recover(byte[] msg, byte[] sig) {
        return new byte[0];
    }

    @Override
    protected boolean verify(byte[] msg, byte[] sig, byte[] pubk) {
        return false;
    }

    @Override
    protected String getPrivateKeyString() {
        return null;
    }

    @Override
    protected String getPublicKeyString() {
        return null;
    }

    @Override
    protected byte[] getAddress() {
        return new byte[0];
    }

    @Override
    protected String getAddressString() {
        return null;
    }

    @Override
    protected StandardKeyPair create(Object... args) {
        return null;
    }

    @Override
    protected StandardKeyPair clone() {
        return null;
    }
}
