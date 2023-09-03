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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * PChainUtxo
 */

public class PChainUtxo {
  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  @JsonProperty("utxoId")
  private String utxoId = null;

  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("outputIndex")
  private BigDecimal outputIndex = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("consumingTxHash")
  private String consumingTxHash = null;

  @JsonProperty("consumingBlockTimestamp")
  private BigDecimal consumingBlockTimestamp = null;

  @JsonProperty("assetId")
  private String assetId = null;

  @JsonProperty("utxoType")
  private String utxoType = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("stakeableLocktime")
  private BigDecimal stakeableLocktime = null;

  @JsonProperty("platformLocktime")
  private BigDecimal platformLocktime = null;

  @JsonProperty("threshold")
  private BigDecimal threshold = null;

  @JsonProperty("createdOnChainId")
  private String createdOnChainId = null;

  @JsonProperty("consumedOnChainId")
  private String consumedOnChainId = null;

  public PChainUtxo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PChainUtxo addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * An array of P-Chain wallet addresses.
   * @return addresses
  **/

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public PChainUtxo utxoId(String utxoId) {
    this.utxoId = utxoId;
    return this;
  }

   /**
   * Get utxoId
   * @return utxoId
  **/

  public String getUtxoId() {
    return utxoId;
  }

  public void setUtxoId(String utxoId) {
    this.utxoId = utxoId;
  }

  public PChainUtxo txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Get txHash
   * @return txHash
  **/

  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public PChainUtxo outputIndex(BigDecimal outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * Get outputIndex
   * @return outputIndex
  **/

  public BigDecimal getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(BigDecimal outputIndex) {
    this.outputIndex = outputIndex;
  }

  public PChainUtxo blockTimestamp(BigDecimal blockTimestamp) {
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

  public PChainUtxo consumingTxHash(String consumingTxHash) {
    this.consumingTxHash = consumingTxHash;
    return this;
  }

   /**
   * Get consumingTxHash
   * @return consumingTxHash
  **/

  public String getConsumingTxHash() {
    return consumingTxHash;
  }

  public void setConsumingTxHash(String consumingTxHash) {
    this.consumingTxHash = consumingTxHash;
  }

  public PChainUtxo consumingBlockTimestamp(BigDecimal consumingBlockTimestamp) {
    this.consumingBlockTimestamp = consumingBlockTimestamp;
    return this;
  }

   /**
   * Get consumingBlockTimestamp
   * @return consumingBlockTimestamp
  **/

  public BigDecimal getConsumingBlockTimestamp() {
    return consumingBlockTimestamp;
  }

  public void setConsumingBlockTimestamp(BigDecimal consumingBlockTimestamp) {
    this.consumingBlockTimestamp = consumingBlockTimestamp;
  }

  public PChainUtxo assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public PChainUtxo utxoType(String utxoType) {
    this.utxoType = utxoType;
    return this;
  }

   /**
   * Get utxoType
   * @return utxoType
  **/

  public String getUtxoType() {
    return utxoType;
  }

  public void setUtxoType(String utxoType) {
    this.utxoType = utxoType;
  }

  public PChainUtxo amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PChainUtxo stakeableLocktime(BigDecimal stakeableLocktime) {
    this.stakeableLocktime = stakeableLocktime;
    return this;
  }

   /**
   * Get stakeableLocktime
   * @return stakeableLocktime
  **/

  public BigDecimal getStakeableLocktime() {
    return stakeableLocktime;
  }

  public void setStakeableLocktime(BigDecimal stakeableLocktime) {
    this.stakeableLocktime = stakeableLocktime;
  }

  public PChainUtxo platformLocktime(BigDecimal platformLocktime) {
    this.platformLocktime = platformLocktime;
    return this;
  }

   /**
   * Get platformLocktime
   * @return platformLocktime
  **/

  public BigDecimal getPlatformLocktime() {
    return platformLocktime;
  }

  public void setPlatformLocktime(BigDecimal platformLocktime) {
    this.platformLocktime = platformLocktime;
  }

  public PChainUtxo threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/

  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  public PChainUtxo createdOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
    return this;
  }

   /**
   * Get createdOnChainId
   * @return createdOnChainId
  **/

  public String getCreatedOnChainId() {
    return createdOnChainId;
  }

  public void setCreatedOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
  }

  public PChainUtxo consumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
    return this;
  }

   /**
   * Get consumedOnChainId
   * @return consumedOnChainId
  **/

  public String getConsumedOnChainId() {
    return consumedOnChainId;
  }

  public void setConsumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainUtxo pchainUtxo = (PChainUtxo) o;
    return Objects.equals(this.addresses, pchainUtxo.addresses) &&
        Objects.equals(this.utxoId, pchainUtxo.utxoId) &&
        Objects.equals(this.txHash, pchainUtxo.txHash) &&
        Objects.equals(this.outputIndex, pchainUtxo.outputIndex) &&
        Objects.equals(this.blockTimestamp, pchainUtxo.blockTimestamp) &&
        Objects.equals(this.consumingTxHash, pchainUtxo.consumingTxHash) &&
        Objects.equals(this.consumingBlockTimestamp, pchainUtxo.consumingBlockTimestamp) &&
        Objects.equals(this.assetId, pchainUtxo.assetId) &&
        Objects.equals(this.utxoType, pchainUtxo.utxoType) &&
        Objects.equals(this.amount, pchainUtxo.amount) &&
        Objects.equals(this.stakeableLocktime, pchainUtxo.stakeableLocktime) &&
        Objects.equals(this.platformLocktime, pchainUtxo.platformLocktime) &&
        Objects.equals(this.threshold, pchainUtxo.threshold) &&
        Objects.equals(this.createdOnChainId, pchainUtxo.createdOnChainId) &&
        Objects.equals(this.consumedOnChainId, pchainUtxo.consumedOnChainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, utxoId, txHash, outputIndex, blockTimestamp, consumingTxHash, consumingBlockTimestamp, assetId, utxoType, amount, stakeableLocktime, platformLocktime, threshold, createdOnChainId, consumedOnChainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainUtxo {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    utxoId: ").append(toIndentedString(utxoId)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    consumingTxHash: ").append(toIndentedString(consumingTxHash)).append("\n");
    sb.append("    consumingBlockTimestamp: ").append(toIndentedString(consumingBlockTimestamp)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    utxoType: ").append(toIndentedString(utxoType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    stakeableLocktime: ").append(toIndentedString(stakeableLocktime)).append("\n");
    sb.append("    platformLocktime: ").append(toIndentedString(platformLocktime)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    createdOnChainId: ").append(toIndentedString(createdOnChainId)).append("\n");
    sb.append("    consumedOnChainId: ").append(toIndentedString(consumedOnChainId)).append("\n");
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
