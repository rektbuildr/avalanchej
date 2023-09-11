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
 * NetworkToken
 */

public class NetworkToken {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("decimals")
  private BigDecimal decimals = null;

  @JsonProperty("logoUri")
  private String logoUri = null;

  @JsonProperty("description")
  private String description = null;

  public NetworkToken name(String name) {
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

  public NetworkToken symbol(String symbol) {
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

  public NetworkToken decimals(BigDecimal decimals) {
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

  public NetworkToken logoUri(String logoUri) {
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

  public NetworkToken description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkToken networkToken = (NetworkToken) o;
    return Objects.equals(this.name, networkToken.name) &&
        Objects.equals(this.symbol, networkToken.symbol) &&
        Objects.equals(this.decimals, networkToken.decimals) &&
        Objects.equals(this.logoUri, networkToken.logoUri) &&
        Objects.equals(this.description, networkToken.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, decimals, logoUri, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkToken {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
