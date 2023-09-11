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
import to.avax.glacier.model.EVMInput;
import to.avax.glacier.model.Utxo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * CChainExportTransaction
 */

public class CChainExportTransaction implements InlineResponse2001, AnyOfListCChainAtomicTransactionsResponseTransactionsItems {
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
    EXPORTTX("ExportTx");

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

  }  @JsonProperty("txType")
  private TxTypeEnum txType = null;

  @JsonProperty("evmInputs")
  private List<EVMInput> evmInputs = new ArrayList<EVMInput>();

  @JsonProperty("emittedUtxos")
  private List<Utxo> emittedUtxos = new ArrayList<Utxo>();

  public CChainExportTransaction txHash(String txHash) {
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

  public CChainExportTransaction blockHeight(BigDecimal blockHeight) {
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

  public CChainExportTransaction blockHash(String blockHash) {
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

  public CChainExportTransaction timestamp(BigDecimal timestamp) {
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

  public CChainExportTransaction memo(String memo) {
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

  public CChainExportTransaction amountUnlocked(List<Asset> amountUnlocked) {
    this.amountUnlocked = amountUnlocked;
    return this;
  }

  public CChainExportTransaction addAmountUnlockedItem(Asset amountUnlockedItem) {
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

  public CChainExportTransaction amountCreated(List<Asset> amountCreated) {
    this.amountCreated = amountCreated;
    return this;
  }

  public CChainExportTransaction addAmountCreatedItem(Asset amountCreatedItem) {
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

  public CChainExportTransaction sourceChain(String sourceChain) {
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

  public CChainExportTransaction destinationChain(String destinationChain) {
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

  public CChainExportTransaction txType(TxTypeEnum txType) {
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

  public CChainExportTransaction evmInputs(List<EVMInput> evmInputs) {
    this.evmInputs = evmInputs;
    return this;
  }

  public CChainExportTransaction addEvmInputsItem(EVMInput evmInputsItem) {
    this.evmInputs.add(evmInputsItem);
    return this;
  }

   /**
   * Get evmInputs
   * @return evmInputs
  **/

  public List<EVMInput> getEvmInputs() {
    return evmInputs;
  }

  public void setEvmInputs(List<EVMInput> evmInputs) {
    this.evmInputs = evmInputs;
  }

  public CChainExportTransaction emittedUtxos(List<Utxo> emittedUtxos) {
    this.emittedUtxos = emittedUtxos;
    return this;
  }

  public CChainExportTransaction addEmittedUtxosItem(Utxo emittedUtxosItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CChainExportTransaction cchainExportTransaction = (CChainExportTransaction) o;
    return Objects.equals(this.txHash, cchainExportTransaction.txHash) &&
        Objects.equals(this.blockHeight, cchainExportTransaction.blockHeight) &&
        Objects.equals(this.blockHash, cchainExportTransaction.blockHash) &&
        Objects.equals(this.timestamp, cchainExportTransaction.timestamp) &&
        Objects.equals(this.memo, cchainExportTransaction.memo) &&
        Objects.equals(this.amountUnlocked, cchainExportTransaction.amountUnlocked) &&
        Objects.equals(this.amountCreated, cchainExportTransaction.amountCreated) &&
        Objects.equals(this.sourceChain, cchainExportTransaction.sourceChain) &&
        Objects.equals(this.destinationChain, cchainExportTransaction.destinationChain) &&
        Objects.equals(this.txType, cchainExportTransaction.txType) &&
        Objects.equals(this.evmInputs, cchainExportTransaction.evmInputs) &&
        Objects.equals(this.emittedUtxos, cchainExportTransaction.emittedUtxos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, blockHeight, blockHash, timestamp, memo, amountUnlocked, amountCreated, sourceChain, destinationChain, txType, evmInputs, emittedUtxos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CChainExportTransaction {\n");
    
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
    sb.append("    evmInputs: ").append(toIndentedString(evmInputs)).append("\n");
    sb.append("    emittedUtxos: ").append(toIndentedString(emittedUtxos)).append("\n");
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
