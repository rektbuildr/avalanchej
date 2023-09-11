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

package to.avax.avalanche.apis.admin;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class AdminAPI extends JRPCAPI {
    public AdminAPI() {
        super();
    }
    public AdminAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
