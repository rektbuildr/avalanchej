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

package to.avax.avalanche.wallet;

import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.wallet.DeterministicSeed;
import java.security.SecureRandom;
import java.util.List;


public class WalletFunctions {

    public static final int BITS = 256;

    public static byte[] generateSeed() {
        var seed = new byte[BITS / 8];
        var random = new SecureRandom();
        random.nextBytes(seed);
        return seed;
    }

    public static List<String> generateMnemonic() {
        byte[] entropy = generateSeed();
        MnemonicCode code = MnemonicCode.INSTANCE;
        try {
            List<String> words = code.toMnemonic(entropy);
            return words;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String generateMnemonicString() {
        return String.join(" ", generateMnemonic());
    }
}
