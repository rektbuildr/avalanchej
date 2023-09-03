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
import to.avax.glacier.model.NetworkToken;
import java.io.IOException;
/**
 * NetworkTokenDetails
 */

public class NetworkTokenDetails {
  @JsonProperty("networkToken")
  private NetworkToken networkToken = null;

  @JsonProperty("currentPrice")
  private AllOfNetworkTokenDetailsCurrentPrice currentPrice = null;

  @JsonProperty("historicalPrice")
  private AllOfNetworkTokenDetailsHistoricalPrice historicalPrice = null;

  public NetworkTokenDetails networkToken(NetworkToken networkToken) {
    this.networkToken = networkToken;
    return this;
  }

   /**
   * Get networkToken
   * @return networkToken
  **/

  public NetworkToken getNetworkToken() {
    return networkToken;
  }

  public void setNetworkToken(NetworkToken networkToken) {
    this.networkToken = networkToken;
  }

  public NetworkTokenDetails currentPrice(AllOfNetworkTokenDetailsCurrentPrice currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

   /**
   * The current token price, if available.
   * @return currentPrice
  **/

  public AllOfNetworkTokenDetailsCurrentPrice getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(AllOfNetworkTokenDetailsCurrentPrice currentPrice) {
    this.currentPrice = currentPrice;
  }

  public NetworkTokenDetails historicalPrice(AllOfNetworkTokenDetailsHistoricalPrice historicalPrice) {
    this.historicalPrice = historicalPrice;
    return this;
  }

   /**
   * The historical token price at the time the transaction       occured, if available. Note, this is only provided if the transaction       occured more than 24 hours ago.
   * @return historicalPrice
  **/

  public AllOfNetworkTokenDetailsHistoricalPrice getHistoricalPrice() {
    return historicalPrice;
  }

  public void setHistoricalPrice(AllOfNetworkTokenDetailsHistoricalPrice historicalPrice) {
    this.historicalPrice = historicalPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTokenDetails networkTokenDetails = (NetworkTokenDetails) o;
    return Objects.equals(this.networkToken, networkTokenDetails.networkToken) &&
        Objects.equals(this.currentPrice, networkTokenDetails.currentPrice) &&
        Objects.equals(this.historicalPrice, networkTokenDetails.historicalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkToken, currentPrice, historicalPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTokenDetails {\n");
    
    sb.append("    networkToken: ").append(toIndentedString(networkToken)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    historicalPrice: ").append(toIndentedString(historicalPrice)).append("\n");
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
