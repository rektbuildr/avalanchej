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
import to.avax.glacier.model.XChainVertex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListXChainVerticesResponse
 */

public class ListXChainVerticesResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("vertices")
  private List<XChainVertex> vertices = new ArrayList<XChainVertex>();

  public ListXChainVerticesResponse nextPageToken(String nextPageToken) {
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

  public ListXChainVerticesResponse vertices(List<XChainVertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  public ListXChainVerticesResponse addVerticesItem(XChainVertex verticesItem) {
    this.vertices.add(verticesItem);
    return this;
  }

   /**
   * Get vertices
   * @return vertices
  **/

  public List<XChainVertex> getVertices() {
    return vertices;
  }

  public void setVertices(List<XChainVertex> vertices) {
    this.vertices = vertices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListXChainVerticesResponse listXChainVerticesResponse = (ListXChainVerticesResponse) o;
    return Objects.equals(this.nextPageToken, listXChainVerticesResponse.nextPageToken) &&
        Objects.equals(this.vertices, listXChainVerticesResponse.vertices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, vertices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListXChainVerticesResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
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
