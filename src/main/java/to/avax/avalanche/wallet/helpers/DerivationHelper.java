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
package to.avax.avalanche.wallet.helpers;
import to.avax.avalanche.wallet.Constants;

public class DerivationHelper {
    /**
     * Given an account number, returns the Avalanche account derivation path as a string
     * @param accountIndex
     */
    public static String getAccountPathAvalanche(int accountIndex) {
        if (accountIndex < 0) throw new Error("Account index can not be less than 0.");
        return String.format("%s/%d", Constants.AVAX_TOKEN_PATH, accountIndex);
    }

    /**
     * Returns the string `m/44'/60'/0'/0/n` where `n` is the account index.
     * @param accountIndex
     */
    public static String getAccountPathEVM(int accountIndex) {
        if (accountIndex < 0) throw new Error("Account index can not be less than 0.");
        return String.format("%s/0/%d", Constants.ETH_ACCOUNT_PATH, accountIndex);
    }
}
