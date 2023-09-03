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

import java.io.IOException;
import java.math.BigDecimal;
/**
 * NativeTransaction
 */

public class NativeTransaction {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("blockIndex")
  private BigDecimal blockIndex = null;

  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("txStatus")
  private String txStatus = null;

  @JsonProperty("txType")
  private BigDecimal txType = null;

  @JsonProperty("gasLimit")
  private String gasLimit = null;

  @JsonProperty("gasUsed")
  private String gasUsed = null;

  @JsonProperty("gasPrice")
  private String gasPrice = null;

  @JsonProperty("nonce")
  private String nonce = null;

  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("method")
  private Method method = null;

  @JsonProperty("value")
  private String value = null;

  public NativeTransaction blockNumber(String blockNumber) {
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

  public NativeTransaction blockTimestamp(BigDecimal blockTimestamp) {
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

  public NativeTransaction blockHash(String blockHash) {
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

  public NativeTransaction blockIndex(BigDecimal blockIndex) {
    this.blockIndex = blockIndex;
    return this;
  }

   /**
   * The index at which the transaction occured in the block (0-indexed).
   * @return blockIndex
  **/

  public BigDecimal getBlockIndex() {
    return blockIndex;
  }

  public void setBlockIndex(BigDecimal blockIndex) {
    this.blockIndex = blockIndex;
  }

  public NativeTransaction txHash(String txHash) {
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

  public NativeTransaction txStatus(String txStatus) {
    this.txStatus = txStatus;
    return this;
  }

   /**
   * The transaction status, which is either 0 (failed) or 1 (successful).
   * @return txStatus
  **/

  public String getTxStatus() {
    return txStatus;
  }

  public void setTxStatus(String txStatus) {
    this.txStatus = txStatus;
  }

  public NativeTransaction txType(BigDecimal txType) {
    this.txType = txType;
    return this;
  }

   /**
   * The transaction type.
   * @return txType
  **/

  public BigDecimal getTxType() {
    return txType;
  }

  public void setTxType(BigDecimal txType) {
    this.txType = txType;
  }

  public NativeTransaction gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * The gas limit set for the transaction.
   * @return gasLimit
  **/

  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }

  public NativeTransaction gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * The amount of gas used.
   * @return gasUsed
  **/

  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public NativeTransaction gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * The gas price denominated by the number of decimals of the native token.
   * @return gasPrice
  **/

  public String getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }

  public NativeTransaction nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * The nonce used by the sender of the transaction.
   * @return nonce
  **/

  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public NativeTransaction from(RichAddress from) {
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

  public NativeTransaction to(RichAddress to) {
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

  public NativeTransaction method(Method method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/

  public Method getMethod() {
    return method;
  }

  public void setMethod(Method method) {
    this.method = method;
  }

  public NativeTransaction value(String value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeTransaction nativeTransaction = (NativeTransaction) o;
    return Objects.equals(this.blockNumber, nativeTransaction.blockNumber) &&
        Objects.equals(this.blockTimestamp, nativeTransaction.blockTimestamp) &&
        Objects.equals(this.blockHash, nativeTransaction.blockHash) &&
        Objects.equals(this.blockIndex, nativeTransaction.blockIndex) &&
        Objects.equals(this.txHash, nativeTransaction.txHash) &&
        Objects.equals(this.txStatus, nativeTransaction.txStatus) &&
        Objects.equals(this.txType, nativeTransaction.txType) &&
        Objects.equals(this.gasLimit, nativeTransaction.gasLimit) &&
        Objects.equals(this.gasUsed, nativeTransaction.gasUsed) &&
        Objects.equals(this.gasPrice, nativeTransaction.gasPrice) &&
        Objects.equals(this.nonce, nativeTransaction.nonce) &&
        Objects.equals(this.from, nativeTransaction.from) &&
        Objects.equals(this.to, nativeTransaction.to) &&
        Objects.equals(this.method, nativeTransaction.method) &&
        Objects.equals(this.value, nativeTransaction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, blockIndex, txHash, txStatus, txType, gasLimit, gasUsed, gasPrice, nonce, from, to, method, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeTransaction {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    blockIndex: ").append(toIndentedString(blockIndex)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    txStatus: ").append(toIndentedString(txStatus)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
