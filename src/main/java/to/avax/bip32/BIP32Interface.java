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
package to.avax.bip32;

import java.math.BigInteger;

public interface BIP32Interface {

    boolean isNeutered();
    BIP32Interface neutered();
    String toBase58();
    String toWIF();
    BIP32Interface derive(BigInteger index);
    BIP32Interface deriveHardened(BigInteger index);
    BIP32Interface derive(String path);
    byte[] sign(byte[] hash, boolean lowR);
    boolean verify(byte[] hash, byte[] signature);

}

