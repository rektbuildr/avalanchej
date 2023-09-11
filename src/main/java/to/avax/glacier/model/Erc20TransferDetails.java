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
import to.avax.glacier.model.Erc20Token;
import to.avax.glacier.model.RichAddress;
import java.io.IOException;
/**
 * Erc20TransferDetails
 */

public class Erc20TransferDetails {
  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("erc20Token")
  private Erc20Token erc20Token = null;

  public Erc20TransferDetails from(RichAddress from) {
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

  public Erc20TransferDetails to(RichAddress to) {
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

  public Erc20TransferDetails value(String value) {
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

  public Erc20TransferDetails erc20Token(Erc20Token erc20Token) {
    this.erc20Token = erc20Token;
    return this;
  }

   /**
   * Get erc20Token
   * @return erc20Token
  **/

  public Erc20Token getErc20Token() {
    return erc20Token;
  }

  public void setErc20Token(Erc20Token erc20Token) {
    this.erc20Token = erc20Token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc20TransferDetails erc20TransferDetails = (Erc20TransferDetails) o;
    return Objects.equals(this.from, erc20TransferDetails.from) &&
        Objects.equals(this.to, erc20TransferDetails.to) &&
        Objects.equals(this.value, erc20TransferDetails.value) &&
        Objects.equals(this.erc20Token, erc20TransferDetails.erc20Token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, value, erc20Token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc20TransferDetails {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    erc20Token: ").append(toIndentedString(erc20Token)).append("\n");
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
