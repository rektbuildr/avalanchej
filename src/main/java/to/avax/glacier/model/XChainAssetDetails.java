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
 * XChainAssetDetails
 */

public class XChainAssetDetails {
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

  @JsonProperty("createdAtTimestamp")
  private BigDecimal createdAtTimestamp = null;

  @JsonProperty("cap")
  private String cap = null;

  public XChainAssetDetails assetId(String assetId) {
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

  public XChainAssetDetails name(String name) {
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

  public XChainAssetDetails symbol(String symbol) {
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

  public XChainAssetDetails denomination(BigDecimal denomination) {
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

  public XChainAssetDetails type(String type) {
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

  public XChainAssetDetails createdAtTimestamp(BigDecimal createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Timestamp in seconds this asset was created on.
   * @return createdAtTimestamp
  **/

  public BigDecimal getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }

  public void setCreatedAtTimestamp(BigDecimal createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }

  public XChainAssetDetails cap(String cap) {
    this.cap = cap;
    return this;
  }

   /**
   * Cap represents if an asset can be or is fixed cap.
   * @return cap
  **/

  public String getCap() {
    return cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainAssetDetails xchainAssetDetails = (XChainAssetDetails) o;
    return Objects.equals(this.assetId, xchainAssetDetails.assetId) &&
        Objects.equals(this.name, xchainAssetDetails.name) &&
        Objects.equals(this.symbol, xchainAssetDetails.symbol) &&
        Objects.equals(this.denomination, xchainAssetDetails.denomination) &&
        Objects.equals(this.type, xchainAssetDetails.type) &&
        Objects.equals(this.createdAtTimestamp, xchainAssetDetails.createdAtTimestamp) &&
        Objects.equals(this.cap, xchainAssetDetails.cap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, name, symbol, denomination, type, createdAtTimestamp, cap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainAssetDetails {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
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
