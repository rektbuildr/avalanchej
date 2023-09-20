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

import lombok.Data;
import java.math.BigInteger;

@Data
public class Constants {

    private static NetworkConfig mainnetConfig;
    private static NetworkConfig testnetConfig;
    private static NetworkConfig localnetConfig;

    private static NetworkConfig defaultConfig;

    static {

        // TODO review these values

        mainnetConfig = new NetworkConfig();
        mainnetConfig.setRawUrl("https://api.avax.network");
        mainnetConfig.setApiProtocol(NetworkProtocolType.HTTPS);
        mainnetConfig.setApiIp("api.avax.network");
        mainnetConfig.setApiPort(443);
        mainnetConfig.setExplorerURL("https://explorer.avax.network");
        mainnetConfig.setExplorerSiteURL("https://avax.network");
        mainnetConfig.setNetworkID(1);
        mainnetConfig.setEvmChainID(43114);
        mainnetConfig.setXChainID("2");
        mainnetConfig.setPChainID("3");
        mainnetConfig.setCChainID("4");
        mainnetConfig.setAvaxID("AVAX");
        mainnetConfig.setRpcUrl(new NetworkConfigRpc());
        mainnetConfig.getRpcUrl().setC("https://api.avax.network/ext/bc/C/rpc");
        mainnetConfig.getRpcUrl().setX("https://api.avax.network/ext/bc/X/rpc");
        mainnetConfig.getRpcUrl().setP("https://api.avax.network/ext/bc/P/rpc");


        testnetConfig = new NetworkConfig();
        testnetConfig.setRawUrl("https://api.avax-test.network");
        testnetConfig.setApiProtocol(NetworkProtocolType.HTTPS);
        testnetConfig.setApiIp("api.avax-test.network");
        testnetConfig.setApiPort(443);
        testnetConfig.setExplorerURL("https://explorer.avax-test.network");
        testnetConfig.setExplorerSiteURL("https://test.avax.network");
        testnetConfig.setNetworkID(2);
        testnetConfig.setEvmChainID(43113);
        testnetConfig.setXChainID("2");
        testnetConfig.setPChainID("3");
        testnetConfig.setCChainID("4");
        testnetConfig.setAvaxID("AVAX");
        testnetConfig.setRpcUrl(new NetworkConfigRpc());
        testnetConfig.getRpcUrl().setC("https://api.avax-test.network/ext/bc/C/rpc");
        testnetConfig.getRpcUrl().setX("https://api.avax-test.network/ext/bc/X/rpc");
        testnetConfig.getRpcUrl().setP("https://api.avax-test.network/ext/bc/P/rpc");

        localnetConfig = new NetworkConfig();
        localnetConfig.setRawUrl("http://localhost:9650");
        localnetConfig.setApiProtocol(NetworkProtocolType.HTTP);
        localnetConfig.setApiIp("localhost");
        localnetConfig.setApiPort(9650);
        localnetConfig.setNetworkID(12345);
        localnetConfig.setEvmChainID(43113);
        localnetConfig.setXChainID("2");
        localnetConfig.setPChainID("3");
        localnetConfig.setCChainID("4");
        localnetConfig.setAvaxID("AVAX");
        localnetConfig.setRpcUrl(new NetworkConfigRpc());
        localnetConfig.getRpcUrl().setC("https://api.avax-test.network/ext/bc/C/rpc");
        localnetConfig.getRpcUrl().setX("https://api.avax-test.network/ext/bc/X/rpc");
        localnetConfig.getRpcUrl().setP("https://api.avax-test.network/ext/bc/P/rpc");

        defaultConfig = mainnetConfig;
    }

    public static NetworkConfig getDefaultConfig() {
        return defaultConfig;
    }

    public static NetworkConfig getTestConfig() {
        return testnetConfig;
    }

}
