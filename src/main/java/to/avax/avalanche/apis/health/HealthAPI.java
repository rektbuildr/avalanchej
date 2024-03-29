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
package to.avax.avalanche.apis.health;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class HealthAPI extends JRPCAPI {
    public HealthAPI() {
        super();
    }
    public HealthAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
