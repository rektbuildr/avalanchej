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
/**
 * EVMInput
 */

public class EVMInput {
  @JsonProperty("fromAddress")
  private String fromAddress = null;

  @JsonProperty("asset")
  private AllOfEVMInputAsset asset = null;

  public EVMInput fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * EVM address from which the asset is exported in ExportTx.
   * @return fromAddress
  **/

  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public EVMInput asset(AllOfEVMInputAsset asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset details for the asset being transferred.
   * @return asset
  **/

  public AllOfEVMInputAsset getAsset() {
    return asset;
  }

  public void setAsset(AllOfEVMInputAsset asset) {
    this.asset = asset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EVMInput evMInput = (EVMInput) o;
    return Objects.equals(this.fromAddress, evMInput.fromAddress) &&
        Objects.equals(this.asset, evMInput.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, asset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EVMInput {\n");
    
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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
