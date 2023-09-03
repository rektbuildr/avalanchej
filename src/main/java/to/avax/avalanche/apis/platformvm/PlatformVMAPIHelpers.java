package to.avax.avalanche.apis.platformvm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import to.avax.avalanche.apis.platformvm.dto.ValidatorsDTO;
import to.avax.avalanche.common.RequestResponseData;

public class PlatformVMAPIHelpers {
    public static ValidatorsDTO validatorsResponseToDTO(RequestResponseData rrd) {
        JsonNode data = rrd.getData();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.treeToValue(data, ValidatorsDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
