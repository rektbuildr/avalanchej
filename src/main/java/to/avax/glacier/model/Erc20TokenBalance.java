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
 * Erc20TokenBalance
 */

public class Erc20TokenBalance {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("decimals")
  private BigDecimal decimals = null;

  @JsonProperty("logoUri")
  private String logoUri = null;

  /**
   * Gets or Sets ercType
   */
  public enum ErcTypeEnum {
    ERC_20("ERC-20");

    private String value;

    ErcTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ErcTypeEnum fromValue(String input) {
      for (ErcTypeEnum b : ErcTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("ercType")
  private ErcTypeEnum ercType = null;

  @JsonProperty("price")
  private AllOfErc20TokenBalancePrice price = null;

  @JsonProperty("chainId")
  private String chainId = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("balanceValue")
  private AllOfErc20TokenBalanceBalanceValue balanceValue = null;

  public Erc20TokenBalance address(String address) {
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

  public Erc20TokenBalance name(String name) {
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

  public Erc20TokenBalance symbol(String symbol) {
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

  public Erc20TokenBalance decimals(BigDecimal decimals) {
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

  public Erc20TokenBalance logoUri(String logoUri) {
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

  public Erc20TokenBalance ercType(ErcTypeEnum ercType) {
    this.ercType = ercType;
    return this;
  }

   /**
   * Get ercType
   * @return ercType
  **/

  public ErcTypeEnum getErcType() {
    return ercType;
  }

  public void setErcType(ErcTypeEnum ercType) {
    this.ercType = ercType;
  }

  public Erc20TokenBalance price(AllOfErc20TokenBalancePrice price) {
    this.price = price;
    return this;
  }

   /**
   * The token price, if available.
   * @return price
  **/

  public AllOfErc20TokenBalancePrice getPrice() {
    return price;
  }

  public void setPrice(AllOfErc20TokenBalancePrice price) {
    this.price = price;
  }

  public Erc20TokenBalance chainId(String chainId) {
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

  public Erc20TokenBalance balance(String balance) {
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

  public Erc20TokenBalance balanceValue(AllOfErc20TokenBalanceBalanceValue balanceValue) {
    this.balanceValue = balanceValue;
    return this;
  }

   /**
   * The monetary value of the balance, if a price is available for the token.
   * @return balanceValue
  **/

  public AllOfErc20TokenBalanceBalanceValue getBalanceValue() {
    return balanceValue;
  }

  public void setBalanceValue(AllOfErc20TokenBalanceBalanceValue balanceValue) {
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
    Erc20TokenBalance erc20TokenBalance = (Erc20TokenBalance) o;
    return Objects.equals(this.address, erc20TokenBalance.address) &&
        Objects.equals(this.name, erc20TokenBalance.name) &&
        Objects.equals(this.symbol, erc20TokenBalance.symbol) &&
        Objects.equals(this.decimals, erc20TokenBalance.decimals) &&
        Objects.equals(this.logoUri, erc20TokenBalance.logoUri) &&
        Objects.equals(this.ercType, erc20TokenBalance.ercType) &&
        Objects.equals(this.price, erc20TokenBalance.price) &&
        Objects.equals(this.chainId, erc20TokenBalance.chainId) &&
        Objects.equals(this.balance, erc20TokenBalance.balance) &&
        Objects.equals(this.balanceValue, erc20TokenBalance.balanceValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, symbol, decimals, logoUri, ercType, price, chainId, balance, balanceValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc20TokenBalance {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    ercType: ").append(toIndentedString(ercType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
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
