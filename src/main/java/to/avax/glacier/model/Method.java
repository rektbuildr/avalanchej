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
import to.avax.glacier.model.TransactionMethodType;
import java.io.IOException;
/**
 * Method
 */

public class Method {
  @JsonProperty("callType")
  private TransactionMethodType callType = null;

  @JsonProperty("methodHash")
  private String methodHash = null;

  @JsonProperty("methodName")
  private String methodName = null;

  public Method callType(TransactionMethodType callType) {
    this.callType = callType;
    return this;
  }

   /**
   * Get callType
   * @return callType
  **/

  public TransactionMethodType getCallType() {
    return callType;
  }

  public void setCallType(TransactionMethodType callType) {
    this.callType = callType;
  }

  public Method methodHash(String methodHash) {
    this.methodHash = methodHash;
    return this;
  }

   /**
   * The contract method hash identifier. The method hash is only set if the &#x60;callType&#x60; is &#x60;CONTRACT_CALL&#x60;.
   * @return methodHash
  **/

  public String getMethodHash() {
    return methodHash;
  }

  public void setMethodHash(String methodHash) {
    this.methodHash = methodHash;
  }

  public Method methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * The contract method name including parameter types. If the &#x60;callType&#x60; is &#x60;NATIVE_TRANSFER&#x60; this is set to &#x27;Native Transfer&#x27;. If the &#x60;callType&#x60; is &#x60;CONTRACT_CREATION&#x60; this is set to &#x27;Contract Created&#x27;.
   * @return methodName
  **/

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Method method = (Method) o;
    return Objects.equals(this.callType, method.callType) &&
        Objects.equals(this.methodHash, method.methodHash) &&
        Objects.equals(this.methodName, method.methodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callType, methodHash, methodName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Method {\n");
    
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    methodHash: ").append(toIndentedString(methodHash)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
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
