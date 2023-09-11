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
import to.avax.glacier.model.ProposerDetails;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Block
 */

public class Block {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("parentHash")
  private String parentHash = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockType")
  private String blockType = null;

  @JsonProperty("txCount")
  private BigDecimal txCount = null;

  @JsonProperty("transactions")
  private List<String> transactions = null;

  @JsonProperty("blockSizeBytes")
  private BigDecimal blockSizeBytes = null;

  @JsonProperty("proposerDetails")
  private ProposerDetails proposerDetails = null;

  public Block blockNumber(String blockNumber) {
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

  public Block blockHash(String blockHash) {
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

  public Block parentHash(String parentHash) {
    this.parentHash = parentHash;
    return this;
  }

   /**
   * Get parentHash
   * @return parentHash
  **/

  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public Block blockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
    return this;
  }

   /**
   * Get blockTimestamp
   * @return blockTimestamp
  **/

  public BigDecimal getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public Block blockType(String blockType) {
    this.blockType = blockType;
    return this;
  }

   /**
   * Get blockType
   * @return blockType
  **/

  public String getBlockType() {
    return blockType;
  }

  public void setBlockType(String blockType) {
    this.blockType = blockType;
  }

  public Block txCount(BigDecimal txCount) {
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

  public Block transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Block addTransactionsItem(String transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<String>();
    }
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

  public Block blockSizeBytes(BigDecimal blockSizeBytes) {
    this.blockSizeBytes = blockSizeBytes;
    return this;
  }

   /**
   * Get blockSizeBytes
   * @return blockSizeBytes
  **/

  public BigDecimal getBlockSizeBytes() {
    return blockSizeBytes;
  }

  public void setBlockSizeBytes(BigDecimal blockSizeBytes) {
    this.blockSizeBytes = blockSizeBytes;
  }

  public Block proposerDetails(ProposerDetails proposerDetails) {
    this.proposerDetails = proposerDetails;
    return this;
  }

   /**
   * Get proposerDetails
   * @return proposerDetails
  **/

  public ProposerDetails getProposerDetails() {
    return proposerDetails;
  }

  public void setProposerDetails(ProposerDetails proposerDetails) {
    this.proposerDetails = proposerDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.blockNumber, block.blockNumber) &&
        Objects.equals(this.blockHash, block.blockHash) &&
        Objects.equals(this.parentHash, block.parentHash) &&
        Objects.equals(this.blockTimestamp, block.blockTimestamp) &&
        Objects.equals(this.blockType, block.blockType) &&
        Objects.equals(this.txCount, block.txCount) &&
        Objects.equals(this.transactions, block.transactions) &&
        Objects.equals(this.blockSizeBytes, block.blockSizeBytes) &&
        Objects.equals(this.proposerDetails, block.proposerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockHash, parentHash, blockTimestamp, blockType, txCount, transactions, blockSizeBytes, proposerDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    parentHash: ").append(toIndentedString(parentHash)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockType: ").append(toIndentedString(blockType)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    blockSizeBytes: ").append(toIndentedString(blockSizeBytes)).append("\n");
    sb.append("    proposerDetails: ").append(toIndentedString(proposerDetails)).append("\n");
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
