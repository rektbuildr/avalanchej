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

import java.math.BigInteger;

public class EvmWalletReadonly {
    private BigInteger balance;
    private String address;
    private String publicKey;
    private byte[] publicKeyBuff;

    public void init(byte[] key) {
        this.publicKeyBuff = key;
    }
}
