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

package to.avax.avalanche;

import to.avax.avalanche.common.apibase.APIBase;
import java.util.HashMap;
import java.util.Map;


public class AvalancheCore {
    protected int networkID;
    protected String hrp;
    protected String protocol;
    protected String ip;
    protected String host;
    protected int port;
    protected String baseEndpoint;
    protected String url;
    protected String auth;
    protected Map<String, String> headers;

    protected Map<String, APIBase> apis;

    public void setAddress(String host, int port, String protocol, String baseEndpoint){
        this.protocol = protocol;
        this.ip = host;
        this.host = host;
        this.port = port;
        this.baseEndpoint = baseEndpoint;
        this.url = protocol + "://" + host + ":" + port + baseEndpoint;
        this.auth = "";
        this.headers = new HashMap<>();
    }

    public void removeHeader(String key) {
        this.headers.remove(key);
    }
    public void removeAllHeaders() {
        this.headers = new HashMap<>();
    }

    public <GA extends APIBase> GA addAPI(
    String apiName,
    GA api,
    String baseurl,
    Object ...args) {
        this.apis.put(apiName, api);
        return api;
    }

    public APIBase api(String apiName) {
        return this.apis.get(apiName);
    }


    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public String getHrp() {
        return hrp;
    }

    public void setHrp(String hrp) {
        this.hrp = hrp;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getBaseEndpoint() {
        return baseEndpoint;
    }

    public void setBaseEndpoint(String baseEndpoint) {
        this.baseEndpoint = baseEndpoint;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, APIBase> getApis() {
        return apis;
    }

    public void setApis(Map<String, APIBase> apis) {
        this.apis = apis;
    }
}
