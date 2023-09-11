/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.wallet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import to.avax.bip32.HDKey;

@EqualsAndHashCode(callSuper=false)
@Data
public class HdWalletCore extends WalletCore {

    private String chainId;
    protected HdHelper internalHelper;
    protected HdHelper externalHelper;
    protected HdHelper platformHelper;
    protected HDKey accountNodeXP;
    protected HDKey ethHdNode;
    public boolean isHdReady;
    private String seed;

    private HDKey hdKey;

    public HdWalletCore(HDKey accountHdKey, HDKey ethHdNode, boolean isPublic) {
        super();
        this.init(accountHdKey, ethHdNode, isPublic);
        this.ethHdNode = ethHdNode;

    }
    public HdWalletCore() {
        super();
    }

    public void init(HDKey accountHdKey, HDKey ethHdNode, boolean isPublic) {
        this.internalHelper = new HdHelper("m/1", accountHdKey, Types.ChainAlias.X, isPublic);
        this.externalHelper = new HdHelper("m/0", accountHdKey, Types.ChainAlias.X, isPublic);
        this.platformHelper = new HdHelper("m/0", accountHdKey, Types.ChainAlias.P, isPublic);
        this.accountNodeXP = accountHdKey;
        this.ethHdNode = ethHdNode;
    }

    public String getCurrentAddressAvm() {
        return this.externalHelper.getCurrentAddress();
    }
}
