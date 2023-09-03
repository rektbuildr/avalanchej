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
 * ListTransfersResponse
 */

public class ListTransfersResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("transfers")
  private List<String> transfers = new ArrayList<String>();

  public ListTransfersResponse nextPageToken(String nextPageToken) {
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

  public ListTransfersResponse transfers(List<String> transfers) {
    this.transfers = transfers;
    return this;
  }

  public ListTransfersResponse addTransfersItem(String transfersItem) {
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/

  public List<String> getTransfers() {
    return transfers;
  }

  public void setTransfers(List<String> transfers) {
    this.transfers = transfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransfersResponse listTransfersResponse = (ListTransfersResponse) o;
    return Objects.equals(this.nextPageToken, listTransfersResponse.nextPageToken) &&
        Objects.equals(this.transfers, listTransfersResponse.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransfersResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
