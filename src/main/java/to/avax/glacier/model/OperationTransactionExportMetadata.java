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

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.OperationStatusCode;
import java.io.IOException;

public class OperationTransactionExportMetadata implements OneOfOperationStatusResponseMetadata {
  @JsonProperty("code")
  private OperationStatusCode code = null;

  @JsonProperty("downloadUrl")
  private String downloadUrl = null;

  @JsonProperty("nextDate")
  private LocalDateTime nextDate = null;

  public OperationTransactionExportMetadata code(OperationStatusCode code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/

  public OperationStatusCode getCode() {
    return code;
  }

  public void setCode(OperationStatusCode code) {
    this.code = code;
  }

  public OperationTransactionExportMetadata downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * File download URL. Provided only for COMPLETED operations.
   * @return downloadUrl
  **/

  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public OperationTransactionExportMetadata nextDate(LocalDateTime nextDate) {
    this.nextDate = nextDate;
    return this;
  }

   /**
   * The next date to use as the startDate in follow up requests        if a request results in a transaction history exceeding the max size and        has been reported as COMPLETED_WITH_WARNING with the warning        WarnTruncatedExport.
   * @return nextDate
  **/

  public LocalDateTime getNextDate() {
    return nextDate;
  }

  public void setNextDate(LocalDateTime nextDate) {
    this.nextDate = nextDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationTransactionExportMetadata operationTransactionExportMetadata = (OperationTransactionExportMetadata) o;
    return Objects.equals(this.code, operationTransactionExportMetadata.code) &&
        Objects.equals(this.downloadUrl, operationTransactionExportMetadata.downloadUrl) &&
        Objects.equals(this.nextDate, operationTransactionExportMetadata.nextDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, downloadUrl, nextDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationTransactionExportMetadata {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    nextDate: ").append(toIndentedString(nextDate)).append("\n");
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
