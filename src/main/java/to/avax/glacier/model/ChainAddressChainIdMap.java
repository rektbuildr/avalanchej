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
import to.avax.glacier.model.BlockchainId;
import java.io.IOException;
/**
 * ChainAddressChainIdMap
 */

public class ChainAddressChainIdMap {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("blockchainIds")
  private BlockchainId blockchainIds = null;

  public ChainAddressChainIdMap address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ChainAddressChainIdMap blockchainIds(BlockchainId blockchainIds) {
    this.blockchainIds = blockchainIds;
    return this;
  }

   /**
   * Get blockchainIds
   * @return blockchainIds
  **/

  public BlockchainId getBlockchainIds() {
    return blockchainIds;
  }

  public void setBlockchainIds(BlockchainId blockchainIds) {
    this.blockchainIds = blockchainIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainAddressChainIdMap chainAddressChainIdMap = (ChainAddressChainIdMap) o;
    return Objects.equals(this.address, chainAddressChainIdMap.address) &&
        Objects.equals(this.blockchainIds, chainAddressChainIdMap.blockchainIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, blockchainIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainAddressChainIdMap {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    blockchainIds: ").append(toIndentedString(blockchainIds)).append("\n");
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
