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
package to.avax.avalanche.common.apibase;

import to.avax.avalanche.AvalancheCore;


public class APIBase {
    protected AvalancheCore core;
    protected String baseURL;

    public APIBase(AvalancheCore core, String baseURL) {
        this.core = core;
        this.baseURL = baseURL;
    }

    public APIBase() {

    }

    public AvalancheCore getCore() {
        return core;
    }

    public void setCore(AvalancheCore core) {
        this.core = core;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }
}
