package to.avax.avalanche.apis.auth;

import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;

public class AuthAPI extends JRPCAPI {
    public AuthAPI() {
        super();
    }
    public AuthAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
    }
}
