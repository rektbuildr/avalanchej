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
/**
 * Erc1155TokenBalance
 */

public class Erc1155TokenBalance implements OneOfListCollectibleBalancesResponseCollectibleBalancesItems {
  @JsonProperty("address")
  private String address = null;

  /**
   * Gets or Sets ercType
   */

  public enum ErcTypeEnum {
    ERC_1155("ERC-1155");

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

  @JsonProperty("tokenId")
  private String tokenId = null;

  @JsonProperty("tokenUri")
  private String tokenUri = null;

  @JsonProperty("metadata")
  private Erc1155TokenMetadata metadata = null;

  @JsonProperty("chainId")
  private String chainId = null;

  @JsonProperty("balance")
  private String balance = null;

  public Erc1155TokenBalance address(String address) {
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

  public Erc1155TokenBalance ercType(ErcTypeEnum ercType) {
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

  public Erc1155TokenBalance tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/

  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public Erc1155TokenBalance tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

   /**
   * Get tokenUri
   * @return tokenUri
  **/

  public String getTokenUri() {
    return tokenUri;
  }

  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }

  public Erc1155TokenBalance metadata(Erc1155TokenMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public Erc1155TokenMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Erc1155TokenMetadata metadata) {
    this.metadata = metadata;
  }

  public Erc1155TokenBalance chainId(String chainId) {
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

  public Erc1155TokenBalance balance(String balance) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc1155TokenBalance erc1155TokenBalance = (Erc1155TokenBalance) o;
    return Objects.equals(this.address, erc1155TokenBalance.address) &&
        Objects.equals(this.ercType, erc1155TokenBalance.ercType) &&
        Objects.equals(this.tokenId, erc1155TokenBalance.tokenId) &&
        Objects.equals(this.tokenUri, erc1155TokenBalance.tokenUri) &&
        Objects.equals(this.metadata, erc1155TokenBalance.metadata) &&
        Objects.equals(this.chainId, erc1155TokenBalance.chainId) &&
        Objects.equals(this.balance, erc1155TokenBalance.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, ercType, tokenId, tokenUri, metadata, chainId, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155TokenBalance {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ercType: ").append(toIndentedString(ercType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
