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
 * Gets or Sets TransactionStatus
 */

public enum TransactionStatus {
  FAILED("failed"),
  SUCCESS("success");

  private String value;

  TransactionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionStatus fromValue(String input) {
    for (TransactionStatus b : TransactionStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
