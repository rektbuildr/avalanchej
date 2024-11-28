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

import to.avax.avalanche.apis.avm.keychain.KeyPair;
import to.avax.avalanche.crypto.KeyChain;
import to.avax.avalanche.crypto.UTXOSet;
import to.avax.avalanche.utils.BinTools;
import to.avax.bip32.HDKey;

import static to.avax.avalanche.network.Network.getAvalanche;
import static to.avax.avalanche.utils.HelperFunctions.getPreferredHRP;

public class HdHelper {

    public final int  INDEX_RANGE = 20; // a gap of at least 20 indexes is needed to claim an index unused
    public final int  SCAN_SIZE = 100; // the total number of utxos to look at initially to calculate last index
    public final int  SCAN_RANGE = SCAN_SIZE - INDEX_RANGE; // How many items are actually scanned
    Types.ChainAlias chainId;
    KeyChain keyChain;
    protected int hdIndex;
    protected HDKey masterKey;
    private String changePath;
    private KeyPair avmAddrFactory;
    private UTXOSet utxoSet;
    private boolean isPublic;
    private boolean isFetchUtxo;
    private boolean isInit;


    public HdHelper(String changePath, HDKey masterKey, Types.ChainAlias chainId, boolean isPublic) {
        this.isFetchUtxo = false;
        this.isInit = false;
        this.hdIndex = 0;
        this.changePath = changePath;
        this.masterKey = masterKey;
        String hrp = getPreferredHRP(getAvalanche().getNetworkID());
        this.avmAddrFactory = new KeyPair(hrp, "X");
        this.isPublic = isPublic;
        this.chainId = chainId;
    }

    public int increment() {
        this.hdIndex++;
        return hdIndex;
    }

    public String getAddressX() {
        return getAddressForIndex(hdIndex);
    }

    public String getAddressP() { // TODO refazer
        return getAddressForIndex(hdIndex);
    }

    public String getAddressForIndex(int index) {
        return getAddressForIndex(index, getAvalanche().getNetworkID());
    }

    public String getAddressForIndex(int index, int networkId) {
        var key = this.getHdKeyForIndex(index);
        var publicKey = key.getPublicKey();
        var addrBuf = KeyPair.addressFromPublicKey(publicKey);
        var hrp = getPreferredHRP(networkId);
        var addr = BinTools.addressToString(hrp, this.chainId, addrBuf);
        return addr;
    }
    private HDKey getHdKeyForIndex(int index) {
        String path = String.format("%s/%d", this.changePath, index);
        HDKey key = this.masterKey.derive(path);
        return key;
    }

    public String getCurrentAddress() {

        return getAddressForIndex(this.hdIndex);
    }

    public int getINDEX_RANGE() {
        return INDEX_RANGE;
    }

    public int getSCAN_SIZE() {
        return SCAN_SIZE;
    }

    public int getSCAN_RANGE() {
        return SCAN_RANGE;
    }

    public Types.ChainAlias getChainId() {
        return chainId;
    }

    public void setChainId(Types.ChainAlias chainId) {
        this.chainId = chainId;
    }

    public KeyChain getKeyChain() {
        return keyChain;
    }

    public void setKeyChain(KeyChain keyChain) {
        this.keyChain = keyChain;
    }

    public int getHdIndex() {
        return hdIndex;
    }

    public void setHdIndex(int hdIndex) {
        this.hdIndex = hdIndex;
    }

    public HDKey getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(HDKey masterKey) {
        this.masterKey = masterKey;
    }

    public String getChangePath() {
        return changePath;
    }

    public void setChangePath(String changePath) {
        this.changePath = changePath;
    }

    public KeyPair getAvmAddrFactory() {
        return avmAddrFactory;
    }

    public void setAvmAddrFactory(KeyPair avmAddrFactory) {
        this.avmAddrFactory = avmAddrFactory;
    }

    public UTXOSet getUtxoSet() {
        return utxoSet;
    }

    public void setUtxoSet(UTXOSet utxoSet) {
        this.utxoSet = utxoSet;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isFetchUtxo() {
        return isFetchUtxo;
    }

    public void setFetchUtxo(boolean fetchUtxo) {
        isFetchUtxo = fetchUtxo;
    }

    public boolean isInit() {
        return isInit;
    }

    public void setInit(boolean init) {
        isInit = init;
    }
}
