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
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PChainBalance
 */

public class PChainBalance {
  @JsonProperty("unlockedUnstaked")
  private List<PChainAsset> unlockedUnstaked = null;

  @JsonProperty("unlockedStaked")
  private List<PChainAsset> unlockedStaked = null;

  @JsonProperty("lockedPlatform")
  private List<PChainAsset> lockedPlatform = null;

  @JsonProperty("lockedStakeable")
  private List<PChainAsset> lockedStakeable = null;

  @JsonProperty("lockedStaked")
  private List<PChainAsset> lockedStaked = null;

  @JsonProperty("lockedUnstaked")
  private List<PChainAsset> lockedUnstaked = null;

  public PChainBalance unlockedUnstaked(List<PChainAsset> unlockedUnstaked) {
    this.unlockedUnstaked = unlockedUnstaked;
    return this;
  }

  public PChainBalance addUnlockedUnstakedItem(PChainAsset unlockedUnstakedItem) {
    if (this.unlockedUnstaked == null) {
      this.unlockedUnstaked = new ArrayList<PChainAsset>();
    }
    this.unlockedUnstaked.add(unlockedUnstakedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is consumable by any transaction.
   * @return unlockedUnstaked
  **/

  public List<PChainAsset> getUnlockedUnstaked() {
    return unlockedUnstaked;
  }

  public void setUnlockedUnstaked(List<PChainAsset> unlockedUnstaked) {
    this.unlockedUnstaked = unlockedUnstaked;
  }

  public PChainBalance unlockedStaked(List<PChainAsset> unlockedStaked) {
    this.unlockedStaked = unlockedStaked;
    return this;
  }

  public PChainBalance addUnlockedStakedItem(PChainAsset unlockedStakedItem) {
    if (this.unlockedStaked == null) {
      this.unlockedStaked = new ArrayList<PChainAsset>();
    }
    this.unlockedStaked.add(unlockedStakedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of staked Avax that is consumable by any transaction when the staking period ends.
   * @return unlockedStaked
  **/
  
  public List<PChainAsset> getUnlockedStaked() {
    return unlockedStaked;
  }

  public void setUnlockedStaked(List<PChainAsset> unlockedStaked) {
    this.unlockedStaked = unlockedStaked;
  }

  public PChainBalance lockedPlatform(List<PChainAsset> lockedPlatform) {
    this.lockedPlatform = lockedPlatform;
    return this;
  }

  public PChainBalance addLockedPlatformItem(PChainAsset lockedPlatformItem) {
    if (this.lockedPlatform == null) {
      this.lockedPlatform = new ArrayList<PChainAsset>();
    }
    this.lockedPlatform.add(lockedPlatformItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked at the platform level and not consumable by any transaction at the current time.
   * @return lockedPlatform
  **/
  
  public List<PChainAsset> getLockedPlatform() {
    return lockedPlatform;
  }

  public void setLockedPlatform(List<PChainAsset> lockedPlatform) {
    this.lockedPlatform = lockedPlatform;
  }

  public PChainBalance lockedStakeable(List<PChainAsset> lockedStakeable) {
    this.lockedStakeable = lockedStakeable;
    return this;
  }

  public PChainBalance addLockedStakeableItem(PChainAsset lockedStakeableItem) {
    if (this.lockedStakeable == null) {
      this.lockedStakeable = new ArrayList<PChainAsset>();
    }
    this.lockedStakeable.add(lockedStakeableItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked at the platform level and only consumeable for staking transactions.
   * @return lockedStakeable
  **/
  
  public List<PChainAsset> getLockedStakeable() {
    return lockedStakeable;
  }

  public void setLockedStakeable(List<PChainAsset> lockedStakeable) {
    this.lockedStakeable = lockedStakeable;
  }

  public PChainBalance lockedStaked(List<PChainAsset> lockedStaked) {
    this.lockedStaked = lockedStaked;
    return this;
  }

  public PChainBalance addLockedStakedItem(PChainAsset lockedStakedItem) {
    if (this.lockedStaked == null) {
      this.lockedStaked = new ArrayList<PChainAsset>();
    }
    this.lockedStaked.add(lockedStakedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of staked Avax that will be locked when the staking period ends.
   * @return lockedStaked
  **/
  
  public List<PChainAsset> getLockedStaked() {
    return lockedStaked;
  }

  public void setLockedStaked(List<PChainAsset> lockedStaked) {
    this.lockedStaked = lockedStaked;
  }

  public PChainBalance lockedUnstaked(List<PChainAsset> lockedUnstaked) {
    this.lockedUnstaked = lockedUnstaked;
    return this;
  }

  public PChainBalance addLockedUnstakedItem(PChainAsset lockedUnstakedItem) {
    if (this.lockedUnstaked == null) {
      this.lockedUnstaked = new ArrayList<PChainAsset>();
    }
    this.lockedUnstaked.add(lockedUnstakedItem);
    return this;
  }

   /**
   * A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked. Sum of lockedPlatform and lockedStakeable. TO BE DEPRECATED.
   * @return lockedUnstaked
  **/
  
  public List<PChainAsset> getLockedUnstaked() {
    return lockedUnstaked;
  }

  public void setLockedUnstaked(List<PChainAsset> lockedUnstaked) {
    this.lockedUnstaked = lockedUnstaked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainBalance pchainBalance = (PChainBalance) o;
    return Objects.equals(this.unlockedUnstaked, pchainBalance.unlockedUnstaked) &&
        Objects.equals(this.unlockedStaked, pchainBalance.unlockedStaked) &&
        Objects.equals(this.lockedPlatform, pchainBalance.lockedPlatform) &&
        Objects.equals(this.lockedStakeable, pchainBalance.lockedStakeable) &&
        Objects.equals(this.lockedStaked, pchainBalance.lockedStaked) &&
        Objects.equals(this.lockedUnstaked, pchainBalance.lockedUnstaked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlockedUnstaked, unlockedStaked, lockedPlatform, lockedStakeable, lockedStaked, lockedUnstaked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainBalance {\n");
    
    sb.append("    unlockedUnstaked: ").append(toIndentedString(unlockedUnstaked)).append("\n");
    sb.append("    unlockedStaked: ").append(toIndentedString(unlockedStaked)).append("\n");
    sb.append("    lockedPlatform: ").append(toIndentedString(lockedPlatform)).append("\n");
    sb.append("    lockedStakeable: ").append(toIndentedString(lockedStakeable)).append("\n");
    sb.append("    lockedStaked: ").append(toIndentedString(lockedStaked)).append("\n");
    sb.append("    lockedUnstaked: ").append(toIndentedString(lockedUnstaked)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
