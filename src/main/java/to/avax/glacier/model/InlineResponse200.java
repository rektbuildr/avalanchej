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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * InlineResponse200
 */

public class InlineResponse200 {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("info")
  private Map<String, Map> info = null;

  @JsonProperty("error")
  private Map<String, Map> error = null;

  @JsonProperty("details")
  private Map<String, Map> details = null;

  public InlineResponse200 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse200 info(Map<String, Map> info) {
    this.info = info;
    return this;
  }

  public InlineResponse200 putInfoItem(String key, Map infoItem) {
    if (this.info == null) {
      this.info = new HashMap<String, Map>();
    }
    this.info.put(key, infoItem);
    return this;
  }

   /**
   * Get info
   * @return info
  **/

  public Map<String, Map> getInfo() {
    return info;
  }

  public void setInfo(Map<String, Map> info) {
    this.info = info;
  }

  public InlineResponse200 error(Map<String, Map> error) {
    this.error = error;
    return this;
  }

  public InlineResponse200 putErrorItem(String key, Map errorItem) {
    if (this.error == null) {
      this.error = new HashMap<String, Map>();
    }
    this.error.put(key, errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/

  public Map<String, Map> getError() {
    return error;
  }

  public void setError(Map<String, Map> error) {
    this.error = error;
  }

  public InlineResponse200 details(Map<String, Map> details) {
    this.details = details;
    return this;
  }

  public InlineResponse200 putDetailsItem(String key, Map detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, Map>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/

  public Map<String, Map> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Map> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.status, inlineResponse200.status) &&
        Objects.equals(this.info, inlineResponse200.info) &&
        Objects.equals(this.error, inlineResponse200.error) &&
        Objects.equals(this.details, inlineResponse200.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, info, error, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
