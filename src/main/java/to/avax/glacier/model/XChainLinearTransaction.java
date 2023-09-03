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
import to.avax.glacier.model.Asset;
import to.avax.glacier.model.Utxo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * XChainLinearTransaction
 */

public class XChainLinearTransaction implements InlineResponse2001, AnyOfListXChainTransactionsResponseTransactionsItems {
  @JsonProperty("txHash")
  private String txHash = null;

  /**
   * Represents container format this transaction is included in.
   */

  public enum ChainFormatEnum {
    LINEAR("linear"),
    NON_LINEAR("non-linear");

    private String value;

    ChainFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChainFormatEnum fromValue(String input) {
      for (ChainFormatEnum b : ChainFormatEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("chainFormat")
  private ChainFormatEnum chainFormat = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  @JsonProperty("txType")
  private String txType = null;

  @JsonProperty("memo")
  private String memo = null;

  @JsonProperty("consumedUtxos")
  private List<Utxo> consumedUtxos = new ArrayList<Utxo>();

  @JsonProperty("emittedUtxos")
  private List<Utxo> emittedUtxos = new ArrayList<Utxo>();

  @JsonProperty("amountUnlocked")
  private List<Asset> amountUnlocked = new ArrayList<Asset>();

  @JsonProperty("amountCreated")
  private List<Asset> amountCreated = new ArrayList<Asset>();

  @JsonProperty("sourceChain")
  private String sourceChain = null;

  @JsonProperty("destinationChain")
  private String destinationChain = null;

  @JsonProperty("assetCreated")
  private AllOfXChainLinearTransactionAssetCreated assetCreated = null;

  @JsonProperty("blockHeight")
  private BigDecimal blockHeight = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  public XChainLinearTransaction txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Unique ID for this transaction.
   * @return txHash
  **/

  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public XChainLinearTransaction chainFormat(ChainFormatEnum chainFormat) {
    this.chainFormat = chainFormat;
    return this;
  }

   /**
   * Represents container format this transaction is included in.
   * @return chainFormat
  **/

  public ChainFormatEnum getChainFormat() {
    return chainFormat;
  }

  public void setChainFormat(ChainFormatEnum chainFormat) {
    this.chainFormat = chainFormat;
  }

  public XChainLinearTransaction timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Latest timestamp in seconds this transaction was accepted out of the same transaction accepted in other vertices.
   * @return timestamp
  **/

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public XChainLinearTransaction txType(String txType) {
    this.txType = txType;
    return this;
  }

   /**
   * Type of transaction.
   * @return txType
  **/

  public String getTxType() {
    return txType;
  }

  public void setTxType(String txType) {
    this.txType = txType;
  }

  public XChainLinearTransaction memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Hex encoded memo bytes for this transaction.
   * @return memo
  **/

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public XChainLinearTransaction consumedUtxos(List<Utxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
    return this;
  }

  public XChainLinearTransaction addConsumedUtxosItem(Utxo consumedUtxosItem) {
    this.consumedUtxos.add(consumedUtxosItem);
    return this;
  }

   /**
   * Get consumedUtxos
   * @return consumedUtxos
  **/

  public List<Utxo> getConsumedUtxos() {
    return consumedUtxos;
  }

  public void setConsumedUtxos(List<Utxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
  }

  public XChainLinearTransaction emittedUtxos(List<Utxo> emittedUtxos) {
    this.emittedUtxos = emittedUtxos;
    return this;
  }

  public XChainLinearTransaction addEmittedUtxosItem(Utxo emittedUtxosItem) {
    this.emittedUtxos.add(emittedUtxosItem);
    return this;
  }

   /**
   * Get emittedUtxos
   * @return emittedUtxos
  **/

  public List<Utxo> getEmittedUtxos() {
    return emittedUtxos;
  }

  public void setEmittedUtxos(List<Utxo> emittedUtxos) {
    this.emittedUtxos = emittedUtxos;
  }

  public XChainLinearTransaction amountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
    return this;
  }

  public XChainLinearTransaction addAmountUnlockedItem(Asset amountUnlockedItem) {
    this.amountUnlocked.add(amountUnlockedItem);
    return this;
  }

   /**
   * Assets unlocked by inputs of this transaction.
   * @return amountUnlocked
  **/

  public List<Asset> getAmountUnlocked() {
    return amountUnlocked;
  }

  public void setAmountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
  }

