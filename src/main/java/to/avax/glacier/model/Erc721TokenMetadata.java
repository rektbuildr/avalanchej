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
 * Erc721TokenMetadata
 */

public class Erc721TokenMetadata {
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

  @JsonProperty("attributes")
  private String attributes = null;

  public Erc721TokenMetadata indexStatus(NftTokenMetadataStatus indexStatus) {
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

  public Erc721TokenMetadata metadataLastUpdatedTimestamp(BigDecimal metadataLastUpdatedTimestamp) {
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

  public Erc721TokenMetadata name(String name) {
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

  public Erc721TokenMetadata symbol(String symbol) {
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

  public Erc721TokenMetadata imageUri(String imageUri) {
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

  public Erc721TokenMetadata description(String description) {
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

  public Erc721TokenMetadata animationUri(String animationUri) {
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

  public Erc721TokenMetadata externalUrl(String externalUrl) {
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

  public Erc721TokenMetadata background(String background) {
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

  public Erc721TokenMetadata attributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/

  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc721TokenMetadata erc721TokenMetadata = (Erc721TokenMetadata) o;
    return Objects.equals(this.indexStatus, erc721TokenMetadata.indexStatus) &&
        Objects.equals(this.metadataLastUpdatedTimestamp, erc721TokenMetadata.metadataLastUpdatedTimestamp) &&
        Objects.equals(this.name, erc721TokenMetadata.name) &&
        Objects.equals(this.symbol, erc721TokenMetadata.symbol) &&
        Objects.equals(this.imageUri, erc721TokenMetadata.imageUri) &&
        Objects.equals(this.description, erc721TokenMetadata.description) &&
        Objects.equals(this.animationUri, erc721TokenMetadata.animationUri) &&
        Objects.equals(this.externalUrl, erc721TokenMetadata.externalUrl) &&
        Objects.equals(this.background, erc721TokenMetadata.background) &&
        Objects.equals(this.attributes, erc721TokenMetadata.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexStatus, metadataLastUpdatedTimestamp, name, symbol, imageUri, description, animationUri, externalUrl, background, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc721TokenMetadata {\n");
    
    sb.append("    indexStatus: ").append(toIndentedString(indexStatus)).append("\n");
    sb.append("    metadataLastUpdatedTimestamp: ").append(toIndentedString(metadataLastUpdatedTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    animationUri: ").append(toIndentedString(animationUri)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
