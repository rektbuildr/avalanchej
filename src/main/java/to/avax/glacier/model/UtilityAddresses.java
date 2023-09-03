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
 * UtilityAddresses
 */

public class UtilityAddresses {
  @JsonProperty("multicall")
  private String multicall = null;

  public UtilityAddresses multicall(String multicall) {
    this.multicall = multicall;
    return this;
  }

   /**
   * Get multicall
   * @return multicall
  **/

  public String getMulticall() {
    return multicall;
  }

  public void setMulticall(String multicall) {
    this.multicall = multicall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilityAddresses utilityAddresses = (UtilityAddresses) o;
    return Objects.equals(this.multicall, utilityAddresses.multicall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multicall);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilityAddresses {\n");
    
    sb.append("    multicall: ").append(toIndentedString(multicall)).append("\n");
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
