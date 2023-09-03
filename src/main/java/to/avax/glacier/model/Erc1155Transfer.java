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
import java.math.BigDecimal;
/**
 * Erc1155Transfer
 */

public class Erc1155Transfer {
  @JsonProperty("blockNumber")
  private String blockNumber = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("txHash")
  private String txHash = null;

  @JsonProperty("from")
  private RichAddress from = null;

  @JsonProperty("to")
  private RichAddress to = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("erc1155Token")
  private Erc1155Token erc1155Token = null;

  public Erc1155Transfer blockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * The block number on the chain.
   * @return blockNumber
  **/

  public String getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Erc1155Transfer blockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
    return this;
  }

   /**
   * The block finality timestamp.
   * @return blockTimestamp
  **/

  public BigDecimal getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public Erc1155Transfer blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * The block hash identifier.
   * @return blockHash
  **/

  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public Erc1155Transfer txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The transaction hash identifier.
   * @return txHash
  **/

  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public Erc1155Transfer from(RichAddress from) {
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

  public Erc1155Transfer to(RichAddress to) {
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

  public Erc1155Transfer value(String value) {
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

  public Erc1155Transfer erc1155Token(Erc1155Token erc1155Token) {
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
    Erc1155Transfer erc1155Transfer = (Erc1155Transfer) o;
    return Objects.equals(this.blockNumber, erc1155Transfer.blockNumber) &&
        Objects.equals(this.blockTimestamp, erc1155Transfer.blockTimestamp) &&
        Objects.equals(this.blockHash, erc1155Transfer.blockHash) &&
        Objects.equals(this.txHash, erc1155Transfer.txHash) &&
        Objects.equals(this.from, erc1155Transfer.from) &&
        Objects.equals(this.to, erc1155Transfer.to) &&
        Objects.equals(this.value, erc1155Transfer.value) &&
        Objects.equals(this.erc1155Token, erc1155Transfer.erc1155Token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockNumber, blockTimestamp, blockHash, txHash, from, to, value, erc1155Token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155Transfer {\n");
    
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
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
