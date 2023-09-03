package to.avax.avalanche.network;

import lombok.Data;

import java.net.MalformedURLException;
import java.net.URL;

@Data
public class AvaNetwork {
    private String name;
    private int id;
    private String protocol;
    private int port;
    private String ip;
    private int networkId;
    private String url;
    private String explorerUrl;
    private String explorerSiteUrl;
    private boolean readonly;
    private boolean withCredentials;

    public AvaNetwork(String name, String url, int networkId, String explorerUrl, String explorerSiteUrl, boolean readonly) {
        this.name = name;
        this.url = url;
        this.id = id;
        this.explorerUrl = explorerUrl;
        this.explorerSiteUrl = explorerSiteUrl;
        this.readonly = readonly;
        this.withCredentials = false;
        this.networkId = networkId;

        try {
            var uExplorerUrl = new URL(url);
            this.protocol = uExplorerUrl.getProtocol();
            this.ip = uExplorerUrl.getHost();
            this.port = uExplorerUrl.getPort();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
