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

import lombok.Data;
import to.avax.avalanche.common.apibase.APIBase;

import java.util.HashMap;
import java.util.Map;

@Data
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


}
