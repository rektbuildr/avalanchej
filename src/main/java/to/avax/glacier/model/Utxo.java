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
import to.avax.glacier.model.UtxoCredential;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Utxo
 */

public class Utxo {
  @JsonProperty("utxoId")
  private String utxoId = null;

  @JsonProperty("asset")
  private Asset asset = null;

  @JsonProperty("utxoType")
  private String utxoType = null;

  @JsonProperty("createdOnChainId")
  private String createdOnChainId = null;

  @JsonProperty("consumedOnChainId")
  private String consumedOnChainId = null;

  @JsonProperty("creationTxHash")
  private String creationTxHash = null;

  @JsonProperty("consumingTxHash")
  private String consumingTxHash = null;

  @JsonProperty("consumingTxTimestamp")
  private BigDecimal consumingTxTimestamp = null;

  @JsonProperty("outputIndex")
  private String outputIndex = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  @JsonProperty("locktime")
  private BigDecimal locktime = null;

  @JsonProperty("threshold")
  private BigDecimal threshold = null;

  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  @JsonProperty("credentials")
  private List<UtxoCredential> credentials = new ArrayList<UtxoCredential>();

  public Utxo utxoId(String utxoId) {
    this.utxoId = utxoId;
    return this;
  }

   /**
   * UTXO ID for this output.
   * @return utxoId
  **/

  public String getUtxoId() {
    return utxoId;
  }

  public void setUtxoId(String utxoId) {
    this.utxoId = utxoId;
  }

  public Utxo asset(Asset asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/

  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }

  public Utxo utxoType(String utxoType) {
    this.utxoType = utxoType;
    return this;
  }

   /**
   * Type of output.
   * @return utxoType
  **/

  public String getUtxoType() {
    return utxoType;
  }

  public void setUtxoType(String utxoType) {
    this.utxoType = utxoType;
  }

  public Utxo createdOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
    return this;
  }

   /**
   * Blockchain ID on which this output is created on.
   * @return createdOnChainId
  **/

  public String getCreatedOnChainId() {
    return createdOnChainId;
  }

  public void setCreatedOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
  }

  public Utxo consumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
    return this;
  }

   /**
   * Blockchain ID on which this output is consumed on.
   * @return consumedOnChainId
  **/

  public String getConsumedOnChainId() {
    return consumedOnChainId;
  }

  public void setConsumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
  }

  public Utxo creationTxHash(String creationTxHash) {
    this.creationTxHash = creationTxHash;
    return this;
  }

   /**
   * Transaction ID that created this output.
   * @return creationTxHash
  **/

  public String getCreationTxHash() {
    return creationTxHash;
  }

  public void setCreationTxHash(String creationTxHash) {
    this.creationTxHash = creationTxHash;
  }

  public Utxo consumingTxHash(String consumingTxHash) {
    this.consumingTxHash = consumingTxHash;
    return this;
  }

   /**
   * Transaction ID that consumed this output.
   * @return consumingTxHash
  **/

  public String getConsumingTxHash() {
    return consumingTxHash;
  }

  public void setConsumingTxHash(String consumingTxHash) {
    this.consumingTxHash = consumingTxHash;
  }

  public Utxo consumingTxTimestamp(BigDecimal consumingTxTimestamp) {
    this.consumingTxTimestamp = consumingTxTimestamp;
    return this;
  }

   /**
   * Timestamp in seconds this output is consumed.
   * @return consumingTxTimestamp
  **/

  public BigDecimal getConsumingTxTimestamp() {
    return consumingTxTimestamp;
  }

  public void setConsumingTxTimestamp(BigDecimal consumingTxTimestamp) {
    this.consumingTxTimestamp = consumingTxTimestamp;
  }

  public Utxo outputIndex(String outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * Postion of this output in a list of lexiographically sorted outputs of a transaction.
   * @return outputIndex
  **/

  public String getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(String outputIndex) {
    this.outputIndex = outputIndex;
  }

  public Utxo timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp in seconds this outptut is created on.
   * @return timestamp
  **/

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public Utxo locktime(BigDecimal locktime) {
    this.locktime = locktime;
    return this;
  }

   /**
   * Locktime in seconds after which this output can be consumed.
   * @return locktime
  **/

  public BigDecimal getLocktime() {
    return locktime;
  }

  public void setLocktime(BigDecimal locktime) {
    this.locktime = locktime;
  }

  public Utxo threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Minimum number of signatures required to consume this output.
   * @return threshold
  **/

  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  public Utxo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Utxo addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses that are eligible to sign the consumption of this output.
   * @return addresses
  **/

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public Utxo credentials(List<UtxoCredential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Utxo addCredentialsItem(UtxoCredential credentialsItem) {
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Credentials that signed the transaction to consume this utxo
   * @return credentials
  **/

  public List<UtxoCredential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<UtxoCredential> credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Utxo utxo = (Utxo) o;
    return Objects.equals(this.utxoId, utxo.utxoId) &&
        Objects.equals(this.asset, utxo.asset) &&
        Objects.equals(this.utxoType, utxo.utxoType) &&
        Objects.equals(this.createdOnChainId, utxo.createdOnChainId) &&
        Objects.equals(this.consumedOnChainId, utxo.consumedOnChainId) &&
        Objects.equals(this.creationTxHash, utxo.creationTxHash) &&
        Objects.equals(this.consumingTxHash, utxo.consumingTxHash) &&
        Objects.equals(this.consumingTxTimestamp, utxo.consumingTxTimestamp) &&
        Objects.equals(this.outputIndex, utxo.outputIndex) &&
        Objects.equals(this.timestamp, utxo.timestamp) &&
        Objects.equals(this.locktime, utxo.locktime) &&
        Objects.equals(this.threshold, utxo.threshold) &&
        Objects.equals(this.addresses, utxo.addresses) &&
        Objects.equals(this.credentials, utxo.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utxoId, asset, utxoType, createdOnChainId, consumedOnChainId, creationTxHash, consumingTxHash, consumingTxTimestamp, outputIndex, timestamp, locktime, threshold, addresses, credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Utxo {\n");
    
    sb.append("    utxoId: ").append(toIndentedString(utxoId)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    utxoType: ").append(toIndentedString(utxoType)).append("\n");
    sb.append("    createdOnChainId: ").append(toIndentedString(createdOnChainId)).append("\n");
    sb.append("    consumedOnChainId: ").append(toIndentedString(consumedOnChainId)).append("\n");
    sb.append("    creationTxHash: ").append(toIndentedString(creationTxHash)).append("\n");
    sb.append("    consumingTxHash: ").append(toIndentedString(consumingTxHash)).append("\n");
    sb.append("    consumingTxTimestamp: ").append(toIndentedString(consumingTxTimestamp)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
