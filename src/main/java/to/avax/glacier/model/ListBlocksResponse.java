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
import to.avax.glacier.model.Block;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListBlocksResponse
 */

public class ListBlocksResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("blocks")
  private List<Block> blocks = new ArrayList<Block>();

  public ListBlocksResponse nextPageToken(String nextPageToken) {
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

  public ListBlocksResponse blocks(List<Block> blocks) {
    this.blocks = blocks;
    return this;
  }

  public ListBlocksResponse addBlocksItem(Block blocksItem) {
    this.blocks.add(blocksItem);
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/

  public List<Block> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<Block> blocks) {
    this.blocks = blocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBlocksResponse listBlocksResponse = (ListBlocksResponse) o;
    return Objects.equals(this.nextPageToken, listBlocksResponse.nextPageToken) &&
        Objects.equals(this.blocks, listBlocksResponse.blocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, blocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBlocksResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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
