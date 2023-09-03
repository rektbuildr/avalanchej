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

package to.avax.avalanche.wallet;

public class Types {
    public enum ChainAlias {
        X, P;

        public String toString() {
            return this.name().toUpperCase();
        }
    }
    public enum ExportChainsX { P, C }
    public enum ExportChainsP { X, C }
    public enum ExportChainsC  { X, P }

    public enum HdChainType { X, P }

    public enum WalletNameType  { mnemonic, ledger, singleton, xpub }
}
