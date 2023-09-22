/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/
package to.avax.avalanche;

import lombok.Data;
import lombok.EqualsAndHashCode;
import to.avax.avalanche.apis.keystore.KeystoreAPI;
import to.avax.avalanche.apis.admin.AdminAPI;
import to.avax.avalanche.apis.auth.AuthAPI;
import to.avax.avalanche.apis.avm.AVMAPI;
import to.avax.avalanche.apis.evm.EVMAPI;
import to.avax.avalanche.apis.health.HealthAPI;
import to.avax.avalanche.apis.index.IndexAPI;
import to.avax.avalanche.apis.info.InfoAPI;
import to.avax.avalanche.apis.metrics.MetricsAPI;
import to.avax.avalanche.apis.platformvm.PlatformVMAPI;
import to.avax.avalanche.network.NetworkConfig;
import to.avax.avalanche.network.NetworkProtocolType;

@Data
@EqualsAndHashCode(callSuper=false)
public class Avalanche extends AvalancheCore {
    private AdminAPI adminAPI;
    private AuthAPI authAPI;
    private AVMAPI avmAPI;
    private EVMAPI evmAPI;
    private HealthAPI healthAPI;
    private IndexAPI indexAPI;
    private InfoAPI infoAPI;
    private MetricsAPI metricsAPI;
    private KeystoreAPI keystoreAPI;
    private PlatformVMAPI platformVMAPI;

    public Avalanche(String apiIp, int apiPort, NetworkProtocolType apiProtocol, int networkID,
                     String XChainID, String CChainID, String hrp, boolean skipinit) {
        super();
        this.url = apiProtocol + "://" + apiIp + ":" + apiPort;
        this.networkID = networkID;
        this.platformVMAPI = new PlatformVMAPI(this, this.url + "/ext/bc/P");
        this.avmAPI = new AVMAPI(this, this.url + "/ext/bc/X", XChainID);
        this.evmAPI = new EVMAPI(this, this.url + "/ext/bc/C/avax", CChainID);
        this.healthAPI = new HealthAPI(this, this.url + "/ext/health");
        this.indexAPI = new IndexAPI(this, this.url + "/ext/index/X/tx");
        this.infoAPI = new InfoAPI(this, this.url + "/ext/info");
        this.metricsAPI = new MetricsAPI(this, this.url + "/ext/metrics");
        this.keystoreAPI = new KeystoreAPI(this, this.url + "/ext/keystore");
        this.adminAPI = new AdminAPI(this, this.url + "/ext/admin");
        this.authAPI = new AuthAPI(this, this.url + "/ext/auth");

    }

    public Avalanche(String apiIp, int apiPort, NetworkProtocolType apiProtocol, int networkID) {
        this(apiIp, apiPort, apiProtocol, networkID, "X", "C", "avax", false);
    }

    /*
    * On avalanche-wallet based projects AvaNetwork is the usual interface
    * */public Avalanche(AvaNetwork net) {
        this(net.getIp(), net.getPort(), NetworkProtocolType.of(net.getProtocol()), net.getNetworkId());
    }

    /*
    * NetworkConfig constructor is recommended over AvaNetwork for new projects
    * */
    public Avalanche(NetworkConfig net) {
        this(net.getApiIp(), net.getApiPort(), NetworkProtocolType.of("https"), net.getNetworkID());
    }

    public Avalanche(){
        super();
    }

}
