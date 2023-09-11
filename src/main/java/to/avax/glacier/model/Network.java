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
 * Gets or Sets Network
 */

public enum Network {
  MAINNET("mainnet"),
  FUJI("fuji");

  private String value;

  Network(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Network fromValue(String input) {
    for (Network b : Network.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
