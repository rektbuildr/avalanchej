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
import to.avax.glacier.model.FullNativeTransactionDetails;
import to.avax.glacier.model.InternalTransactionDetails;
import to.avax.glacier.model.NetworkTokenDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GetTransactionResponse
 */

public class GetTransactionResponse {
  @JsonProperty("erc20Transfers")
  private List<Erc20TransferDetails> erc20Transfers = null;

  @JsonProperty("erc721Transfers")
  private List<Erc721TransferDetails> erc721Transfers = null;

  @JsonProperty("erc1155Transfers")
  private List<Erc1155TransferDetails> erc1155Transfers = null;

  @JsonProperty("internalTransactions")
  private List<InternalTransactionDetails> internalTransactions = null;

  @JsonProperty("networkTokenDetails")
  private NetworkTokenDetails networkTokenDetails = null;

  @JsonProperty("nativeTransaction")
  private FullNativeTransactionDetails nativeTransaction = null;

  public GetTransactionResponse erc20Transfers(List<Erc20TransferDetails> erc20Transfers) {
    this.erc20Transfers = erc20Transfers;
    return this;
  }

  public GetTransactionResponse addErc20TransfersItem(Erc20TransferDetails erc20TransfersItem) {
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

  public GetTransactionResponse erc721Transfers(List<Erc721TransferDetails> erc721Transfers) {
    this.erc721Transfers = erc721Transfers;
    return this;
  }

  public GetTransactionResponse addErc721TransfersItem(Erc721TransferDetails erc721TransfersItem) {
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

  public GetTransactionResponse erc1155Transfers(List<Erc1155TransferDetails> erc1155Transfers) {
    this.erc1155Transfers = erc1155Transfers;
    return this;
  }

  public GetTransactionResponse addErc1155TransfersItem(Erc1155TransferDetails erc1155TransfersItem) {
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

  public GetTransactionResponse internalTransactions(List<InternalTransactionDetails> internalTransactions) {
    this.internalTransactions = internalTransactions;
    return this;
  }

  public GetTransactionResponse addInternalTransactionsItem(InternalTransactionDetails internalTransactionsItem) {
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

  public GetTransactionResponse networkTokenDetails(NetworkTokenDetails networkTokenDetails) {
    this.networkTokenDetails = networkTokenDetails;
    return this;
  }

   /**
   * Get networkTokenDetails
   * @return networkTokenDetails
  **/

  public NetworkTokenDetails getNetworkTokenDetails() {
    return networkTokenDetails;
  }

  public void setNetworkTokenDetails(NetworkTokenDetails networkTokenDetails) {
    this.networkTokenDetails = networkTokenDetails;
  }

  public GetTransactionResponse nativeTransaction(FullNativeTransactionDetails nativeTransaction) {
    this.nativeTransaction = nativeTransaction;
    return this;
  }

   /**
   * Get nativeTransaction
   * @return nativeTransaction
  **/

  public FullNativeTransactionDetails getNativeTransaction() {
    return nativeTransaction;
  }

  public void setNativeTransaction(FullNativeTransactionDetails nativeTransaction) {
    this.nativeTransaction = nativeTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionResponse getTransactionResponse = (GetTransactionResponse) o;
    return Objects.equals(this.erc20Transfers, getTransactionResponse.erc20Transfers) &&
        Objects.equals(this.erc721Transfers, getTransactionResponse.erc721Transfers) &&
        Objects.equals(this.erc1155Transfers, getTransactionResponse.erc1155Transfers) &&
        Objects.equals(this.internalTransactions, getTransactionResponse.internalTransactions) &&
        Objects.equals(this.networkTokenDetails, getTransactionResponse.networkTokenDetails) &&
        Objects.equals(this.nativeTransaction, getTransactionResponse.nativeTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erc20Transfers, erc721Transfers, erc1155Transfers, internalTransactions, networkTokenDetails, nativeTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionResponse {\n");
    
    sb.append("    erc20Transfers: ").append(toIndentedString(erc20Transfers)).append("\n");
    sb.append("    erc721Transfers: ").append(toIndentedString(erc721Transfers)).append("\n");
    sb.append("    erc1155Transfers: ").append(toIndentedString(erc1155Transfers)).append("\n");
    sb.append("    internalTransactions: ").append(toIndentedString(internalTransactions)).append("\n");
    sb.append("    networkTokenDetails: ").append(toIndentedString(networkTokenDetails)).append("\n");
    sb.append("    nativeTransaction: ").append(toIndentedString(nativeTransaction)).append("\n");
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
