package to.avax.avalanche.apis.platformvm.dto;

import java.util.List;

public class ValidatorsDTO {
    List<ValidatorDTO> validators;

    public List<ValidatorDTO> getValidators() {
        return validators;
    }

    public void setValidators(List<ValidatorDTO> validators) {
        this.validators = validators;
    }
}
