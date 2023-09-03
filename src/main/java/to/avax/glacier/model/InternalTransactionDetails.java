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
import to.avax.glacier.model.InternalTransactionOpCall;
import to.avax.glacier.model.RichAddress;
import java.io.IOException;
/**
 * InternalTransactionDetails
 */

public class InternalTransactionDetails {
  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("internalTxType")
  private InternalTransactionOpCall internalTxType = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("isReverted")
  private Boolean isReverted = null;

  @JsonProperty("gasUsed")
  private String gasUsed = null;

  @JsonProperty("gasLimit")
  private String gasLimit = null;

  public InternalTransactionDetails from(RichAddress from) {
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

  public InternalTransactionDetails to(RichAddress to) {
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

  public InternalTransactionDetails internalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
    return this;
  }

   /**
   * Get internalTxType
   * @return internalTxType
  **/

  public InternalTransactionOpCall getInternalTxType() {
    return internalTxType;
  }

  public void setInternalTxType(InternalTransactionOpCall internalTxType) {
    this.internalTxType = internalTxType;
  }

  public InternalTransactionDetails value(String value) {
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

  public InternalTransactionDetails isReverted(Boolean isReverted) {
    this.isReverted = isReverted;
    return this;
  }

   /**
   * True if the internal transaction was reverted.
   * @return isReverted
  **/

  public Boolean isIsReverted() {
    return isReverted;
  }

  public void setIsReverted(Boolean isReverted) {
    this.isReverted = isReverted;
  }

  public InternalTransactionDetails gasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/

  public String getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  public InternalTransactionDetails gasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Get gasLimit
   * @return gasLimit
  **/

  public String getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalTransactionDetails internalTransactionDetails = (InternalTransactionDetails) o;
    return Objects.equals(this.from, internalTransactionDetails.from) &&
        Objects.equals(this.to, internalTransactionDetails.to) &&
        Objects.equals(this.internalTxType, internalTransactionDetails.internalTxType) &&
        Objects.equals(this.value, internalTransactionDetails.value) &&
        Objects.equals(this.isReverted, internalTransactionDetails.isReverted) &&
        Objects.equals(this.gasUsed, internalTransactionDetails.gasUsed) &&
        Objects.equals(this.gasLimit, internalTransactionDetails.gasLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, internalTxType, value, isReverted, gasUsed, gasLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransactionDetails {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    internalTxType: ").append(toIndentedString(internalTxType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isReverted: ").append(toIndentedString(isReverted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
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
