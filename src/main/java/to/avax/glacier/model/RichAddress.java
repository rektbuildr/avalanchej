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
 * RichAddress
 */

public class RichAddress {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("decimals")
  private BigDecimal decimals = null;

  @JsonProperty("logoUri")
  private String logoUri = null;

  @JsonProperty("address")
  private String address = null;

  public RichAddress name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The contract name.
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RichAddress symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The contract symbol.
   * @return symbol
  **/

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RichAddress decimals(BigDecimal decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * The number of decimals the token uses. For example &#x60;6&#x60;,        means to divide the token amount by &#x60;1000000&#x60; to get its user        representation.
   * @return decimals
  **/

  public BigDecimal getDecimals() {
    return decimals;
  }

  public void setDecimals(BigDecimal decimals) {
    this.decimals = decimals;
  }

  public RichAddress logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

   /**
   * The logo uri for the address.
   * @return logoUri
  **/

  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public RichAddress address(String address) {
    this.address = address;
    return this;
  }

   /**
   * A wallet or contract address in mixed-case checksum encoding.
   * @return address
  **/

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichAddress richAddress = (RichAddress) o;
    return Objects.equals(this.name, richAddress.name) &&
        Objects.equals(this.symbol, richAddress.symbol) &&
        Objects.equals(this.decimals, richAddress.decimals) &&
        Objects.equals(this.logoUri, richAddress.logoUri) &&
        Objects.equals(this.address, richAddress.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, decimals, logoUri, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichAddress {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
