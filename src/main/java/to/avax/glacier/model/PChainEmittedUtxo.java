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
import java.util.ArrayList;
import java.util.List;
/**
 * PChainEmittedUtxo
 */

public class PChainEmittedUtxo {
  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("assetId")
  private String assetId = null;

  @JsonProperty("utxoId")
  private String utxoId = null;

  @JsonProperty("createdOnChainId")
  private String createdOnChainId = null;

  @JsonProperty("consumedOnChainId")
  private String consumedOnChainId = null;

  @JsonProperty("staked")
  private Boolean staked = null;

  @JsonProperty("toTx")
  private String toTx = null;

  @JsonProperty("rewardType")
  private String rewardType = null;

  public PChainEmittedUtxo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PChainEmittedUtxo addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public PChainEmittedUtxo amount(String amount) {
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

  public PChainEmittedUtxo assetId(String assetId) {
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

  public PChainEmittedUtxo utxoId(String utxoId) {
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

  public PChainEmittedUtxo createdOnChainId(String createdOnChainId) {
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

  public PChainEmittedUtxo consumedOnChainId(String consumedOnChainId) {
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

  public PChainEmittedUtxo staked(Boolean staked) {
    this.staked = staked;
    return this;
  }

   /**
   * Get staked
   * @return staked
  **/

  public Boolean isStaked() {
    return staked;
  }

  public void setStaked(Boolean staked) {
    this.staked = staked;
  }

  public PChainEmittedUtxo toTx(String toTx) {
    this.toTx = toTx;
    return this;
  }

   /**
   * This field is only present if the UTXO has been consumed by another transaction.
   * @return toTx
  **/

  public String getToTx() {
    return toTx;
  }

  public void setToTx(String toTx) {
    this.toTx = toTx;
  }

  public PChainEmittedUtxo rewardType(String rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * This field is only present if the UTXO is a transaction reward and denotes whether the reward is for the validator or delegator.
   * @return rewardType
  **/

  public String getRewardType() {
    return rewardType;
  }

  public void setRewardType(String rewardType) {
    this.rewardType = rewardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainEmittedUtxo pchainEmittedUtxo = (PChainEmittedUtxo) o;
    return Objects.equals(this.addresses, pchainEmittedUtxo.addresses) &&
        Objects.equals(this.amount, pchainEmittedUtxo.amount) &&
        Objects.equals(this.assetId, pchainEmittedUtxo.assetId) &&
        Objects.equals(this.utxoId, pchainEmittedUtxo.utxoId) &&
        Objects.equals(this.createdOnChainId, pchainEmittedUtxo.createdOnChainId) &&
        Objects.equals(this.consumedOnChainId, pchainEmittedUtxo.consumedOnChainId) &&
        Objects.equals(this.staked, pchainEmittedUtxo.staked) &&
        Objects.equals(this.toTx, pchainEmittedUtxo.toTx) &&
        Objects.equals(this.rewardType, pchainEmittedUtxo.rewardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, amount, assetId, utxoId, createdOnChainId, consumedOnChainId, staked, toTx, rewardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainEmittedUtxo {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    utxoId: ").append(toIndentedString(utxoId)).append("\n");
    sb.append("    createdOnChainId: ").append(toIndentedString(createdOnChainId)).append("\n");
    sb.append("    consumedOnChainId: ").append(toIndentedString(consumedOnChainId)).append("\n");
    sb.append("    staked: ").append(toIndentedString(staked)).append("\n");
    sb.append("    toTx: ").append(toIndentedString(toTx)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
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
