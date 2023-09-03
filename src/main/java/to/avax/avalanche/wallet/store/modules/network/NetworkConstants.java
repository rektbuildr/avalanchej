package to.avax.avalanche.wallet.store.modules.network;

import to.avax.avalanche.network.AvaNetwork;

public class NetworkConstants {
    public final static AvaNetwork MainnetConfig = new AvaNetwork(
        "Mainnet",
        "https://api.avax.network:443",
        1,
        "https://explorerapi.avax.network",
        "https://explorer-xp.avax.network",
        true
    );

    public final static AvaNetwork TestnetConfig = new AvaNetwork(
        "Fuji",
        "https://api.avax-test.network:443",
        5,
        "https://explorerapi.avax-test.network",
        "https://explorer-xp.avax-test.network",
        true
    );

}
