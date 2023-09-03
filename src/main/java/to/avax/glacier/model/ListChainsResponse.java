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
import to.avax.glacier.model.ChainInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListChainsResponse
 */

public class ListChainsResponse {
  @JsonProperty("chains")
  private List<ChainInfo> chains = new ArrayList<ChainInfo>();

  public ListChainsResponse chains(List<ChainInfo> chains) {
    this.chains = chains;
    return this;
  }

  public ListChainsResponse addChainsItem(ChainInfo chainsItem) {
    this.chains.add(chainsItem);
    return this;
  }

   /**
   * Get chains
   * @return chains
  **/

  public List<ChainInfo> getChains() {
    return chains;
  }

  public void setChains(List<ChainInfo> chains) {
    this.chains = chains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListChainsResponse listChainsResponse = (ListChainsResponse) o;
    return Objects.equals(this.chains, listChainsResponse.chains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListChainsResponse {\n");
    
    sb.append("    chains: ").append(toIndentedString(chains)).append("\n");
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
