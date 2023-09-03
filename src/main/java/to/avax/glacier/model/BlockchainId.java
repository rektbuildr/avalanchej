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
import java.io.IOException;


/**
 * Gets or Sets BlockchainId
 */

public enum BlockchainId {
  P_CHAIN("p-chain"),
  X_CHAIN("x-chain"),
  C_CHAIN("c-chain"),
  _11111111111111111111111111111111LPOYY("11111111111111111111111111111111LpoYY"),
  _2OYMBNV4ENHYQK2FJJV5NVQLDBTMNJZQ5S3QS3LO6FTNC6FBYM("2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM");

  private String value;

  BlockchainId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BlockchainId fromValue(String input) {
    for (BlockchainId b : BlockchainId.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
