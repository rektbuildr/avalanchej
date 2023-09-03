package to.avax.avalanche.apis.platformvm.dto;

import lombok.Data;
import java.math.BigInteger;

@Data
public class ValidatorDTO {
    String txID;
    long startTime;
    long endTime;
    BigInteger weight;
    String nodeID;
    BigInteger stakeAmount;
    OwnerDTO rewardOwner;
    OwnerDTO validationRewardOwner;
    OwnerDTO delegationRewardOwner;
    BigInteger potentialReward;
    BigInteger accruedDelegateeReward;
    float delegationFee;
    float uptime;
    boolean connected;
    long delegatorCount;
    BigInteger delegatorWeight;

}
