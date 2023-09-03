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
package to.avax.bip32;

import java.math.BigInteger;

public class BIP32Network {
    public BigInteger number;
    public BigInteger priv;
    public BigInteger publ;
    public String messagePrefix;
    public String bech32;
    public BigInteger pubKeyHash;
    public BigInteger scriptHash;
}
