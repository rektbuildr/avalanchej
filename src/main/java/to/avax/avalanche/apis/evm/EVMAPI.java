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
package to.avax.avalanche.apis.evm;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class EVMAPI extends JRPCAPI {
    public EVMAPI() {
        super();
    }
    public EVMAPI(AvalancheCore core, String baseURL, String blockchainID) {
        super(core, baseURL);
    }
}
