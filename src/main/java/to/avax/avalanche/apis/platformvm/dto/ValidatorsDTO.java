package to.avax.avalanche.apis.platformvm.dto;

import lombok.Data;
import java.util.List;

@Data
public class ValidatorsDTO {
    List<ValidatorDTO> validators;
}
