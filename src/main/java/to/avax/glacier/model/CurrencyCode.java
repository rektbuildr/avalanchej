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
 * Gets or Sets CurrencyCode
 */
public enum CurrencyCode {
  USD("usd"),
  EUR("eur"),
  AUD("aud"),
  CAD("cad"),
  CHF("chf"),
  CLP("clp"),
  CNY("cny"),
  CZK("czk"),
  DKK("dkk"),
  GBP("gbp"),
  HKD("hkd"),
  HUF("huf"),
  JPY("jpy"),
  NZD("nzd");

  private String value;

  CurrencyCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CurrencyCode fromValue(String input) {
    for (CurrencyCode b : CurrencyCode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

}
