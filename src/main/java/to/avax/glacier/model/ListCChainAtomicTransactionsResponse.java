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
import java.util.ArrayList;
import java.util.List;
/**
 * ListCChainAtomicTransactionsResponse
 */

public class ListCChainAtomicTransactionsResponse implements InlineResponse2002 {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("transactions")
  private List<AnyOfListCChainAtomicTransactionsResponseTransactionsItems> transactions = new ArrayList<AnyOfListCChainAtomicTransactionsResponseTransactionsItems>();

  public ListCChainAtomicTransactionsResponse nextPageToken(String nextPageToken) {
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

  public ListCChainAtomicTransactionsResponse transactions(List<AnyOfListCChainAtomicTransactionsResponseTransactionsItems> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ListCChainAtomicTransactionsResponse addTransactionsItem(AnyOfListCChainAtomicTransactionsResponseTransactionsItems transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/

  public List<AnyOfListCChainAtomicTransactionsResponseTransactionsItems> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<AnyOfListCChainAtomicTransactionsResponseTransactionsItems> transactions) {
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
    ListCChainAtomicTransactionsResponse listCChainAtomicTransactionsResponse = (ListCChainAtomicTransactionsResponse) o;
    return Objects.equals(this.nextPageToken, listCChainAtomicTransactionsResponse.nextPageToken) &&
        Objects.equals(this.transactions, listCChainAtomicTransactionsResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCChainAtomicTransactionsResponse {\n");
    
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
