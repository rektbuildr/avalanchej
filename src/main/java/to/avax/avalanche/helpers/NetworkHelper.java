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

package to.avax.avalanche.helpers;

import to.avax.avalanche.Avalanche;
import to.avax.avalanche.network.NetworkConfig;

public class NetworkHelper {
    public static Avalanche createAvalancheProvider(NetworkConfig config) {
        return new Avalanche(config.getApiIp(), config.getApiPort(), config.getApiProtocol(), config.getNetworkID());
    }
}
