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

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.EvmNetworkOptions;
import to.avax.glacier.model.PrimaryNetworkOptions;
import java.io.IOException;
/**
 * CreateTransactionExportRequest
 */

public class CreateTransactionExportRequest {
  @JsonProperty("startDate")
  private LocalDateTime startDate = null;

  @JsonProperty("endDate")
  private LocalDateTime endDate = null;

  @JsonProperty("primaryNetwork")
  private PrimaryNetworkOptions primaryNetwork = null;

  @JsonProperty("evmNetwork")
  private EvmNetworkOptions evmNetwork = null;

  public CreateTransactionExportRequest startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public CreateTransactionExportRequest endDate(LocalDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public CreateTransactionExportRequest primaryNetwork(PrimaryNetworkOptions primaryNetwork) {
    this.primaryNetwork = primaryNetwork;
    return this;
  }

   /**
   * Get primaryNetwork
   * @return primaryNetwork
  **/

  public PrimaryNetworkOptions getPrimaryNetwork() {
    return primaryNetwork;
  }

  public void setPrimaryNetwork(PrimaryNetworkOptions primaryNetwork) {
    this.primaryNetwork = primaryNetwork;
  }

  public CreateTransactionExportRequest evmNetwork(EvmNetworkOptions evmNetwork) {
    this.evmNetwork = evmNetwork;
    return this;
  }

   /**
   * Get evmNetwork
   * @return evmNetwork
  **/

  public EvmNetworkOptions getEvmNetwork() {
    return evmNetwork;
  }

  public void setEvmNetwork(EvmNetworkOptions evmNetwork) {
    this.evmNetwork = evmNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransactionExportRequest createTransactionExportRequest = (CreateTransactionExportRequest) o;
    return Objects.equals(this.startDate, createTransactionExportRequest.startDate) &&
        Objects.equals(this.endDate, createTransactionExportRequest.endDate) &&
        Objects.equals(this.primaryNetwork, createTransactionExportRequest.primaryNetwork) &&
        Objects.equals(this.evmNetwork, createTransactionExportRequest.evmNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, primaryNetwork, evmNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionExportRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    primaryNetwork: ").append(toIndentedString(primaryNetwork)).append("\n");
    sb.append("    evmNetwork: ").append(toIndentedString(evmNetwork)).append("\n");
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
