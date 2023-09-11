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
package to.avax.avalanche.common;

import to.avax.avalanche.AvalancheCore;
import lombok.Data;

@Data
public class APIBase {
    protected AvalancheCore core;
    protected String baseURL;

    public APIBase(AvalancheCore core, String baseURL) {
        this.core = core;
        this.baseURL = baseURL;
    }

    public APIBase() {

    }
}
