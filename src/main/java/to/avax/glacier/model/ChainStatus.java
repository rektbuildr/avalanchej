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
 * Gets or Sets ChainStatus
 */

public enum ChainStatus {
  OK("OK"),
  UNAVAILABLE("UNAVAILABLE");

  private String value;

  ChainStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChainStatus fromValue(String input) {
    for (ChainStatus b : ChainStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
