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
 * Gets or Sets OperationStatus
 */

public enum OperationStatus {
  RUNNING("RUNNING"),
  COMPLETED("COMPLETED"),
  COMPLETED_WITH_WARNING("COMPLETED_WITH_WARNING"),
  FAILED("FAILED");

  private String value;

  OperationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationStatus fromValue(String input) {
    for (OperationStatus b : OperationStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
