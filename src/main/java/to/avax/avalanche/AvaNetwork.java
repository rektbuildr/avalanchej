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

package to.avax.avalanche;

public class AvaNetwork {

    public static int network_id = 0;
    String name;
    int id;
    String protocol;
    int port;
    String ip;
    int networkId;
    String url;
    String explorerUrl;
    String explorerSiteUrl;
    boolean readonly;
    boolean withCredentials = false;

    public AvaNetwork(String name,
                        String url,
                        int networkId,
                        String explorerUrl,
                        String explorerSiteUrl,
                        boolean readonly){
        this.id = network_id++;
        this.name = name;
        this.explorerUrl = explorerUrl;
        this.explorerSiteUrl = explorerSiteUrl;
        this.protocol = "http";
        this.port = 9650;
        this.ip = "localhost";
        this.url = url;
        this.updateURL(url);
        this.networkId = networkId;
        this.readonly = readonly;
    }

    public void updateURL(String url) {
        String[] split = url.split("://");
        this.protocol = split[0];

        if (split[1].indexOf(':') >= 0) {
            String[] urlSplit = split[1].split(":");
            String ip = urlSplit[0];
            String port = urlSplit[1];

            this.ip = ip;
            this.port = Integer.parseInt(port);
        } else {
            this.ip = split[1];
            if (this.protocol.equals("http")) {
                this.port = 80;
            } else {
                this.port = 443;
            }
        }
    }
    String etFullURL() {
        return this.protocol + "://${this.ip}:${this.port}";
    }

    String getWsUrlX(){
        String protocol = this.protocol.equals("https") ? "wss" : "ws";
        return protocol + "://${this.ip}:${this.port}/ext/bc/X/events";
    }

    String getWsUrlC() {
        String protocol = this.protocol == "https" ? "wss" : "ws";
        return protocol + "://${this.ip}:${this.port}/ext/bc/C/ws";
    }
}
