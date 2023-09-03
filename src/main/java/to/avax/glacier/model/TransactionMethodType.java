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
 * Gets or Sets TransactionMethodType
 */

public enum TransactionMethodType {
  NATIVE_TRANSFER("NATIVE_TRANSFER"),
  CONTRACT_CALL("CONTRACT_CALL"),
  CONTRACT_CREATION("CONTRACT_CREATION");

  private String value;

  TransactionMethodType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionMethodType fromValue(String input) {
    for (TransactionMethodType b : TransactionMethodType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
