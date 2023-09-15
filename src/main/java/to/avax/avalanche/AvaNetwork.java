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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import to.avax.avalanche.network.http.AvaxtoHttpClient;

import java.util.Map;

@Getter
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

    public AvaNetwork(String name,
                        String url,
                        int networkId,
                        String explorerUrl,
                        String explorerSiteUrl,
                        boolean readonly) {

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

    public boolean testConnection() {

        ObjectMapper om = new ObjectMapper();
        JsonNode json = om.valueToTree(Map.of(
                "jsonrpc", "2.0",
                "id", 1,
                "method", "info.getNetworkID"
        ));

        String ret = AvaxtoHttpClient.postJSON(
            this.url + "/ext/info",
            json,
            Map.of()
        );

        System.out.println(ret);
        return true;
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
        return this.protocol + "://" + this.ip + ":" + this.port;
    }

    String getWsUrlX(){
        String protocol = this.protocol.equals("https") ? "wss" : "ws";
        return protocol + "://" + this.ip + ":" + this.port + "/ext/bc/X/events";
    }

    String getWsUrlC() {
        String protocol = this.protocol.equals("https") ? "wss" : "ws";
        return protocol + "://" + this.ip + ":" + this.port + "/ext/bc/C/ws";
    }
}
