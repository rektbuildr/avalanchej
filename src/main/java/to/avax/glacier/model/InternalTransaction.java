/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
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
import to.avax.glacier.model.InternalTransactionOpCall;
import to.avax.glacier.model.RichAddress;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * InternalTransaction
 */

public class InternalTransaction {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("internalTxType")
  private InternalTransactionOpCall internalTxType = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("isReverted")
  private Boolean isReverted = null;

  @JsonProperty("gasUsed")
  private String gasUsed = null;

  @JsonProperty("gasLimit")
  private String gasLimit = null;

  public InternalTransaction blockNumber(String blockNumber) {
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

  public InternalTransaction blockTimestamp(BigDecimal blockTimestamp) {
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

  public InternalTransaction blockHash(String blockHash) {
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

  public InternalTransaction txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The transaction hash identifier.
   * @return txHash
  **/

  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public InternalTransaction from(RichAddress from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/

  public RichAddress getFrom() {
    return from;
  }

  public void setFrom(RichAddress from) {
    this.from = from;
  }

  public InternalTransaction to(RichAddress to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/

  public RichAddress getTo() {
    return to;
  }

  public void setTo(RichAddress to) {
    this.to = to;
  }

  public InternalTransaction internalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
    return this;
  }

   /**
   * Get internalTxType
   * @return internalTxType
  **/

  public InternalTransactionOpCall getInternalTxType() {
    return internalTxType;
  }

  public void setInternalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
  }

  public InternalTransaction value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InternalTransaction isReverted(Boolean isReverted) {
    this.isReverted = isReverted;
    return this;
  }

   /**
   * True if the internal transaction was reverted.
   * @return isReverted
  **/

  public Boolean isIsReverted() {
    return isReverted;
  }

  public void setIsReverted(Boolean isReverted) {
    this.isReverted = isReverted;
  }

  public InternalTransaction gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/

  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public InternalTransaction gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Get gasLimit
   * @return gasLimit
  **/

  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTransaction internalTransaction = (InternalTransaction) o;
    return Objects.equals(this.blockNumber, internalTransaction.blockNumber) &&
        Objects.equals(this.blockTimestamp, internalTransaction.blockTimestamp) &&
        Objects.equals(this.blockHash, internalTransaction.blockHash) &&
        Objects.equals(this.txHash, internalTransaction.txHash) &&
        Objects.equals(this.from, internalTransaction.from) &&
        Objects.equals(this.to, internalTransaction.to) &&
        Objects.equals(this.internalTxType, internalTransaction.internalTxType) &&
        Objects.equals(this.value, internalTransaction.value) &&
        Objects.equals(this.isReverted, internalTransaction.isReverted) &&
        Objects.equals(this.gasUsed, internalTransaction.gasUsed) &&
        Objects.equals(this.gasLimit, internalTransaction.gasLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, txHash, from, to, internalTxType, value, isReverted, gasUsed, gasLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransaction {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    internalTxType: ").append(toIndentedString(internalTxType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isReverted: ").append(toIndentedString(isReverted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
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
