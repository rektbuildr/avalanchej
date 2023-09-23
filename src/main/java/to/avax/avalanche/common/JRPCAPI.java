package to.avax.avalanche.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.StringEntity;
import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.apibase.APIBase;


public class JRPCAPI extends APIBase {
    private CloseableHttpClient client;
    protected String jrpcVersion = "2.0";
    protected int rpcID = 1;
    public JRPCAPI() {
        super();
    }

    public JRPCAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
        this.client = HttpClients.createDefault();
        this.baseURL = baseURL;
    }
    public JRPCAPI(String url) {
        this.client = HttpClients.createDefault();
        this.baseURL = url;
    }

    public RequestResponseData callMethod(String method, Map<String, Object> params) {
        return callMethod(method, params, this.baseURL, null);
    }

    public RequestResponseData callMethod(String method, Map<String, Object> params, String baseURL, Map<String, String> headers){
        RequestResponseData rrd = new RequestResponseData();
        if (headers == null)  {
            headers = new HashMap<>();
        }

        try {

            URL u = new URL(baseURL);

            HttpPost httpPost = new HttpPost(baseURL);
            httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");

            String json = "{\"jsonrpc\":\"" + this.jrpcVersion + "\",\"id\":" + this.rpcID + ",\"method\":\"" + method + "\",\"params\":" + new ObjectMapper().writeValueAsString(params) + "}";

            HttpEntity postBody = new StringEntity(json);
            httpPost.setEntity(postBody);

            CloseableHttpResponse httpResponse = this.client.execute(httpPost);
            BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));

            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();

            ObjectMapper om = new ObjectMapper();
            JsonNode jsn = om.readTree(response.toString());

            rrd.setData(jsn.path("result"));
            rrd.setStatus(200);
            rrd.setHeaders(headers);

        } catch (IOException e) {
            rrd.setData(null);
            rrd.setStatus(503);
            rrd.setStatusText(e.getMessage());
            e.printStackTrace();
        }
        return rrd;
    }

}
