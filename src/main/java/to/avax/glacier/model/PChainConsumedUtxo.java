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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PChainConsumedUtxo
 */

public class PChainConsumedUtxo {
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

  @JsonProperty("fromTx")
  private String fromTx = null;

  public PChainConsumedUtxo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PChainConsumedUtxo addAddressesItem(String addressesItem) {
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

  public PChainConsumedUtxo amount(String amount) {
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

  public PChainConsumedUtxo assetId(String assetId) {
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

  public PChainConsumedUtxo utxoId(String utxoId) {
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

  public PChainConsumedUtxo createdOnChainId(String createdOnChainId) {
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

  public PChainConsumedUtxo consumedOnChainId(String consumedOnChainId) {
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

  public PChainConsumedUtxo fromTx(String fromTx) {
    this.fromTx = fromTx;
    return this;
  }

   /**
   * Get fromTx
   * @return fromTx
  **/

  public String getFromTx() {
    return fromTx;
  }

  public void setFromTx(String fromTx) {
    this.fromTx = fromTx;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainConsumedUtxo pchainConsumedUtxo = (PChainConsumedUtxo) o;
    return Objects.equals(this.addresses, pchainConsumedUtxo.addresses) &&
        Objects.equals(this.amount, pchainConsumedUtxo.amount) &&
        Objects.equals(this.assetId, pchainConsumedUtxo.assetId) &&
        Objects.equals(this.utxoId, pchainConsumedUtxo.utxoId) &&
        Objects.equals(this.createdOnChainId, pchainConsumedUtxo.createdOnChainId) &&
        Objects.equals(this.consumedOnChainId, pchainConsumedUtxo.consumedOnChainId) &&
        Objects.equals(this.fromTx, pchainConsumedUtxo.fromTx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, amount, assetId, utxoId, createdOnChainId, consumedOnChainId, fromTx);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainConsumedUtxo {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    utxoId: ").append(toIndentedString(utxoId)).append("\n");
    sb.append("    createdOnChainId: ").append(toIndentedString(createdOnChainId)).append("\n");
    sb.append("    consumedOnChainId: ").append(toIndentedString(consumedOnChainId)).append("\n");
    sb.append("    fromTx: ").append(toIndentedString(fromTx)).append("\n");
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
