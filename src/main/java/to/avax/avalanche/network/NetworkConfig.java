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

import java.math.BigInteger;
import lombok.Data;


@Data
public class NetworkConfig {
    private String rawUrl;
    private NetworkProtocolType apiProtocol;
    private String apiIp;
    private int apiPort;
    private String explorerURL;
    private String explorerSiteURL;
    private int networkID;
    private int evmChainID;
    private String xChainID;
    private String pChainID;
    private String cChainID;
    private String avaxID;

    private NetworkConfigRpc rpcUrl;
}
