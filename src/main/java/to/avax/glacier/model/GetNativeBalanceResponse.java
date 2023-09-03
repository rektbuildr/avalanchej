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
 * GetNativeBalanceResponse
 */

public class GetNativeBalanceResponse {
  @JsonProperty("nativeTokenBalance")
  private AllOfGetNativeBalanceResponseNativeTokenBalance nativeTokenBalance = null;

  public GetNativeBalanceResponse nativeTokenBalance(AllOfGetNativeBalanceResponseNativeTokenBalance nativeTokenBalance) {
    this.nativeTokenBalance = nativeTokenBalance;
    return this;
  }

   /**
   * The native token balance for the address.
   * @return nativeTokenBalance
  **/

  public AllOfGetNativeBalanceResponseNativeTokenBalance getNativeTokenBalance() {
    return nativeTokenBalance;
  }

  public void setNativeTokenBalance(AllOfGetNativeBalanceResponseNativeTokenBalance nativeTokenBalance) {
    this.nativeTokenBalance = nativeTokenBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNativeBalanceResponse getNativeBalanceResponse = (GetNativeBalanceResponse) o;
    return Objects.equals(this.nativeTokenBalance, getNativeBalanceResponse.nativeTokenBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeTokenBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNativeBalanceResponse {\n");
    
    sb.append("    nativeTokenBalance: ").append(toIndentedString(nativeTokenBalance)).append("\n");
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
