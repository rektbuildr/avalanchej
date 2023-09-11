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

package to.avax.avalanche.apis.info;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class InfoAPI extends JRPCAPI {
    public InfoAPI() {
        super();
    }
    public InfoAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
