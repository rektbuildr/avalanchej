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
import to.avax.glacier.model.OperationStatus;
import to.avax.glacier.model.OperationType;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * OperationStatusResponse
 */

public class OperationStatusResponse {
  @JsonProperty("operationId")
  private String operationId = null;

  @JsonProperty("operationType")
  private OperationType operationType = null;

  @JsonProperty("operationStatus")
  private OperationStatus operationStatus = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("metadata")
  private OneOfOperationStatusResponseMetadata metadata = null;

  @JsonProperty("createdAtTimestamp")
  private BigDecimal createdAtTimestamp = null;

  @JsonProperty("updatedAtTimestamp")
  private BigDecimal updatedAtTimestamp = null;

  public OperationStatusResponse operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Get operationId
   * @return operationId
  **/

  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public OperationStatusResponse operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public OperationStatusResponse operationStatus(OperationStatus operationStatus) {
    this.operationStatus = operationStatus;
    return this;
  }

   /**
   * Get operationStatus
   * @return operationStatus
  **/

  public OperationStatus getOperationStatus() {
    return operationStatus;
  }

  public void setOperationStatus(OperationStatus operationStatus) {
    this.operationStatus = operationStatus;
  }

  public OperationStatusResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OperationStatusResponse metadata(OneOfOperationStatusResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  public OneOfOperationStatusResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(OneOfOperationStatusResponseMetadata metadata) {
    this.metadata = metadata;
  }

  public OperationStatusResponse createdAtTimestamp(BigDecimal createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Get createdAtTimestamp
   * @return createdAtTimestamp
  **/

  public BigDecimal getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }

  public void setCreatedAtTimestamp(BigDecimal createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }

  public OperationStatusResponse updatedAtTimestamp(BigDecimal updatedAtTimestamp) {
    this.updatedAtTimestamp = updatedAtTimestamp;
    return this;
  }

   /**
   * Get updatedAtTimestamp
   * @return updatedAtTimestamp
  **/

  public BigDecimal getUpdatedAtTimestamp() {
    return updatedAtTimestamp;
  }

  public void setUpdatedAtTimestamp(BigDecimal updatedAtTimestamp) {
    this.updatedAtTimestamp = updatedAtTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationStatusResponse operationStatusResponse = (OperationStatusResponse) o;
    return Objects.equals(this.operationId, operationStatusResponse.operationId) &&
        Objects.equals(this.operationType, operationStatusResponse.operationType) &&
        Objects.equals(this.operationStatus, operationStatusResponse.operationStatus) &&
        Objects.equals(this.message, operationStatusResponse.message) &&
        Objects.equals(this.metadata, operationStatusResponse.metadata) &&
        Objects.equals(this.createdAtTimestamp, operationStatusResponse.createdAtTimestamp) &&
        Objects.equals(this.updatedAtTimestamp, operationStatusResponse.updatedAtTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationType, operationStatus, message, metadata, createdAtTimestamp, updatedAtTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationStatusResponse {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
    sb.append("    updatedAtTimestamp: ").append(toIndentedString(updatedAtTimestamp)).append("\n");
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
