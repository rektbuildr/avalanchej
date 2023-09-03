package to.avax.avalanche.apis.platformvm.dto;

import lombok.Data;
import java.util.List;

@Data
public class OwnerDTO {
    long locktime;
    long threshold;
    List<String> addresses;
}
