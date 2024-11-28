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

package to.avax.avalanche.network;


import to.avax.avalanche.Avalanche;
import static to.avax.avalanche.helpers.NetworkHelper.createAvalancheProvider;
import static to.avax.avalanche.network.Constants.getDefaultConfig;
import static to.avax.avalanche.network.Constants.getTestConfig;


public class Network {
    private static Avalanche avalanche;
    private static Avalanche fuji;
    private static NetworkConfig defaultConfig;

    static {
        avalanche = createAvalancheProvider(getDefaultConfig());
        fuji = createAvalancheProvider(getTestConfig());
    }

    public static Avalanche getAvalanche() {
        return avalanche;
    }

    public static Avalanche getFuji() {
        return fuji;
    }

    public static void setAvalanche(Avalanche avalanche) {
        Network.avalanche = avalanche;
    }

    public static void setFuji(Avalanche fuji) {
        Network.fuji = fuji;
    }

    public static NetworkConfig getDefaultConfig() {
        return defaultConfig;
    }

    public static void setDefaultConfig(NetworkConfig defaultConfig) {
        Network.defaultConfig = defaultConfig;
    }
}
