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
 * Gets or Sets InternalTransactionOpCall
 */
public enum InternalTransactionOpCall {
  UNKNOWN("UNKNOWN"),
  CALL("CALL"),
  CREATE("CREATE"),
  CREATE2("CREATE2"),
  CALLCODE("CALLCODE"),
  DELEGATECALL("DELEGATECALL"),
  STATICCALL("STATICCALL");

  private String value;

  InternalTransactionOpCall(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InternalTransactionOpCall fromValue(String input) {
    for (InternalTransactionOpCall b : InternalTransactionOpCall.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
