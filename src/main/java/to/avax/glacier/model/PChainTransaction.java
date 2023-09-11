/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/
package to.avax.glacier.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.PChainAsset;
import to.avax.glacier.model.PChainConsumedUtxo;
import to.avax.glacier.model.PChainEmittedUtxo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * PChainTransaction
 */

public class PChainTransaction implements InlineResponse2001 {
  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("txType")
  private String txType = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("consumedUtxos")
  private List<PChainConsumedUtxo> consumedUtxos = null;

  @JsonProperty("emittedUtxos")
  private List<PChainEmittedUtxo> emittedUtxos = null;

  @JsonProperty("sourceChain")
  private String sourceChain = null;

  @JsonProperty("destinationChain")
  private String destinationChain = null;

  @JsonProperty("value")
  private List<PChainAsset> value = null;

  @JsonProperty("amountBurned")
  private List<PChainAsset> amountBurned = null;

  @JsonProperty("amountStaked")
  private List<PChainAsset> amountStaked = null;

  @JsonProperty("startTimestamp")
  private BigDecimal startTimestamp = null;

  @JsonProperty("endTimestamp")
  private BigDecimal endTimestamp = null;

  @JsonProperty("delegationFeePercent")
  private String delegationFeePercent = null;

  @JsonProperty("nodeId")
  private String nodeId = null;

  @JsonProperty("subnetId")
  private String subnetId = null;

  @JsonProperty("estimatedReward")
  private String estimatedReward = null;

  @JsonProperty("rewardTx")
  private String rewardTx = null;

  @JsonProperty("memo")
  private String memo = null;

  @JsonProperty("stakingTxHash")
  private String stakingTxHash = null;

  public PChainTransaction txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * A P-Chain transaction hash.
   * @return txHash
  **/

  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public PChainTransaction txType(String txType) {
    this.txType = txType;
    return this;
  }

   /**
   * Get txType
   * @return txType
  **/

  public String getTxType() {
    return txType;
  }

  public void setTxType(String txType) {
    this.txType = txType;
  }

