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
import to.avax.glacier.model.Erc20TokenBalance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListErc20BalancesResponse
 */

public class ListErc20BalancesResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("erc20TokenBalances")
  private List<Erc20TokenBalance> erc20TokenBalances = new ArrayList<Erc20TokenBalance>();

  public ListErc20BalancesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A token, which can be sent as &#x60;pageToken&#x60; to retrieve the next page. If this field is omitted or empty, there are no subsequent pages.
   * @return nextPageToken
  **/

  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListErc20BalancesResponse erc20TokenBalances(List<Erc20TokenBalance> erc20TokenBalances) {
    this.erc20TokenBalances = erc20TokenBalances;
    return this;
  }

  public ListErc20BalancesResponse addErc20TokenBalancesItem(Erc20TokenBalance erc20TokenBalancesItem) {
    this.erc20TokenBalances.add(erc20TokenBalancesItem);
    return this;
  }

   /**
   * The list of ERC-20 token balances for the address.
   * @return erc20TokenBalances
  **/

  public List<Erc20TokenBalance> getErc20TokenBalances() {
    return erc20TokenBalances;
  }

  public void setErc20TokenBalances(List<Erc20TokenBalance> erc20TokenBalances) {
    this.erc20TokenBalances = erc20TokenBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListErc20BalancesResponse listErc20BalancesResponse = (ListErc20BalancesResponse) o;
    return Objects.equals(this.nextPageToken, listErc20BalancesResponse.nextPageToken) &&
        Objects.equals(this.erc20TokenBalances, listErc20BalancesResponse.erc20TokenBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, erc20TokenBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListErc20BalancesResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    erc20TokenBalances: ").append(toIndentedString(erc20TokenBalances)).append("\n");
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
