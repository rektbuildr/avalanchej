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

import to.avax.bip32.HDKey;

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

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public HdHelper getInternalHelper() {
        return internalHelper;
    }

    public void setInternalHelper(HdHelper internalHelper) {
        this.internalHelper = internalHelper;
    }

    public HdHelper getExternalHelper() {
        return externalHelper;
    }

    public void setExternalHelper(HdHelper externalHelper) {
        this.externalHelper = externalHelper;
    }

    public HdHelper getPlatformHelper() {
        return platformHelper;
    }

    public void setPlatformHelper(HdHelper platformHelper) {
        this.platformHelper = platformHelper;
    }

    public HDKey getAccountNodeXP() {
        return accountNodeXP;
    }

    public void setAccountNodeXP(HDKey accountNodeXP) {
        this.accountNodeXP = accountNodeXP;
    }

    public HDKey getEthHdNode() {
        return ethHdNode;
    }

    public void setEthHdNode(HDKey ethHdNode) {
        this.ethHdNode = ethHdNode;
    }

    public boolean isHdReady() {
        return isHdReady;
    }

    public void setHdReady(boolean hdReady) {
        isHdReady = hdReady;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public HDKey getHdKey() {
        return hdKey;
    }

    public void setHdKey(HDKey hdKey) {
        this.hdKey = hdKey;
    }
}
