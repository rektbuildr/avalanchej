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
 * ProposerDetails
 */

public class ProposerDetails {
  @JsonProperty("proposerId")
  private String proposerId = null;

  @JsonProperty("proposerParentId")
  private String proposerParentId = null;

  @JsonProperty("proposerNodeId")
  private String proposerNodeId = null;

  @JsonProperty("proposerPChainHeight")
  private BigDecimal proposerPChainHeight = null;

  @JsonProperty("proposerTimestamp")
  private BigDecimal proposerTimestamp = null;

  public ProposerDetails proposerId(String proposerId) {
    this.proposerId = proposerId;
    return this;
  }

   /**
   * Get proposerId
   * @return proposerId
  **/

  public String getProposerId() {
    return proposerId;
  }

  public void setProposerId(String proposerId) {
    this.proposerId = proposerId;
  }

  public ProposerDetails proposerParentId(String proposerParentId) {
    this.proposerParentId = proposerParentId;
    return this;
  }

   /**
   * Get proposerParentId
   * @return proposerParentId
  **/

  public String getProposerParentId() {
    return proposerParentId;
  }

  public void setProposerParentId(String proposerParentId) {
    this.proposerParentId = proposerParentId;
  }

  public ProposerDetails proposerNodeId(String proposerNodeId) {
    this.proposerNodeId = proposerNodeId;
    return this;
  }

   /**
   * Get proposerNodeId
   * @return proposerNodeId
  **/

  public String getProposerNodeId() {
    return proposerNodeId;
  }

  public void setProposerNodeId(String proposerNodeId) {
    this.proposerNodeId = proposerNodeId;
  }

  public ProposerDetails proposerPChainHeight(BigDecimal proposerPChainHeight) {
    this.proposerPChainHeight = proposerPChainHeight;
    return this;
  }

   /**
   * Get proposerPChainHeight
   * @return proposerPChainHeight
  **/

  public BigDecimal getProposerPChainHeight() {
    return proposerPChainHeight;
  }

  public void setProposerPChainHeight(BigDecimal proposerPChainHeight) {
    this.proposerPChainHeight = proposerPChainHeight;
  }

  public ProposerDetails proposerTimestamp(BigDecimal proposerTimestamp) {
    this.proposerTimestamp = proposerTimestamp;
    return this;
  }

   /**
   * Get proposerTimestamp
   * @return proposerTimestamp
  **/

  public BigDecimal getProposerTimestamp() {
    return proposerTimestamp;
  }

  public void setProposerTimestamp(BigDecimal proposerTimestamp) {
    this.proposerTimestamp = proposerTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProposerDetails proposerDetails = (ProposerDetails) o;
    return Objects.equals(this.proposerId, proposerDetails.proposerId) &&
        Objects.equals(this.proposerParentId, proposerDetails.proposerParentId) &&
        Objects.equals(this.proposerNodeId, proposerDetails.proposerNodeId) &&
        Objects.equals(this.proposerPChainHeight, proposerDetails.proposerPChainHeight) &&
        Objects.equals(this.proposerTimestamp, proposerDetails.proposerTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposerId, proposerParentId, proposerNodeId, proposerPChainHeight, proposerTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProposerDetails {\n");
    
    sb.append("    proposerId: ").append(toIndentedString(proposerId)).append("\n");
    sb.append("    proposerParentId: ").append(toIndentedString(proposerParentId)).append("\n");
    sb.append("    proposerNodeId: ").append(toIndentedString(proposerNodeId)).append("\n");
    sb.append("    proposerPChainHeight: ").append(toIndentedString(proposerPChainHeight)).append("\n");
    sb.append("    proposerTimestamp: ").append(toIndentedString(proposerTimestamp)).append("\n");
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
