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
import java.util.ArrayList;
import java.util.List;

public class XChainVertex {
  @JsonProperty("vertexHash")
  private String vertexHash = null;

  @JsonProperty("parentHashes")
  private List<String> parentHashes = new ArrayList<String>();

  @JsonProperty("vertexHeight")
  private BigDecimal vertexHeight = null;

  @JsonProperty("vertexIndex")
  private BigDecimal vertexIndex = null;

  @JsonProperty("vertexTimestamp")
  private BigDecimal vertexTimestamp = null;

  @JsonProperty("txCount")
  private BigDecimal txCount = null;

  @JsonProperty("transactions")
  private List<String> transactions = new ArrayList<String>();

  @JsonProperty("vertexSizeBytes")
  private BigDecimal vertexSizeBytes = null;

  public XChainVertex vertexHash(String vertexHash) {
    this.vertexHash = vertexHash;
    return this;
  }

   /**
   * Get vertexHash
   * @return vertexHash
  **/

  public String getVertexHash() {
    return vertexHash;
  }

  public void setVertexHash(String vertexHash) {
    this.vertexHash = vertexHash;
  }

  public XChainVertex parentHashes(List<String> parentHashes) {
    this.parentHashes = parentHashes;
    return this;
  }

  public XChainVertex addParentHashesItem(String parentHashesItem) {
    this.parentHashes.add(parentHashesItem);
    return this;
  }

   /**
   * Get parentHashes
   * @return parentHashes
  **/

  public List<String> getParentHashes() {
    return parentHashes;
  }

  public void setParentHashes(List<String> parentHashes) {
    this.parentHashes = parentHashes;
  }

  public XChainVertex vertexHeight(BigDecimal vertexHeight) {
    this.vertexHeight = vertexHeight;
    return this;
  }

   /**
   * Get vertexHeight
   * @return vertexHeight
  **/

  public BigDecimal getVertexHeight() {
    return vertexHeight;
  }

  public void setVertexHeight(BigDecimal vertexHeight) {
    this.vertexHeight = vertexHeight;
  }

  public XChainVertex vertexIndex(BigDecimal vertexIndex) {
    this.vertexIndex = vertexIndex;
    return this;
  }

   /**
   * Get vertexIndex
   * @return vertexIndex
  **/

  public BigDecimal getVertexIndex() {
    return vertexIndex;
  }

  public void setVertexIndex(BigDecimal vertexIndex) {
    this.vertexIndex = vertexIndex;
  }

  public XChainVertex vertexTimestamp(BigDecimal vertexTimestamp) {
    this.vertexTimestamp = vertexTimestamp;
    return this;
  }

   /**
   * Get vertexTimestamp
   * @return vertexTimestamp
  **/

  public BigDecimal getVertexTimestamp() {
    return vertexTimestamp;
  }

  public void setVertexTimestamp(BigDecimal vertexTimestamp) {
    this.vertexTimestamp = vertexTimestamp;
  }

  public XChainVertex txCount(BigDecimal txCount) {
    this.txCount = txCount;
    return this;
  }

   /**
   * Get txCount
   * @return txCount
  **/

  public BigDecimal getTxCount() {
    return txCount;
  }

  public void setTxCount(BigDecimal txCount) {
    this.txCount = txCount;
  }

  public XChainVertex transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }

  public XChainVertex addTransactionsItem(String transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/

  public List<String> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<String> transactions) {
    this.transactions = transactions;
  }

  public XChainVertex vertexSizeBytes(BigDecimal vertexSizeBytes) {
    this.vertexSizeBytes = vertexSizeBytes;
    return this;
  }

   /**
   * Get vertexSizeBytes
   * @return vertexSizeBytes
  **/

  public BigDecimal getVertexSizeBytes() {
    return vertexSizeBytes;
  }

  public void setVertexSizeBytes(BigDecimal vertexSizeBytes) {
    this.vertexSizeBytes = vertexSizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainVertex xchainVertex = (XChainVertex) o;
    return Objects.equals(this.vertexHash, xchainVertex.vertexHash) &&
        Objects.equals(this.parentHashes, xchainVertex.parentHashes) &&
        Objects.equals(this.vertexHeight, xchainVertex.vertexHeight) &&
        Objects.equals(this.vertexIndex, xchainVertex.vertexIndex) &&
        Objects.equals(this.vertexTimestamp, xchainVertex.vertexTimestamp) &&
        Objects.equals(this.txCount, xchainVertex.txCount) &&
        Objects.equals(this.transactions, xchainVertex.transactions) &&
        Objects.equals(this.vertexSizeBytes, xchainVertex.vertexSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexHash, parentHashes, vertexHeight, vertexIndex, vertexTimestamp, txCount, transactions, vertexSizeBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainVertex {\n");
    
    sb.append("    vertexHash: ").append(toIndentedString(vertexHash)).append("\n");
    sb.append("    parentHashes: ").append(toIndentedString(parentHashes)).append("\n");
    sb.append("    vertexHeight: ").append(toIndentedString(vertexHeight)).append("\n");
    sb.append("    vertexIndex: ").append(toIndentedString(vertexIndex)).append("\n");
    sb.append("    vertexTimestamp: ").append(toIndentedString(vertexTimestamp)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    vertexSizeBytes: ").append(toIndentedString(vertexSizeBytes)).append("\n");
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
