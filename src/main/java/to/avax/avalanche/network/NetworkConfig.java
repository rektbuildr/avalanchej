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

package to.avax.avalanche.network;

import java.math.BigInteger;


public class NetworkConfig {
    private String rawUrl;
    private NetworkProtocolType apiProtocol;
    private String apiIp;
    private int apiPort;
    private String explorerURL;
    private String explorerSiteURL;
    private int networkID;
    private int evmChainID;
    private String xChainID;
    private String pChainID;
    private String cChainID;
    private String avaxID;

    private NetworkConfigRpc rpcUrl;

    public String getRawUrl() {
        return rawUrl;
    }

    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    public NetworkProtocolType getApiProtocol() {
        return apiProtocol;
    }

    public void setApiProtocol(NetworkProtocolType apiProtocol) {
        this.apiProtocol = apiProtocol;
    }

    public String getApiIp() {
        return apiIp;
    }

    public void setApiIp(String apiIp) {
        this.apiIp = apiIp;
    }

    public int getApiPort() {
        return apiPort;
    }

    public void setApiPort(int apiPort) {
        this.apiPort = apiPort;
    }

    public String getExplorerURL() {
        return explorerURL;
    }

    public void setExplorerURL(String explorerURL) {
        this.explorerURL = explorerURL;
    }

    public String getExplorerSiteURL() {
        return explorerSiteURL;
    }

    public void setExplorerSiteURL(String explorerSiteURL) {
        this.explorerSiteURL = explorerSiteURL;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public int getEvmChainID() {
        return evmChainID;
    }

    public void setEvmChainID(int evmChainID) {
        this.evmChainID = evmChainID;
    }

    public String getXChainID() {
        return xChainID;
    }

    public void setXChainID(String xChainID) {
        this.xChainID = xChainID;
    }

    public String getPChainID() {
        return pChainID;
    }

    public void setPChainID(String pChainID) {
        this.pChainID = pChainID;
    }

    public String getCChainID() {
        return cChainID;
    }

    public void setCChainID(String cChainID) {
        this.cChainID = cChainID;
    }

    public String getAvaxID() {
        return avaxID;
    }

    public void setAvaxID(String avaxID) {
        this.avaxID = avaxID;
    }

    public NetworkConfigRpc getRpcUrl() {
        return rpcUrl;
    }

    public void setRpcUrl(NetworkConfigRpc rpcUrl) {
        this.rpcUrl = rpcUrl;
    }
}
