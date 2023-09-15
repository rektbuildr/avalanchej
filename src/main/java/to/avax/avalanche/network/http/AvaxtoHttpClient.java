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

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.BasicHttpClientResponseHandler;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AvaxtoHttpClient {
    private final static CloseableHttpClient httpclient;
    private static final Logger logger = LoggerFactory.getLogger(AvaxtoHttpClient.class);

    static {
        httpclient = HttpClients.createDefault();
    }

    public static CloseableHttpClient getClient() {
        return httpclient;
    }

    public static Optional<String> fetchString(CloseableHttpClient httpclient, String url, Map<String, String> headers) {

        String resultContent;
        HttpGet httpGet = new HttpGet(url);

        if (headers != null) {
            for (String k : headers.keySet()) {
                httpGet.addHeader(k, headers.get(k));
            }
        }

        try {
            resultContent = httpclient.execute(httpGet, new BasicHttpClientResponseHandler());
        } catch (IOException e) {
            logger.error("Error fetching url: {} {}", url, e.getMessage());
            return Optional.empty();
        }

        return Optional.of(resultContent);

    }

    public static List<? extends NameValuePair> mapToNameValuePairs(Map<String, String> map) {
        return map.entrySet().stream().
                map(x -> new BasicNameValuePair(x.getKey(), x.getValue())).toList();
    }

    public static BasicHeader[] mapToHeaders(Map<String, String> map) {
        return (BasicHeader[])map.entrySet().stream().
                map(x -> new BasicHeader(x.getKey(), x.getValue())).toArray();
    }


    public static String post(String url, Map<String, String> params, Map<String, String> headers) {
        HttpPost hp = new HttpPost(url);

        List<? extends NameValuePair> paramList = mapToNameValuePairs(params);
        hp.setEntity(new UrlEncodedFormEntity(paramList));
        if (headers != null) {
            BasicHeader[] headerList = mapToHeaders(headers);
            hp.setHeaders(headerList);
        }

        try {
            return getClient().execute(hp, new BasicHttpClientResponseHandler());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String postJSON(String url, JsonNode params, Map<String, String> headers) {
        HttpPost hp = new HttpPost(url);
        hp.setHeader("Content-type", "application/json");
        hp.setHeader("Accept", "application/json");

        BasicHeader[] headerList = mapToHeaders(headers);
        hp.setEntity(new StringEntity(params.toString()));
        hp.setHeaders(headerList);
        try {
            return getClient().execute(hp, new BasicHttpClientResponseHandler());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static Optional<JsonNode> fetchJson(CloseableHttpClient httpclient, String url, Map<String, String> headers) {
        
        return fetchString(httpclient, url, headers).map(s -> {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(s, JsonNode.class);
            } catch (Throwable e) {
                e.printStackTrace();
                return null;
            }
        });
    }    
 
}
