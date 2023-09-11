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
import to.avax.glacier.model.PChainUtxo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListPChainUtxosResponse
 */

public class ListPChainUtxosResponse implements InlineResponse2003 {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("utxos")
  private List<PChainUtxo> utxos = new ArrayList<PChainUtxo>();

  public ListPChainUtxosResponse nextPageToken(String nextPageToken) {
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

  public ListPChainUtxosResponse utxos(List<PChainUtxo> utxos) {
    this.utxos = utxos;
    return this;
  }

  public ListPChainUtxosResponse addUtxosItem(PChainUtxo utxosItem) {
    this.utxos.add(utxosItem);
    return this;
  }

   /**
   * Get utxos
   * @return utxos
  **/

  public List<PChainUtxo> getUtxos() {
    return utxos;
  }

  public void setUtxos(List<PChainUtxo> utxos) {
    this.utxos = utxos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPChainUtxosResponse listPChainUtxosResponse = (ListPChainUtxosResponse) o;
    return Objects.equals(this.nextPageToken, listPChainUtxosResponse.nextPageToken) &&
        Objects.equals(this.utxos, listPChainUtxosResponse.utxos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, utxos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPChainUtxosResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    utxos: ").append(toIndentedString(utxos)).append("\n");
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
