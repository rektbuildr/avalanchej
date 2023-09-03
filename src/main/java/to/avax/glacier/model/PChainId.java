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
 * Gets or Sets PChainId
 */

public enum PChainId {
  P_CHAIN("p-chain"),
  _11111111111111111111111111111111LPOYY("11111111111111111111111111111111LpoYY");

  private String value;

  PChainId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PChainId fromValue(String input) {
    for (PChainId b : PChainId.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
