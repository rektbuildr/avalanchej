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
 * EvmNetworkOptions
 */

public class EvmNetworkOptions {
  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  @JsonProperty("includeChainIds")
  private List<String> includeChainIds = new ArrayList<String>();

  public EvmNetworkOptions addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EvmNetworkOptions addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public EvmNetworkOptions includeChainIds(List<String> includeChainIds) {
    this.includeChainIds = includeChainIds;
    return this;
  }

  public EvmNetworkOptions addIncludeChainIdsItem(String includeChainIdsItem) {
    this.includeChainIds.add(includeChainIdsItem);
    return this;
  }

   /**
   * Get includeChainIds
   * @return includeChainIds
  **/

  public List<String> getIncludeChainIds() {
    return includeChainIds;
  }

  public void setIncludeChainIds(List<String> includeChainIds) {
    this.includeChainIds = includeChainIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvmNetworkOptions evmNetworkOptions = (EvmNetworkOptions) o;
    return Objects.equals(this.addresses, evmNetworkOptions.addresses) &&
        Objects.equals(this.includeChainIds, evmNetworkOptions.includeChainIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, includeChainIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvmNetworkOptions {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    includeChainIds: ").append(toIndentedString(includeChainIds)).append("\n");
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
