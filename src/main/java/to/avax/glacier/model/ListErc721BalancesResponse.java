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
import to.avax.glacier.model.Erc721TokenBalance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListErc721BalancesResponse
 */

public class ListErc721BalancesResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("erc721TokenBalances")
  private List<Erc721TokenBalance> erc721TokenBalances = new ArrayList<Erc721TokenBalance>();

  public ListErc721BalancesResponse nextPageToken(String nextPageToken) {
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

  public ListErc721BalancesResponse erc721TokenBalances(List<Erc721TokenBalance> erc721TokenBalances) {
    this.erc721TokenBalances = erc721TokenBalances;
    return this;
  }

  public ListErc721BalancesResponse addErc721TokenBalancesItem(Erc721TokenBalance erc721TokenBalancesItem) {
    this.erc721TokenBalances.add(erc721TokenBalancesItem);
    return this;
  }

   /**
   * The list of ERC-721 token balances for the address.
   * @return erc721TokenBalances
  **/

  public List<Erc721TokenBalance> getErc721TokenBalances() {
    return erc721TokenBalances;
  }

  public void setErc721TokenBalances(List<Erc721TokenBalance> erc721TokenBalances) {
    this.erc721TokenBalances = erc721TokenBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListErc721BalancesResponse listErc721BalancesResponse = (ListErc721BalancesResponse) o;
    return Objects.equals(this.nextPageToken, listErc721BalancesResponse.nextPageToken) &&
        Objects.equals(this.erc721TokenBalances, listErc721BalancesResponse.erc721TokenBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, erc721TokenBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListErc721BalancesResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    erc721TokenBalances: ").append(toIndentedString(erc721TokenBalances)).append("\n");
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
