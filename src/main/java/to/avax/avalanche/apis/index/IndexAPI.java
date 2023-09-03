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

package to.avax.avalanche.apis.index;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class IndexAPI extends JRPCAPI {
    public IndexAPI() {
        super();
    }
    public IndexAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
