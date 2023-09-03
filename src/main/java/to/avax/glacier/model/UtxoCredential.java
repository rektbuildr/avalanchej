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
/**
 * UtxoCredential
 */

public class UtxoCredential {
  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("publicKey")
  private String publicKey = null;

  public UtxoCredential signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Signature provided to consume the output
   * @return signature
  **/

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public UtxoCredential publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Public key associated with the signature
   * @return publicKey
  **/

  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtxoCredential utxoCredential = (UtxoCredential) o;
    return Objects.equals(this.signature, utxoCredential.signature) &&
        Objects.equals(this.publicKey, utxoCredential.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtxoCredential {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
