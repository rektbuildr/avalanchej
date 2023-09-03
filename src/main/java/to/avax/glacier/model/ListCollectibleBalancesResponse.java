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
import java.util.ArrayList;
import java.util.List;
/**
 * ListCollectibleBalancesResponse
 */

public class ListCollectibleBalancesResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("collectibleBalances")
  private List<OneOfListCollectibleBalancesResponseCollectibleBalancesItems> collectibleBalances = new ArrayList<OneOfListCollectibleBalancesResponseCollectibleBalancesItems>();

  public ListCollectibleBalancesResponse nextPageToken(String nextPageToken) {
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

  public ListCollectibleBalancesResponse collectibleBalances(List<OneOfListCollectibleBalancesResponseCollectibleBalancesItems> collectibleBalances) {
    this.collectibleBalances = collectibleBalances;
    return this;
  }

  public ListCollectibleBalancesResponse addCollectibleBalancesItem(OneOfListCollectibleBalancesResponseCollectibleBalancesItems collectibleBalancesItem) {
    this.collectibleBalances.add(collectibleBalancesItem);
    return this;
  }

   /**
   * The list of ERC-721 and ERC-1155 token balances for the       address.
   * @return collectibleBalances
  **/

  public List<OneOfListCollectibleBalancesResponseCollectibleBalancesItems> getCollectibleBalances() {
    return collectibleBalances;
  }

  public void setCollectibleBalances(List<OneOfListCollectibleBalancesResponseCollectibleBalancesItems> collectibleBalances) {
    this.collectibleBalances = collectibleBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCollectibleBalancesResponse listCollectibleBalancesResponse = (ListCollectibleBalancesResponse) o;
    return Objects.equals(this.nextPageToken, listCollectibleBalancesResponse.nextPageToken) &&
        Objects.equals(this.collectibleBalances, listCollectibleBalancesResponse.collectibleBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, collectibleBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCollectibleBalancesResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    collectibleBalances: ").append(toIndentedString(collectibleBalances)).append("\n");
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
