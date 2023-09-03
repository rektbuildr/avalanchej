/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.wallet.evm;

import lombok.Data;

import java.math.BigInteger;

@Data
public class EvmWalletReadonly {
    private BigInteger balance;
    private String address;
    private String publicKey;
    private byte[] publicKeyBuff;

    public void init(byte[] key) {
        this.publicKeyBuff = key;
    }
}
