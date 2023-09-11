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
import to.avax.glacier.model.Asset;
import to.avax.glacier.model.EVMOutput;
import to.avax.glacier.model.Utxo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * CChainImportTransaction
 */

public class CChainImportTransaction implements InlineResponse2001, AnyOfListCChainAtomicTransactionsResponseTransactionsItems {
  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("blockHeight")
  private BigDecimal blockHeight = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  @JsonProperty("memo")
  private String memo = null;

  @JsonProperty("amountUnlocked")
  private List<Asset> amountUnlocked = new ArrayList<Asset>();

  @JsonProperty("amountCreated")
  private List<Asset> amountCreated = new ArrayList<Asset>();

  @JsonProperty("sourceChain")
  private String sourceChain = null;

  @JsonProperty("destinationChain")
  private String destinationChain = null;

  /**
   * Type of transaction.
   */

  public enum TxTypeEnum {
    IMPORTTX("ImportTx");

    private String value;

    TxTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TxTypeEnum fromValue(String input) {
      for (TxTypeEnum b : TxTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("txType")
  private TxTypeEnum txType = null;

  @JsonProperty("evmOutputs")
  private List<EVMOutput> evmOutputs = new ArrayList<EVMOutput>();

  @JsonProperty("consumedUtxos")
  private List<Utxo> consumedUtxos = new ArrayList<Utxo>();

  public CChainImportTransaction txHash(String txHash) {
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

  public CChainImportTransaction blockHeight(BigDecimal blockHeight) {
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

  public CChainImportTransaction blockHash(String blockHash) {
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

  public CChainImportTransaction timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Latest timestamp in seconds this transaction was accepted.
   * @return timestamp
  **/

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public CChainImportTransaction memo(String memo) {
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

  public CChainImportTransaction amountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
    return this;
  }

  public CChainImportTransaction addAmountUnlockedItem(Asset amountUnlockedItem) {
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

  public CChainImportTransaction amountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
    return this;
  }

  public CChainImportTransaction addAmountCreatedItem(Asset amountCreatedItem) {
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

  public CChainImportTransaction sourceChain(String sourceChain) {
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

  public CChainImportTransaction destinationChain(String destinationChain) {
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

  public CChainImportTransaction txType(TxTypeEnum txType) {
    this.txType = txType;
    return this;
  }

   /**
   * Type of transaction.
   * @return txType
  **/

  public TxTypeEnum getTxType() {
    return txType;
  }

  public void setTxType(TxTypeEnum txType) {
    this.txType = txType;
  }

  public CChainImportTransaction evmOutputs(List<EVMOutput> evmOutputs) {
    this.evmOutputs = evmOutputs;
    return this;
  }

  public CChainImportTransaction addEvmOutputsItem(EVMOutput evmOutputsItem) {
    this.evmOutputs.add(evmOutputsItem);
    return this;
  }

   /**
   * Get evmOutputs
   * @return evmOutputs
  **/

  public List<EVMOutput> getEvmOutputs() {
    return evmOutputs;
  }

  public void setEvmOutputs(List<EVMOutput> evmOutputs) {
    this.evmOutputs = evmOutputs;
  }

  public CChainImportTransaction consumedUtxos(List<Utxo> consumedUtxos) {
    this.consumedUtxos = consumedUtxos;
    return this;
  }

  public CChainImportTransaction addConsumedUtxosItem(Utxo consumedUtxosItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CChainImportTransaction cchainImportTransaction = (CChainImportTransaction) o;
    return Objects.equals(this.txHash, cchainImportTransaction.txHash) &&
        Objects.equals(this.blockHeight, cchainImportTransaction.blockHeight) &&
        Objects.equals(this.blockHash, cchainImportTransaction.blockHash) &&
        Objects.equals(this.timestamp, cchainImportTransaction.timestamp) &&
        Objects.equals(this.memo, cchainImportTransaction.memo) &&
        Objects.equals(this.amountUnlocked, cchainImportTransaction.amountUnlocked) &&
        Objects.equals(this.amountCreated, cchainImportTransaction.amountCreated) &&
        Objects.equals(this.sourceChain, cchainImportTransaction.sourceChain) &&
        Objects.equals(this.destinationChain, cchainImportTransaction.destinationChain) &&
        Objects.equals(this.txType, cchainImportTransaction.txType) &&
        Objects.equals(this.evmOutputs, cchainImportTransaction.evmOutputs) &&
        Objects.equals(this.consumedUtxos, cchainImportTransaction.consumedUtxos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, blockHeight, blockHash, timestamp, memo, amountUnlocked, amountCreated, sourceChain, destinationChain, txType, evmOutputs, consumedUtxos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CChainImportTransaction {\n");
    
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    amountUnlocked: ").append(toIndentedString(amountUnlocked)).append("\n");
    sb.append("    amountCreated: ").append(toIndentedString(amountCreated)).append("\n");
    sb.append("    sourceChain: ").append(toIndentedString(sourceChain)).append("\n");
    sb.append("    destinationChain: ").append(toIndentedString(destinationChain)).append("\n");
    sb.append("    txType: ").append(toIndentedString(txType)).append("\n");
    sb.append("    evmOutputs: ").append(toIndentedString(evmOutputs)).append("\n");
    sb.append("    consumedUtxos: ").append(toIndentedString(consumedUtxos)).append("\n");
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
