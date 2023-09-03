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
 * Gets or Sets OperationStatusCode
 */

public enum OperationStatusCode {
  ERRINVALIDREQUEST("ErrInvalidRequest"),
  ERRINTERNAL("ErrInternal"),
  WARNTRUNCATEDEXPORT("WarnTruncatedExport");

  private String value;

  OperationStatusCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationStatusCode fromValue(String input) {
    for (OperationStatusCode b : OperationStatusCode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
