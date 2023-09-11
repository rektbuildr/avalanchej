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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.Arrays;
import java.io.IOException;
import java.math.BigDecimal;

public class GetBlockResponse {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("txCount")
  private BigDecimal txCount = null;

  @JsonProperty("atomicTxCount")
  private BigDecimal atomicTxCount = null;

  @JsonProperty("baseFee")
  private String baseFee = null;

  @JsonProperty("gasUsed")
  private String gasUsed = null;

  @JsonProperty("gasLimit")
  private String gasLimit = null;

  @JsonProperty("gasCost")
  private String gasCost = null;

  @JsonProperty("parentHash")
  private String parentHash = null;

  @JsonProperty("feesSpent")
  private String feesSpent = null;

  @JsonProperty("cumulativeTransactions")
  private String cumulativeTransactions = null;

  public GetBlockResponse blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * The block number on the chain.
   * @return blockNumber
  **/
  
  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public GetBlockResponse blockTimestamp(BigDecimal blockTimestamp) {
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

  public GetBlockResponse blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * The block hash identifier.
   * @return blockHash
  **/
  
  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public GetBlockResponse txCount(BigDecimal txCount) {
    this.txCount = txCount;
    return this;
  }

   /**
   * The number of evm transactions in the block.
   * @return txCount
  **/
  public BigDecimal getTxCount() {
    return txCount;
  }

  public void setTxCount(BigDecimal txCount) {
    this.txCount = txCount;
  }

  public GetBlockResponse atomicTxCount(BigDecimal atomicTxCount) {
    this.atomicTxCount = atomicTxCount;
    return this;
  }

   /**
   * The number of atomic transactions in the block.
   * @return atomicTxCount
  **/
  public BigDecimal getAtomicTxCount() {
    return atomicTxCount;
  }

  public void setAtomicTxCount(BigDecimal atomicTxCount) {
    this.atomicTxCount = atomicTxCount;
  }

  public GetBlockResponse baseFee(String baseFee) {
    this.baseFee = baseFee;
    return this;
  }

   /**
   * The base gas fee for a transaction to be included in the block.
   * @return baseFee
  **/
  public String getBaseFee() {
    return baseFee;
  }

  public void setBaseFee(String baseFee) {
    this.baseFee = baseFee;
  }

  public GetBlockResponse gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * The gas used for transactions in the block.
   * @return gasUsed
  **/

  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public GetBlockResponse gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * The total gas limit set for transactions in the block.
   * @return gasLimit
  **/

  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }

  public GetBlockResponse gasCost(String gasCost) {
    this.gasCost = gasCost;
    return this;
  }

   /**
   * Get gasCost
   * @return gasCost
  **/

  public String getGasCost() {
    return gasCost;
  }

  public void setGasCost(String gasCost) {
    this.gasCost = gasCost;
  }

  public GetBlockResponse parentHash(String parentHash) {
    this.parentHash = parentHash;
    return this;
  }

   /**
   * The hash of the parent block.
   * @return parentHash
  **/

  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public GetBlockResponse feesSpent(String feesSpent) {
    this.feesSpent = feesSpent;
    return this;
  }

   /**
   * The amount of fees spent/burned for transactions in the block.
   * @return feesSpent
  **/

  public String getFeesSpent() {
    return feesSpent;
  }

  public void setFeesSpent(String feesSpent) {
    this.feesSpent = feesSpent;
  }

  public GetBlockResponse cumulativeTransactions(String cumulativeTransactions) {
    this.cumulativeTransactions = cumulativeTransactions;
    return this;
  }

   /**
   * The cumulative number of transactions for the chain including this block.
   * @return cumulativeTransactions
  **/

  public String getCumulativeTransactions() {
    return cumulativeTransactions;
  }

  public void setCumulativeTransactions(String cumulativeTransactions) {
    this.cumulativeTransactions = cumulativeTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockResponse getBlockResponse = (GetBlockResponse) o;
    return Objects.equals(this.blockNumber, getBlockResponse.blockNumber) &&
        Objects.equals(this.blockTimestamp, getBlockResponse.blockTimestamp) &&
        Objects.equals(this.blockHash, getBlockResponse.blockHash) &&
        Objects.equals(this.txCount, getBlockResponse.txCount) &&
        Objects.equals(this.atomicTxCount, getBlockResponse.atomicTxCount) &&
        Objects.equals(this.baseFee, getBlockResponse.baseFee) &&
        Objects.equals(this.gasUsed, getBlockResponse.gasUsed) &&
        Objects.equals(this.gasLimit, getBlockResponse.gasLimit) &&
        Objects.equals(this.gasCost, getBlockResponse.gasCost) &&
        Objects.equals(this.parentHash, getBlockResponse.parentHash) &&
        Objects.equals(this.feesSpent, getBlockResponse.feesSpent) &&
        Objects.equals(this.cumulativeTransactions, getBlockResponse.cumulativeTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, txCount, atomicTxCount, baseFee, gasUsed, gasLimit, gasCost, parentHash, feesSpent, cumulativeTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockResponse {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    atomicTxCount: ").append(toIndentedString(atomicTxCount)).append("\n");
    sb.append("    baseFee: ").append(toIndentedString(baseFee)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasCost: ").append(toIndentedString(gasCost)).append("\n");
    sb.append("    parentHash: ").append(toIndentedString(parentHash)).append("\n");
    sb.append("    feesSpent: ").append(toIndentedString(feesSpent)).append("\n");
    sb.append("    cumulativeTransactions: ").append(toIndentedString(cumulativeTransactions)).append("\n");
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
