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

import to.avax.avalanche.common.keychain.StandardKeyChain;
import to.avax.avalanche.common.secp256k1.SECP256k1KeyChain;

public class KeyChain extends SECP256k1KeyChain<KeyPair> {
    @Override
    protected KeyPair makeKey() {
        return null;
    }

    @Override
    protected KeyPair importKey(byte[] privk) {
        return null;
    }

    @Override
    protected StandardKeyChain create(Object... args) {
        return null;
    }

    @Override
    protected StandardKeyChain clone() {
        return null;
    }

    @Override
    protected StandardKeyChain union(StandardKeyChain kc) {
        return null;
    }
}
