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
import java.io.IOException;


/**
 * Gets or Sets XChainId
 */

public enum XChainId {
  X_CHAIN("x-chain"),
  _2OYMBNV4ENHYQK2FJJV5NVQLDBTMNJZQ5S3QS3LO6FTNC6FBYM("2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM");

  private String value;

  XChainId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static XChainId fromValue(String input) {
    for (XChainId b : XChainId.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
