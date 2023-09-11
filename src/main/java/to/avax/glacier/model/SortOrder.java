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
 * Gets or Sets SortOrder
 */

public enum SortOrder {
  ASC("asc"),
  DESC("desc");

  private String value;

  SortOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SortOrder fromValue(String input) {
    for (SortOrder b : SortOrder.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
