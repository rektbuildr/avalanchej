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
/**
 * Asset
 */

public class Asset {
  @JsonProperty("assetId")
  private String assetId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("denomination")
  private BigDecimal denomination = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("amount")
  private String amount = null;

  public Asset assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique ID for an asset.
   * @return assetId
  **/

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public Asset name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this asset.
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Asset symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol for this asset (max 4 characters).
   * @return symbol
  **/

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Asset denomination(BigDecimal denomination) {
    this.denomination = denomination;
    return this;
  }

   /**
   * Denomination of this asset to represent fungibility.
   * @return denomination
  **/

  public BigDecimal getDenomination() {
    return denomination;
  }

  public void setDenomination(BigDecimal denomination) {
    this.denomination = denomination;
  }

  public Asset type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of asset like SECP256K1 or NFT.
   * @return type
  **/

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Asset amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the asset.
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.assetId, asset.assetId) &&
        Objects.equals(this.name, asset.name) &&
        Objects.equals(this.symbol, asset.symbol) &&
        Objects.equals(this.denomination, asset.denomination) &&
        Objects.equals(this.type, asset.type) &&
        Objects.equals(this.amount, asset.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, name, symbol, denomination, type, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
