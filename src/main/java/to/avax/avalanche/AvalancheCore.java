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
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@Data public class AvalancheCore {
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

    public void removeAllHeaders() {
        this.headers = new HashMap<>();
    }

}