  public XChainLinearTransaction amountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
    return this;
  }

  public XChainLinearTransaction addAmountCreatedItem(Asset amountCreatedItem) {
    this.amountCreated.add(amountCreatedItem);
    return this;
  }

   /**
   * Assets created by outputs of this transaction.
   * @return amountCreated
  **/

  public List<Asset> getAmountCreated() {
    return amountCreated;
  }

  public void setAmountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
  }

  public XChainLinearTransaction sourceChain(String sourceChain) {
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

  public XChainLinearTransaction destinationChain(String destinationChain) {
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

  public XChainLinearTransaction assetCreated(AllOfXChainLinearTransactionAssetCreated assetCreated) {
    this.assetCreated = assetCreated;
    return this;
  }

   /**
   * Asset details of the asset created in CreateAssetTx
   * @return assetCreated
  **/

  public AllOfXChainLinearTransactionAssetCreated getAssetCreated() {
    return assetCreated;
  }

  public void setAssetCreated(AllOfXChainLinearTransactionAssetCreated assetCreated) {
    this.assetCreated = assetCreated;
  }

  public XChainLinearTransaction blockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Height of the block this transaction belongs to.
   * @return blockHeight
  **/

  public BigDecimal getBlockHeight() {
    return blockHeight;
  }

  public void setBlockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
  }

  public XChainLinearTransaction blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Hash of the block this transaction belongs to.
   * @return blockHash
  **/

  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainLinearTransaction xchainLinearTransaction = (XChainLinearTransaction) o;
    return Objects.equals(this.txHash, xchainLinearTransaction.txHash) &&
        Objects.equals(this.chainFormat, xchainLinearTransaction.chainFormat) &&
        Objects.equals(this.timestamp, xchainLinearTransaction.timestamp) &&
        Objects.equals(this.txType, xchainLinearTransaction.txType) &&
        Objects.equals(this.memo, xchainLinearTransaction.memo) &&
        Objects.equals(this.consumedUtxos, xchainLinearTransaction.consumedUtxos) &&
        Objects.equals(this.emittedUtxos, xchainLinearTransaction.emittedUtxos) &&
        Objects.equals(this.amountUnlocked, xchainLinearTransaction.amountUnlocked) &&
        Objects.equals(this.amountCreated, xchainLinearTransaction.amountCreated) &&
        Objects.equals(this.sourceChain, xchainLinearTransaction.sourceChain) &&
        Objects.equals(this.destinationChain, xchainLinearTransaction.destinationChain) &&
        Objects.equals(this.assetCreated, xchainLinearTransaction.assetCreated) &&
        Objects.equals(this.blockHeight, xchainLinearTransaction.blockHeight) &&
        Objects.equals(this.blockHash, xchainLinearTransaction.blockHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, chainFormat, timestamp, txType, memo, consumedUtxos, emittedUtxos, amountUnlocked, amountCreated, sourceChain, destinationChain, assetCreated, blockHeight, blockHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainLinearTransaction {\n");
    
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    chainFormat: ").append(toIndentedString(chainFormat)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    consumedUtxos: ").append(toIndentedString(consumedUtxos)).append("\n");
    sb.append("    emittedUtxos: ").append(toIndentedString(emittedUtxos)).append("\n");
    sb.append("    amountUnlocked: ").append(toIndentedString(amountUnlocked)).append("\n");
    sb.append("    amountCreated: ").append(toIndentedString(amountCreated)).append("\n");
    sb.append("    sourceChain: ").append(toIndentedString(sourceChain)).append("\n");
    sb.append("    destinationChain: ").append(toIndentedString(destinationChain)).append("\n");
    sb.append("    assetCreated: ").append(toIndentedString(assetCreated)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
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
