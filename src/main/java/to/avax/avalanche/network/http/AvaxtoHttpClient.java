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

package to.avax.avalanche.network.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import java.util.Map;
import java.util.Optional;

public class AvaxtoHttpClient {
    private static CloseableHttpClient httpclient;
    private static final Logger logger = LoggerFactory.getLogger(AvaxtoHttpClient.class);

    static {
        httpclient = HttpClients.createDefault();
    }

    public static CloseableHttpClient getClient() {
        return httpclient;
    }

    public static Optional<String> fetchString(CloseableHttpClient httpclient, String url, Map<String, String> headers) {

        String resultContent = null;
        HttpGet httpGet = new HttpGet(url);

        if (headers != null) {
            for (String k : headers.keySet()) {
                httpGet.addHeader(k, headers.get(k));
            }
        }

        try (CloseableHttpResponse response = httpclient.execute(httpGet)) {

            HttpEntity entity = response.getEntity();
            // Get response information
            resultContent = EntityUtils.toString(entity);
        } catch (Exception e) {
            logger.error("Error fetching url: {} {}", url, e.getMessage());
            return Optional.empty();
        }

        return Optional.of(resultContent);

    }


    public static Optional<JsonNode> fetchJson(CloseableHttpClient httpclient, String url, Map<String, String> headers) {
        
        return fetchString(httpclient, url, headers).map(s -> {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readValue(s, JsonNode.class);
                return jsonNode;
            } catch (Throwable e) {
                e.printStackTrace();
                return null;
            }
        }).filter(x -> x != null);
    }    
 
}
