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
/**
 * EVMOutput
 */

public class EVMOutput {
  @JsonProperty("toAddress")
  private String toAddress = null;

  @JsonProperty("asset")
  private AllOfEVMOutputAsset asset = null;

  public EVMOutput toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }

   /**
   * EVM address to which the asset is imported in ImportTx
   * @return toAddress
  **/

  public String getToAddress() {
    return toAddress;
  }

  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  public EVMOutput asset(AllOfEVMOutputAsset asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Asset details for the asset being transferred.
   * @return asset
  **/

  public AllOfEVMOutputAsset getAsset() {
    return asset;
  }

  public void setAsset(AllOfEVMOutputAsset asset) {
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
    EVMOutput evMOutput = (EVMOutput) o;
    return Objects.equals(this.toAddress, evMOutput.toAddress) &&
        Objects.equals(this.asset, evMOutput.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAddress, asset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EVMOutput {\n");
    
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
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
