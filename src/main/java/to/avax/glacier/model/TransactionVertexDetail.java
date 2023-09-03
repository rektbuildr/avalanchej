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
 * TransactionVertexDetail
 */

public class TransactionVertexDetail {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("height")
  private BigDecimal height = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  public TransactionVertexDetail hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Vertex ID of the vertex this transaction belongs to.
   * @return hash
  **/

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public TransactionVertexDetail height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Vertex height of the vertex this transaction belongs to.
   * @return height
  **/

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public TransactionVertexDetail timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp in seconds this vertex was accepted.
   * @return timestamp
  **/

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVertexDetail transactionVertexDetail = (TransactionVertexDetail) o;
    return Objects.equals(this.hash, transactionVertexDetail.hash) &&
        Objects.equals(this.height, transactionVertexDetail.height) &&
        Objects.equals(this.timestamp, transactionVertexDetail.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, height, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVertexDetail {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
