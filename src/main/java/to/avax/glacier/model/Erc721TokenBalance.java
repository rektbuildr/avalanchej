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
import to.avax.glacier.model.Erc721TokenMetadata;
import java.io.IOException;
/**
 * Erc721TokenBalance
 */

public class Erc721TokenBalance implements OneOfListCollectibleBalancesResponseCollectibleBalancesItems {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  /**
   * Gets or Sets ercType
   */
  public enum ErcTypeEnum {
    ERC_721("ERC-721");

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
  private Erc721TokenMetadata metadata = null;

  @JsonProperty("ownerAddress")
  private String ownerAddress = null;

  @JsonProperty("chainId")
  private String chainId = null;

  public Erc721TokenBalance address(String address) {
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

  public Erc721TokenBalance name(String name) {
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

  public Erc721TokenBalance symbol(String symbol) {
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

  public Erc721TokenBalance ercType(ErcTypeEnum ercType) {
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

  public Erc721TokenBalance tokenId(String tokenId) {
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

  public Erc721TokenBalance tokenUri(String tokenUri) {
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

  public Erc721TokenBalance metadata(Erc721TokenMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public Erc721TokenMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Erc721TokenMetadata metadata) {
    this.metadata = metadata;
  }

  public Erc721TokenBalance ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * A wallet or contract address in mixed-case checksum encoding.
   * @return ownerAddress
  **/

  public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public Erc721TokenBalance chainId(String chainId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc721TokenBalance erc721TokenBalance = (Erc721TokenBalance) o;
    return Objects.equals(this.address, erc721TokenBalance.address) &&
        Objects.equals(this.name, erc721TokenBalance.name) &&
        Objects.equals(this.symbol, erc721TokenBalance.symbol) &&
        Objects.equals(this.ercType, erc721TokenBalance.ercType) &&
        Objects.equals(this.tokenId, erc721TokenBalance.tokenId) &&
        Objects.equals(this.tokenUri, erc721TokenBalance.tokenUri) &&
        Objects.equals(this.metadata, erc721TokenBalance.metadata) &&
        Objects.equals(this.ownerAddress, erc721TokenBalance.ownerAddress) &&
        Objects.equals(this.chainId, erc721TokenBalance.chainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, symbol, ercType, tokenId, tokenUri, metadata, ownerAddress, chainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc721TokenBalance {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    ercType: ").append(toIndentedString(ercType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
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
