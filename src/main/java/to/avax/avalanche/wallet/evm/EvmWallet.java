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

package to.avax.avalanche.wallet.evm;

import org.apache.commons.codec.binary.Hex;

import org.bitcoinj.core.ECKey;

public class EvmWallet extends EvmWalletReadonly{
    private byte[] privateKey;
    private ECKey btcPair;

    public EvmWallet(byte[] key) {
        this.btcPair = ECKey.fromPrivate(key);
        var pubKey = this.btcPair.getPubKey();
        super.init(pubKey);
        this.privateKey = key;
    }

    public String getPrivateKeyHex() {
        return Hex.encodeHexString(this.privateKey);
    }
}