  public PChainTransaction blockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
    return this;
  }

   /**
   * The block finality timestamp.
   * @return blockTimestamp
  **/

  public BigDecimal getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public PChainTransaction blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Get blockNumber
   * @return blockNumber
  **/

  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public PChainTransaction blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Get blockHash
   * @return blockHash
  **/

  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public PChainTransaction consumedUtxos(List<PChainConsumedUtxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
    return this;
  }

  public PChainTransaction addConsumedUtxosItem(PChainConsumedUtxo consumedUtxosItem) {
    if (this.consumedUtxos == null) {
      this.consumedUtxos = new ArrayList<PChainConsumedUtxo>();
    }
    this.consumedUtxos.add(consumedUtxosItem);
    return this;
  }

   /**
   * A list of objects containing consumed UTXO info pertaining to a given transaction.
   * @return consumedUtxos
  **/

  public List<PChainConsumedUtxo> getConsumedUtxos() {
    return consumedUtxos;
  }

  public void setConsumedUtxos(List<PChainConsumedUtxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
  }

  public PChainTransaction emittedUtxos(List<PChainEmittedUtxo> emittedUtxos) {
    this.emittedUtxos = emittedUtxos;
    return this;
  }

  public PChainTransaction addEmittedUtxosItem(PChainEmittedUtxo emittedUtxosItem) {
    if (this.emittedUtxos == null) {
      this.emittedUtxos = new ArrayList<PChainEmittedUtxo>();
    }
    this.emittedUtxos.add(emittedUtxosItem);
    return this;
  }

   /**
   * A list of objects containing emitted UTXO info pertaining to a given transaction.
   * @return emittedUtxos
  **/

  public List<PChainEmittedUtxo> getEmittedUtxos() {
    return emittedUtxos;
  }

  public void setEmittedUtxos(List<PChainEmittedUtxo> emittedUtxos) {
    this.emittedUtxos = emittedUtxos;
  }

  public PChainTransaction sourceChain(String sourceChain) {
    this.sourceChain = sourceChain;
    return this;
  }

   /**
   * Source chain for an atomic transaction.
   * @return sourceChain
  **/

  public String getSourceChain() {
    return sourceChain;
  }

  public void setSourceChain(String sourceChain) {
    this.sourceChain = sourceChain;
  }

  public PChainTransaction destinationChain(String destinationChain) {
    this.destinationChain = destinationChain;
    return this;
  }

   /**
   * Destination chain for an atomic transaction.
   * @return destinationChain
  **/

  public String getDestinationChain() {
    return destinationChain;
  }

  public void setDestinationChain(String destinationChain) {
    this.destinationChain = destinationChain;
  }

  public PChainTransaction value(List<PChainAsset> value) {
    this.value = value;
    return this;
  }

  public PChainTransaction addValueItem(PChainAsset valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<PChainAsset>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID.
   * @return value
  **/

  public List<PChainAsset> getValue() {
    return value;
  }

  public void setValue(List<PChainAsset> value) {
    this.value = value;
  }

  public PChainTransaction amountBurned(List<PChainAsset> amountBurned) {
    this.amountBurned = amountBurned;
    return this;
  }

  public PChainTransaction addAmountBurnedItem(PChainAsset amountBurnedItem) {
    if (this.amountBurned == null) {
      this.amountBurned = new ArrayList<PChainAsset>();
    }
    this.amountBurned.add(amountBurnedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID.
   * @return amountBurned
  **/

  public List<PChainAsset> getAmountBurned() {
    return amountBurned;
  }

  public void setAmountBurned(List<PChainAsset> amountBurned) {
    this.amountBurned = amountBurned;
  }

  public PChainTransaction amountStaked(List<PChainAsset> amountStaked) {
    this.amountStaked = amountStaked;
    return this;
  }

  public PChainTransaction addAmountStakedItem(PChainAsset amountStakedItem) {
    if (this.amountStaked == null) {
      this.amountStaked = new ArrayList<PChainAsset>();
    }
    this.amountStaked.add(amountStakedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Present for AddValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx
   * @return amountStaked
  **/

  public List<PChainAsset> getAmountStaked() {
    return amountStaked;
  }

  public void setAmountStaked(List<PChainAsset> amountStaked) {
    this.amountStaked = amountStaked;
  }

  public PChainTransaction startTimestamp(BigDecimal startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx
   * @return startTimestamp
  **/

  public BigDecimal getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(BigDecimal startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public PChainTransaction endTimestamp(BigDecimal endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx
   * @return endTimestamp
  **/

  public BigDecimal getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(BigDecimal endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public PChainTransaction delegationFeePercent(String delegationFeePercent) {
    this.delegationFeePercent = delegationFeePercent;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddPermissionlessValidatorTx
   * @return delegationFeePercent
  **/

  public String getDelegationFeePercent() {
    return delegationFeePercent;
  }

  public void setDelegationFeePercent(String delegationFeePercent) {
    this.delegationFeePercent = delegationFeePercent;
  }

  public PChainTransaction nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddSubnetValidatorTx, RemoveSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx
   * @return nodeId
  **/

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public PChainTransaction subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddSubnetValidatorTx, RemoveSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx, CreateChainTx, CreateSubnetTx
   * @return subnetId
  **/

  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public PChainTransaction estimatedReward(String estimatedReward) {
    this.estimatedReward = estimatedReward;
    return this;
  }

   /**
   * Present for AddValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx
   * @return estimatedReward
  **/

  public String getEstimatedReward() {
    return estimatedReward;
  }

  public void setEstimatedReward(String estimatedReward) {
    this.estimatedReward = estimatedReward;
  }

  public PChainTransaction rewardTx(String rewardTx) {
    this.rewardTx = rewardTx;
    return this;
  }

   /**
   * Get rewardTx
   * @return rewardTx
  **/

  public String getRewardTx() {
    return rewardTx;
  }

  public void setRewardTx(String rewardTx) {
    this.rewardTx = rewardTx;
  }

  public PChainTransaction memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public PChainTransaction stakingTxHash(String stakingTxHash) {
    this.stakingTxHash = stakingTxHash;
    return this;
  }

   /**
   * Present for RewardValidatorTx
   * @return stakingTxHash
  **/

  public String getStakingTxHash() {
    return stakingTxHash;
  }

  public void setStakingTxHash(String stakingTxHash) {
    this.stakingTxHash = stakingTxHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainTransaction pchainTransaction = (PChainTransaction) o;
    return Objects.equals(this.txHash, pchainTransaction.txHash) &&
        Objects.equals(this.txType, pchainTransaction.txType) &&
        Objects.equals(this.blockTimestamp, pchainTransaction.blockTimestamp) &&
        Objects.equals(this.blockNumber, pchainTransaction.blockNumber) &&
        Objects.equals(this.blockHash, pchainTransaction.blockHash) &&
        Objects.equals(this.consumedUtxos, pchainTransaction.consumedUtxos) &&
        Objects.equals(this.emittedUtxos, pchainTransaction.emittedUtxos) &&
        Objects.equals(this.sourceChain, pchainTransaction.sourceChain) &&
        Objects.equals(this.destinationChain, pchainTransaction.destinationChain) &&
        Objects.equals(this.value, pchainTransaction.value) &&
        Objects.equals(this.amountBurned, pchainTransaction.amountBurned) &&
        Objects.equals(this.amountStaked, pchainTransaction.amountStaked) &&
        Objects.equals(this.startTimestamp, pchainTransaction.startTimestamp) &&
        Objects.equals(this.endTimestamp, pchainTransaction.endTimestamp) &&
        Objects.equals(this.delegationFeePercent, pchainTransaction.delegationFeePercent) &&
        Objects.equals(this.nodeId, pchainTransaction.nodeId) &&
        Objects.equals(this.subnetId, pchainTransaction.subnetId) &&
        Objects.equals(this.estimatedReward, pchainTransaction.estimatedReward) &&
        Objects.equals(this.rewardTx, pchainTransaction.rewardTx) &&
        Objects.equals(this.memo, pchainTransaction.memo) &&
        Objects.equals(this.stakingTxHash, pchainTransaction.stakingTxHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, txType, blockTimestamp, blockNumber, blockHash, consumedUtxos, emittedUtxos, sourceChain, destinationChain, value, amountBurned, amountStaked, startTimestamp, endTimestamp, delegationFeePercent, nodeId, subnetId, estimatedReward, rewardTx, memo, stakingTxHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainTransaction {\n");
    
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    consumedUtxos: ").append(toIndentedString(consumedUtxos)).append("\n");
    sb.append("    emittedUtxos: ").append(toIndentedString(emittedUtxos)).append("\n");
    sb.append("    sourceChain: ").append(toIndentedString(sourceChain)).append("\n");
    sb.append("    destinationChain: ").append(toIndentedString(destinationChain)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    amountBurned: ").append(toIndentedString(amountBurned)).append("\n");
    sb.append("    amountStaked: ").append(toIndentedString(amountStaked)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    delegationFeePercent: ").append(toIndentedString(delegationFeePercent)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    estimatedReward: ").append(toIndentedString(estimatedReward)).append("\n");
    sb.append("    rewardTx: ").append(toIndentedString(rewardTx)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    stakingTxHash: ").append(toIndentedString(stakingTxHash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
