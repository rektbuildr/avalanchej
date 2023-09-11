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
import to.avax.glacier.model.Erc1155Transfer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListErc1155TransactionsResponse
 */

public class ListErc1155TransactionsResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("transactions")
  private List<Erc1155Transfer> transactions = new ArrayList<Erc1155Transfer>();

  public ListErc1155TransactionsResponse nextPageToken(String nextPageToken) {
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

  public ListErc1155TransactionsResponse transactions(List<Erc1155Transfer> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ListErc1155TransactionsResponse addTransactionsItem(Erc1155Transfer transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/

  public List<Erc1155Transfer> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Erc1155Transfer> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListErc1155TransactionsResponse listErc1155TransactionsResponse = (ListErc1155TransactionsResponse) o;
    return Objects.equals(this.nextPageToken, listErc1155TransactionsResponse.nextPageToken) &&
        Objects.equals(this.transactions, listErc1155TransactionsResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListErc1155TransactionsResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
