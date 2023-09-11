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

package to.avax.avalanche.apis.avm;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class AVMAPI extends JRPCAPI {
    public AVMAPI() {
        super();
    }
    public AVMAPI(AvalancheCore core, String baseURL, String blockchainID) {
        super(core, baseURL);
    }
}
