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
import to.avax.glacier.model.Erc20Transfer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListErc20TransactionsResponse
 */

public class ListErc20TransactionsResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("transactions")
  private List<Erc20Transfer> transactions = new ArrayList<Erc20Transfer>();

  public ListErc20TransactionsResponse nextPageToken(String nextPageToken) {
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

  public ListErc20TransactionsResponse transactions(List<Erc20Transfer> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ListErc20TransactionsResponse addTransactionsItem(Erc20Transfer transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/

  public List<Erc20Transfer> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Erc20Transfer> transactions) {
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
    ListErc20TransactionsResponse listErc20TransactionsResponse = (ListErc20TransactionsResponse) o;
    return Objects.equals(this.nextPageToken, listErc20TransactionsResponse.nextPageToken) &&
        Objects.equals(this.transactions, listErc20TransactionsResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListErc20TransactionsResponse {\n");
    
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
