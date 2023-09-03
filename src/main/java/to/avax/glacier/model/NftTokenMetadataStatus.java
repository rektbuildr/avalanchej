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
 * Gets or Sets NftTokenMetadataStatus
 */

public enum NftTokenMetadataStatus {
  UNKNOWN("UNKNOWN"),
  MISSING_TOKEN("MISSING_TOKEN"),
  INVALID_TOKEN_URI("INVALID_TOKEN_URI"),
  INVALID_TOKEN_URI_SCHEME("INVALID_TOKEN_URI_SCHEME"),
  UNREACHABLE_TOKEN_URI("UNREACHABLE_TOKEN_URI"),
  THROTTLED_TOKEN_URI("THROTTLED_TOKEN_URI"),
  METADATA_CONTENT_TOO_LARGE("METADATA_CONTENT_TOO_LARGE"),
  INVALID_METADATA("INVALID_METADATA"),
  INVALID_METADATA_JSON("INVALID_METADATA_JSON"),
  INDEXED("INDEXED"),
  UNINDEXED("UNINDEXED");

  private String value;

  NftTokenMetadataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NftTokenMetadataStatus fromValue(String input) {
    for (NftTokenMetadataStatus b : NftTokenMetadataStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }


}
