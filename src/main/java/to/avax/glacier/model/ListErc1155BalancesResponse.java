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
import to.avax.glacier.model.Erc1155TokenBalance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListErc1155BalancesResponse
 */

public class ListErc1155BalancesResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("erc1155TokenBalances")
  private List<Erc1155TokenBalance> erc1155TokenBalances = new ArrayList<Erc1155TokenBalance>();

  public ListErc1155BalancesResponse nextPageToken(String nextPageToken) {
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

  public ListErc1155BalancesResponse erc1155TokenBalances(List<Erc1155TokenBalance> erc1155TokenBalances) {
    this.erc1155TokenBalances = erc1155TokenBalances;
    return this;
  }

  public ListErc1155BalancesResponse addErc1155TokenBalancesItem(Erc1155TokenBalance erc1155TokenBalancesItem) {
    this.erc1155TokenBalances.add(erc1155TokenBalancesItem);
    return this;
  }

   /**
   * The list of ERC-1155 token balances for the address.
   * @return erc1155TokenBalances
  **/

  public List<Erc1155TokenBalance> getErc1155TokenBalances() {
    return erc1155TokenBalances;
  }

  public void setErc1155TokenBalances(List<Erc1155TokenBalance> erc1155TokenBalances) {
    this.erc1155TokenBalances = erc1155TokenBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListErc1155BalancesResponse listErc1155BalancesResponse = (ListErc1155BalancesResponse) o;
    return Objects.equals(this.nextPageToken, listErc1155BalancesResponse.nextPageToken) &&
        Objects.equals(this.erc1155TokenBalances, listErc1155BalancesResponse.erc1155TokenBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, erc1155TokenBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListErc1155BalancesResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    erc1155TokenBalances: ").append(toIndentedString(erc1155TokenBalances)).append("\n");
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
