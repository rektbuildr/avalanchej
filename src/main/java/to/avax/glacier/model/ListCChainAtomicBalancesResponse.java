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

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.CChainAtomicBalances;
import java.io.IOException;
/**
 * ListCChainAtomicBalancesResponse
 */

public class ListCChainAtomicBalancesResponse implements InlineResponse2004 {
  @JsonProperty("balances")
  private CChainAtomicBalances balances = null;

  public ListCChainAtomicBalancesResponse balances(CChainAtomicBalances balances) {
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/

  public CChainAtomicBalances getBalances() {
    return balances;
  }

  public void setBalances(CChainAtomicBalances balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCChainAtomicBalancesResponse listCChainAtomicBalancesResponse = (ListCChainAtomicBalancesResponse) o;
    return Objects.equals(this.balances, listCChainAtomicBalancesResponse.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCChainAtomicBalancesResponse {\n");
    
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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
