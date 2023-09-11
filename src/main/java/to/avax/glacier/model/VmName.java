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
 * Gets or Sets VmName
 */

public enum VmName {
  EVM("EVM"),
  BITCOIN("BITCOIN"),
  ETHEREUM("ETHEREUM");

  private String value;

  VmName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmName fromValue(String input) {
    for (VmName b : VmName.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
