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
 * PrimaryNetworkOptions
 */

public class PrimaryNetworkOptions {
  @JsonProperty("addresses")
  private List<String> addresses = new ArrayList<String>();

  /**
   * Gets or Sets includeChains
   */
  public enum IncludeChainsEnum {
    P_CHAIN("p-chain"),
    X_CHAIN("x-chain"),
    C_CHAIN("c-chain"),
    _11111111111111111111111111111111LPOYY("11111111111111111111111111111111LpoYY"),
    _2OYMBNV4ENHYQK2FJJV5NVQLDBTMNJZQ5S3QS3LO6FTNC6FBYM("2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM");

    private String value;

    IncludeChainsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IncludeChainsEnum fromValue(String input) {
      for (IncludeChainsEnum b : IncludeChainsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }

  @JsonProperty("includeChains")
  private List<IncludeChainsEnum> includeChains = new ArrayList<IncludeChainsEnum>();

  public PrimaryNetworkOptions addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PrimaryNetworkOptions addAddressesItem(String addressesItem) {
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

  public PrimaryNetworkOptions includeChains(List<IncludeChainsEnum> includeChains) {
    this.includeChains = includeChains;
    return this;
  }

  public PrimaryNetworkOptions addIncludeChainsItem(IncludeChainsEnum includeChainsItem) {
    this.includeChains.add(includeChainsItem);
    return this;
  }

   /**
   * Get includeChains
   * @return includeChains
  **/

  public List<IncludeChainsEnum> getIncludeChains() {
    return includeChains;
  }

  public void setIncludeChains(List<IncludeChainsEnum> includeChains) {
    this.includeChains = includeChains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryNetworkOptions primaryNetworkOptions = (PrimaryNetworkOptions) o;
    return Objects.equals(this.addresses, primaryNetworkOptions.addresses) &&
        Objects.equals(this.includeChains, primaryNetworkOptions.includeChains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, includeChains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryNetworkOptions {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    includeChains: ").append(toIndentedString(includeChains)).append("\n");
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
