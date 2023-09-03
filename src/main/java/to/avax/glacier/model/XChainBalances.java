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

import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.XChainAssetBalance;
import to.avax.glacier.model.XChainSharedAssetBalance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * XChainBalances
 */

public class XChainBalances {
  @JsonProperty("locked")
  private List<XChainAssetBalance> locked = new ArrayList<XChainAssetBalance>();

  @JsonProperty("unlocked")
  private List<XChainAssetBalance> unlocked = new ArrayList<XChainAssetBalance>();

  @JsonProperty("atomicMemoryUnlocked")
  private List<XChainSharedAssetBalance> atomicMemoryUnlocked = new ArrayList<XChainSharedAssetBalance>();

  @JsonProperty("atomicMemoryLocked")
  private List<XChainSharedAssetBalance> atomicMemoryLocked = new ArrayList<XChainSharedAssetBalance>();

  public XChainBalances locked(List<XChainAssetBalance> locked) {
    this.locked = locked;
    return this;
  }

  public XChainBalances addLockedItem(XChainAssetBalance lockedItem) {
    this.locked.add(lockedItem);
    return this;
  }

   /**
   * A list of objects containing X-chain Asset balance infromation.
   * @return locked
  **/

  public List<XChainAssetBalance> getLocked() {
    return locked;
  }

  public void setLocked(List<XChainAssetBalance> locked) {
    this.locked = locked;
  }

  public XChainBalances unlocked(List<XChainAssetBalance> unlocked) {
    this.unlocked = unlocked;
    return this;
  }

  public XChainBalances addUnlockedItem(XChainAssetBalance unlockedItem) {
    this.unlocked.add(unlockedItem);
    return this;
  }

   /**
   * A list of objects containing X-chain Asset balance infromation.
   * @return unlocked
  **/

  public List<XChainAssetBalance> getUnlocked() {
    return unlocked;
  }

  public void setUnlocked(List<XChainAssetBalance> unlocked) {
    this.unlocked = unlocked;
  }

  public XChainBalances atomicMemoryUnlocked(List<XChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
    return this;
  }

  public XChainBalances addAtomicMemoryUnlockedItem(XChainSharedAssetBalance atomicMemoryUnlockedItem) {
    this.atomicMemoryUnlocked.add(atomicMemoryUnlockedItem);
    return this;
  }

   /**
   * Get atomicMemoryUnlocked
   * @return atomicMemoryUnlocked
  **/

  public List<XChainSharedAssetBalance> getAtomicMemoryUnlocked() {
    return atomicMemoryUnlocked;
  }

  public void setAtomicMemoryUnlocked(List<XChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
  }

  public XChainBalances atomicMemoryLocked(List<XChainSharedAssetBalance> atomicMemoryLocked) {
    this.atomicMemoryLocked = atomicMemoryLocked;
    return this;
  }

  public XChainBalances addAtomicMemoryLockedItem(XChainSharedAssetBalance atomicMemoryLockedItem) {
    this.atomicMemoryLocked.add(atomicMemoryLockedItem);
    return this;
  }

   /**
   * Get atomicMemoryLocked
   * @return atomicMemoryLocked
  **/

  public List<XChainSharedAssetBalance> getAtomicMemoryLocked() {
    return atomicMemoryLocked;
  }

  public void setAtomicMemoryLocked(List<XChainSharedAssetBalance> atomicMemoryLocked) {
    this.atomicMemoryLocked = atomicMemoryLocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainBalances xchainBalances = (XChainBalances) o;
    return Objects.equals(this.locked, xchainBalances.locked) &&
        Objects.equals(this.unlocked, xchainBalances.unlocked) &&
        Objects.equals(this.atomicMemoryUnlocked, xchainBalances.atomicMemoryUnlocked) &&
        Objects.equals(this.atomicMemoryLocked, xchainBalances.atomicMemoryLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locked, unlocked, atomicMemoryUnlocked, atomicMemoryLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainBalances {\n");
    
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    unlocked: ").append(toIndentedString(unlocked)).append("\n");
    sb.append("    atomicMemoryUnlocked: ").append(toIndentedString(atomicMemoryUnlocked)).append("\n");
    sb.append("    atomicMemoryLocked: ").append(toIndentedString(atomicMemoryLocked)).append("\n");
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
