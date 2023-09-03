/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.apis.metrics;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class MetricsAPI extends JRPCAPI {
    public MetricsAPI() {
        super();
    }
    public MetricsAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
