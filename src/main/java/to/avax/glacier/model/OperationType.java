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
 * Gets or Sets OperationType
 */

public enum OperationType {
  TRANSACTION_EXPORT("TRANSACTION_EXPORT");

  private String value;

  OperationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationType fromValue(String input) {
    for (OperationType b : OperationType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
