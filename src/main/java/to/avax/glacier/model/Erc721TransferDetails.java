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
import to.avax.glacier.model.Erc721Token;
import to.avax.glacier.model.RichAddress;
import java.io.IOException;
/**
 * Erc721TransferDetails
 */

public class Erc721TransferDetails {
  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("erc721Token")
  private Erc721Token erc721Token = null;

  public Erc721TransferDetails from(RichAddress from) {
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

  public Erc721TransferDetails to(RichAddress to) {
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

  public Erc721TransferDetails erc721Token(Erc721Token erc721Token) {
    this.erc721Token = erc721Token;
    return this;
  }

   /**
   * Get erc721Token
   * @return erc721Token
  **/

  public Erc721Token getErc721Token() {
    return erc721Token;
  }

  public void setErc721Token(Erc721Token erc721Token) {
    this.erc721Token = erc721Token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc721TransferDetails erc721TransferDetails = (Erc721TransferDetails) o;
    return Objects.equals(this.from, erc721TransferDetails.from) &&
        Objects.equals(this.to, erc721TransferDetails.to) &&
        Objects.equals(this.erc721Token, erc721TransferDetails.erc721Token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, erc721Token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc721TransferDetails {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    erc721Token: ").append(toIndentedString(erc721Token)).append("\n");
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
