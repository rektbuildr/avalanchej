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

import to.avax.avalanche.utils.CypherAES;

public class MnemonicPhrase extends CypherAES {

    public MnemonicPhrase(String mnemonic) {
        super(mnemonic);
    }
}
