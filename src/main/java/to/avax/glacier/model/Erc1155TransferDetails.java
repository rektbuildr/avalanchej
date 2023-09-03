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
import to.avax.glacier.model.Erc1155Token;
import to.avax.glacier.model.RichAddress;
import java.io.IOException;
/**
 * Erc1155TransferDetails
 */

public class Erc1155TransferDetails {
  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("erc1155Token")
  private Erc1155Token erc1155Token = null;

  public Erc1155TransferDetails from(RichAddress from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/

  public RichAddress getFrom() {
    return from;
  }

  public void setFrom(RichAddress from) {
    this.from = from;
  }

  public Erc1155TransferDetails to(RichAddress to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/

  public RichAddress getTo() {
    return to;
  }

  public void setTo(RichAddress to) {
    this.to = to;
  }

  public Erc1155TransferDetails value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Erc1155TransferDetails erc1155Token(Erc1155Token erc1155Token) {
    this.erc1155Token = erc1155Token;
    return this;
  }

   /**
   * Get erc1155Token
   * @return erc1155Token
  **/

  public Erc1155Token getErc1155Token() {
    return erc1155Token;
  }

  public void setErc1155Token(Erc1155Token erc1155Token) {
    this.erc1155Token = erc1155Token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc1155TransferDetails erc1155TransferDetails = (Erc1155TransferDetails) o;
    return Objects.equals(this.from, erc1155TransferDetails.from) &&
        Objects.equals(this.to, erc1155TransferDetails.to) &&
        Objects.equals(this.value, erc1155TransferDetails.value) &&
        Objects.equals(this.erc1155Token, erc1155TransferDetails.erc1155Token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, value, erc1155Token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155TransferDetails {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    erc1155Token: ").append(toIndentedString(erc1155Token)).append("\n");
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
