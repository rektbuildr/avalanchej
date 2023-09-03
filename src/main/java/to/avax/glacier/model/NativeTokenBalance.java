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
/**
 * NativeTokenBalance
 */

public class NativeTokenBalance {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("decimals")
  private BigDecimal decimals = null;

  @JsonProperty("logoUri")
  private String logoUri = null;

  @JsonProperty("chainId")
  private String chainId = null;

  @JsonProperty("price")
  private AllOfNativeTokenBalancePrice price = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("balanceValue")
  private AllOfNativeTokenBalanceBalanceValue balanceValue = null;

  public NativeTokenBalance name(String name) {
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

  public NativeTokenBalance symbol(String symbol) {
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

  public NativeTokenBalance decimals(BigDecimal decimals) {
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

  public NativeTokenBalance logoUri(String logoUri) {
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

  public NativeTokenBalance chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The evm chain id.
   * @return chainId
  **/

  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public NativeTokenBalance price(AllOfNativeTokenBalancePrice price) {
    this.price = price;
    return this;
  }

   /**
   * The token price, if available.
   * @return price
  **/

  public AllOfNativeTokenBalancePrice getPrice() {
    return price;
  }

  public void setPrice(AllOfNativeTokenBalancePrice price) {
    this.price = price;
  }

  public NativeTokenBalance balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The address balance for the token, in units specified by the        &#x60;decimals&#x60; value for the contract.
   * @return balance
  **/

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public NativeTokenBalance balanceValue(AllOfNativeTokenBalanceBalanceValue balanceValue) {
    this.balanceValue = balanceValue;
    return this;
  }

   /**
   * The monetary value of the balance, if a price is available for the token.
   * @return balanceValue
  **/

  public AllOfNativeTokenBalanceBalanceValue getBalanceValue() {
    return balanceValue;
  }

  public void setBalanceValue(AllOfNativeTokenBalanceBalanceValue balanceValue) {
    this.balanceValue = balanceValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeTokenBalance nativeTokenBalance = (NativeTokenBalance) o;
    return Objects.equals(this.name, nativeTokenBalance.name) &&
        Objects.equals(this.symbol, nativeTokenBalance.symbol) &&
        Objects.equals(this.decimals, nativeTokenBalance.decimals) &&
        Objects.equals(this.logoUri, nativeTokenBalance.logoUri) &&
        Objects.equals(this.chainId, nativeTokenBalance.chainId) &&
        Objects.equals(this.price, nativeTokenBalance.price) &&
        Objects.equals(this.balance, nativeTokenBalance.balance) &&
        Objects.equals(this.balanceValue, nativeTokenBalance.balanceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, decimals, logoUri, chainId, price, balance, balanceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeTokenBalance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceValue: ").append(toIndentedString(balanceValue)).append("\n");
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
