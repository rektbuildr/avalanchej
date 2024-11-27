package to.avax.avalanche.apis.platformvm.dto;

import java.math.BigInteger;


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
    double delegationFee;
    double uptime;
    boolean connected;
    long delegatorCount;
    BigInteger delegatorWeight;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getTxID() {
        return txID;
    }

    public void setTxID(String txID) {
        this.txID = txID;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public BigInteger getStakeAmount() {
        return stakeAmount;
    }

    public void setStakeAmount(BigInteger stakeAmount) {
        this.stakeAmount = stakeAmount;
    }

    public OwnerDTO getRewardOwner() {
        return rewardOwner;
    }

    public void setRewardOwner(OwnerDTO rewardOwner) {
        this.rewardOwner = rewardOwner;
    }

    public OwnerDTO getValidationRewardOwner() {
        return validationRewardOwner;
    }

    public void setValidationRewardOwner(OwnerDTO validationRewardOwner) {
        this.validationRewardOwner = validationRewardOwner;
    }

    public OwnerDTO getDelegationRewardOwner() {
        return delegationRewardOwner;
    }

    public void setDelegationRewardOwner(OwnerDTO delegationRewardOwner) {
        this.delegationRewardOwner = delegationRewardOwner;
    }

    public BigInteger getPotentialReward() {
        return potentialReward;
    }

    public void setPotentialReward(BigInteger potentialReward) {
        this.potentialReward = potentialReward;
    }

    public BigInteger getAccruedDelegateeReward() {
        return accruedDelegateeReward;
    }

    public void setAccruedDelegateeReward(BigInteger accruedDelegateeReward) {
        this.accruedDelegateeReward = accruedDelegateeReward;
    }

    public double getDelegationFee() {
        return delegationFee;
    }

    public void setDelegationFee(double delegationFee) {
        this.delegationFee = delegationFee;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public long getDelegatorCount() {
        return delegatorCount;
    }

    public void setDelegatorCount(long delegatorCount) {
        this.delegatorCount = delegatorCount;
    }

    public BigInteger getDelegatorWeight() {
        return delegatorWeight;
    }

    public void setDelegatorWeight(BigInteger delegatorWeight) {
        this.delegatorWeight = delegatorWeight;
    }
}
