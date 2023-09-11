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
import to.avax.glacier.model.Erc1155TransferDetails;
import to.avax.glacier.model.Erc20TransferDetails;
import to.avax.glacier.model.Erc721TransferDetails;
import to.avax.glacier.model.InternalTransactionDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TransactionDetails
 */

public class TransactionDetails {
  @JsonProperty("nativeTransaction")
  private AllOfTransactionDetailsNativeTransaction nativeTransaction = null;

  @JsonProperty("erc20Transfers")
  private List<Erc20TransferDetails> erc20Transfers = null;

  @JsonProperty("erc721Transfers")
  private List<Erc721TransferDetails> erc721Transfers = null;

  @JsonProperty("erc1155Transfers")
  private List<Erc1155TransferDetails> erc1155Transfers = null;

  @JsonProperty("internalTransactions")
  private List<InternalTransactionDetails> internalTransactions = null;

  public TransactionDetails nativeTransaction(AllOfTransactionDetailsNativeTransaction nativeTransaction) {
    this.nativeTransaction = nativeTransaction;
    return this;
  }

   /**
   * The native (top-level) transaction details.
   * @return nativeTransaction
  **/

  public AllOfTransactionDetailsNativeTransaction getNativeTransaction() {
    return nativeTransaction;
  }

  public void setNativeTransaction(AllOfTransactionDetailsNativeTransaction nativeTransaction) {
    this.nativeTransaction = nativeTransaction;
  }

  public TransactionDetails erc20Transfers(List<Erc20TransferDetails> erc20Transfers) {
    this.erc20Transfers = erc20Transfers;
    return this;
  }

  public TransactionDetails addErc20TransfersItem(Erc20TransferDetails erc20TransfersItem) {
    if (this.erc20Transfers == null) {
      this.erc20Transfers = new ArrayList<Erc20TransferDetails>();
    }
    this.erc20Transfers.add(erc20TransfersItem);
    return this;
  }

   /**
   * The list of ERC-20 transfers.
   * @return erc20Transfers
  **/

  public List<Erc20TransferDetails> getErc20Transfers() {
    return erc20Transfers;
  }

  public void setErc20Transfers(List<Erc20TransferDetails> erc20Transfers) {
    this.erc20Transfers = erc20Transfers;
  }

  public TransactionDetails erc721Transfers(List<Erc721TransferDetails> erc721Transfers) {
    this.erc721Transfers = erc721Transfers;
    return this;
  }

  public TransactionDetails addErc721TransfersItem(Erc721TransferDetails erc721TransfersItem) {
    if (this.erc721Transfers == null) {
      this.erc721Transfers = new ArrayList<Erc721TransferDetails>();
    }
    this.erc721Transfers.add(erc721TransfersItem);
    return this;
  }

   /**
   * The list of ERC-721 transfers.
   * @return erc721Transfers
  **/

  public List<Erc721TransferDetails> getErc721Transfers() {
    return erc721Transfers;
  }

  public void setErc721Transfers(List<Erc721TransferDetails> erc721Transfers) {
    this.erc721Transfers = erc721Transfers;
  }

  public TransactionDetails erc1155Transfers(List<Erc1155TransferDetails> erc1155Transfers) {
    this.erc1155Transfers = erc1155Transfers;
    return this;
  }

  public TransactionDetails addErc1155TransfersItem(Erc1155TransferDetails erc1155TransfersItem) {
    if (this.erc1155Transfers == null) {
      this.erc1155Transfers = new ArrayList<Erc1155TransferDetails>();
    }
    this.erc1155Transfers.add(erc1155TransfersItem);
    return this;
  }

   /**
   * The list of ERC-1155 transfers.
   * @return erc1155Transfers
  **/

  public List<Erc1155TransferDetails> getErc1155Transfers() {
    return erc1155Transfers;
  }

  public void setErc1155Transfers(List<Erc1155TransferDetails> erc1155Transfers) {
    this.erc1155Transfers = erc1155Transfers;
  }

  public TransactionDetails internalTransactions(List<InternalTransactionDetails> internalTransactions) {
    this.internalTransactions = internalTransactions;
    return this;
  }

  public TransactionDetails addInternalTransactionsItem(InternalTransactionDetails internalTransactionsItem) {
    if (this.internalTransactions == null) {
      this.internalTransactions = new ArrayList<InternalTransactionDetails>();
    }
    this.internalTransactions.add(internalTransactionsItem);
    return this;
  }

   /**
   * The list of internal transactions. Note that this list only        includes CALL and        CALLCODE internal transactions that had a        non-zero value and        CREATE/CREATE2        calls. Use a client provider to recieve a full debug trace of the       transaction.
   * @return internalTransactions
  **/

  public List<InternalTransactionDetails> getInternalTransactions() {
    return internalTransactions;
  }

  public void setInternalTransactions(List<InternalTransactionDetails> internalTransactions) {
    this.internalTransactions = internalTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetails transactionDetails = (TransactionDetails) o;
    return Objects.equals(this.nativeTransaction, transactionDetails.nativeTransaction) &&
        Objects.equals(this.erc20Transfers, transactionDetails.erc20Transfers) &&
        Objects.equals(this.erc721Transfers, transactionDetails.erc721Transfers) &&
        Objects.equals(this.erc1155Transfers, transactionDetails.erc1155Transfers) &&
        Objects.equals(this.internalTransactions, transactionDetails.internalTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeTransaction, erc20Transfers, erc721Transfers, erc1155Transfers, internalTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetails {\n");
    
    sb.append("    nativeTransaction: ").append(toIndentedString(nativeTransaction)).append("\n");
    sb.append("    erc20Transfers: ").append(toIndentedString(erc20Transfers)).append("\n");
    sb.append("    erc721Transfers: ").append(toIndentedString(erc721Transfers)).append("\n");
    sb.append("    erc1155Transfers: ").append(toIndentedString(erc1155Transfers)).append("\n");
    sb.append("    internalTransactions: ").append(toIndentedString(internalTransactions)).append("\n");
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
