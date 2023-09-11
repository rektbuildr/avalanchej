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
import to.avax.glacier.model.ChainAddressChainIdMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ChainAddressChainIdMapListResponse
 */

public class ChainAddressChainIdMapListResponse {
  @JsonProperty("addresses")
  private List<ChainAddressChainIdMap> addresses = new ArrayList<ChainAddressChainIdMap>();

  public ChainAddressChainIdMapListResponse addresses(List<ChainAddressChainIdMap> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ChainAddressChainIdMapListResponse addAddressesItem(ChainAddressChainIdMap addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/

  public List<ChainAddressChainIdMap> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<ChainAddressChainIdMap> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainAddressChainIdMapListResponse chainAddressChainIdMapListResponse = (ChainAddressChainIdMapListResponse) o;
    return Objects.equals(this.addresses, chainAddressChainIdMapListResponse.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainAddressChainIdMapListResponse {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
