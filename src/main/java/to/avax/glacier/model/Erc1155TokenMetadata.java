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
import to.avax.glacier.model.NftTokenMetadataStatus;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Erc1155TokenMetadata
 */

public class Erc1155TokenMetadata {
  @JsonProperty("indexStatus")
  private NftTokenMetadataStatus indexStatus = null;

  @JsonProperty("metadataLastUpdatedTimestamp")
  private BigDecimal metadataLastUpdatedTimestamp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("imageUri")
  private String imageUri = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("animationUri")
  private String animationUri = null;

  @JsonProperty("externalUrl")
  private String externalUrl = null;

  @JsonProperty("background")
  private String background = null;

  @JsonProperty("decimals")
  private BigDecimal decimals = null;

  @JsonProperty("properties")
  private String properties = null;

  public Erc1155TokenMetadata indexStatus(NftTokenMetadataStatus indexStatus) {
    this.indexStatus = indexStatus;
    return this;
  }

   /**
   * Get indexStatus
   * @return indexStatus
  **/

  public NftTokenMetadataStatus getIndexStatus() {
    return indexStatus;
  }

  public void setIndexStatus(NftTokenMetadataStatus indexStatus) {
    this.indexStatus = indexStatus;
  }

  public Erc1155TokenMetadata metadataLastUpdatedTimestamp(BigDecimal metadataLastUpdatedTimestamp) {
    this.metadataLastUpdatedTimestamp = metadataLastUpdatedTimestamp;
    return this;
  }

   /**
   * Get metadataLastUpdatedTimestamp
   * @return metadataLastUpdatedTimestamp
  **/

  public BigDecimal getMetadataLastUpdatedTimestamp() {
    return metadataLastUpdatedTimestamp;
  }

  public void setMetadataLastUpdatedTimestamp(BigDecimal metadataLastUpdatedTimestamp) {
    this.metadataLastUpdatedTimestamp = metadataLastUpdatedTimestamp;
  }

  public Erc1155TokenMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Erc1155TokenMetadata symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Erc1155TokenMetadata imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

   /**
   * Get imageUri
   * @return imageUri
  **/

  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  public Erc1155TokenMetadata description(String description) {
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

  public Erc1155TokenMetadata animationUri(String animationUri) {
    this.animationUri = animationUri;
    return this;
  }

   /**
   * Get animationUri
   * @return animationUri
  **/

  public String getAnimationUri() {
    return animationUri;
  }

  public void setAnimationUri(String animationUri) {
    this.animationUri = animationUri;
  }

  public Erc1155TokenMetadata externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/

  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public Erc1155TokenMetadata background(String background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/

  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  public Erc1155TokenMetadata decimals(BigDecimal decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * Get decimals
   * @return decimals
  **/

  public BigDecimal getDecimals() {
    return decimals;
  }

  public void setDecimals(BigDecimal decimals) {
    this.decimals = decimals;
  }

  public Erc1155TokenMetadata properties(String properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc1155TokenMetadata erc1155TokenMetadata = (Erc1155TokenMetadata) o;
    return Objects.equals(this.indexStatus, erc1155TokenMetadata.indexStatus) &&
        Objects.equals(this.metadataLastUpdatedTimestamp, erc1155TokenMetadata.metadataLastUpdatedTimestamp) &&
        Objects.equals(this.name, erc1155TokenMetadata.name) &&
        Objects.equals(this.symbol, erc1155TokenMetadata.symbol) &&
        Objects.equals(this.imageUri, erc1155TokenMetadata.imageUri) &&
        Objects.equals(this.description, erc1155TokenMetadata.description) &&
        Objects.equals(this.animationUri, erc1155TokenMetadata.animationUri) &&
        Objects.equals(this.externalUrl, erc1155TokenMetadata.externalUrl) &&
        Objects.equals(this.background, erc1155TokenMetadata.background) &&
        Objects.equals(this.decimals, erc1155TokenMetadata.decimals) &&
        Objects.equals(this.properties, erc1155TokenMetadata.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexStatus, metadataLastUpdatedTimestamp, name, symbol, imageUri, description, animationUri, externalUrl, background, decimals, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155TokenMetadata {\n");
    
    sb.append("    indexStatus: ").append(toIndentedString(indexStatus)).append("\n");
    sb.append("    metadataLastUpdatedTimestamp: ").append(toIndentedString(metadataLastUpdatedTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    animationUri: ").append(toIndentedString(animationUri)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
