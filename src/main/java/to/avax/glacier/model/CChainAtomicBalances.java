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
import to.avax.glacier.model.CChainSharedAssetBalance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CChainAtomicBalances
 */

public class CChainAtomicBalances {
  @JsonProperty("atomicMemoryUnlocked")
  private List<CChainSharedAssetBalance> atomicMemoryUnlocked = new ArrayList<CChainSharedAssetBalance>();

  @JsonProperty("atomicMemoryLocked")
  private List<CChainSharedAssetBalance> atomicMemoryLocked = new ArrayList<CChainSharedAssetBalance>();

  public CChainAtomicBalances atomicMemoryUnlocked(List<CChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
    return this;
  }

  public CChainAtomicBalances addAtomicMemoryUnlockedItem(CChainSharedAssetBalance atomicMemoryUnlockedItem) {
    this.atomicMemoryUnlocked.add(atomicMemoryUnlockedItem);
    return this;
  }

   /**
   * Get atomicMemoryUnlocked
   * @return atomicMemoryUnlocked
  **/

  public List<CChainSharedAssetBalance> getAtomicMemoryUnlocked() {
    return atomicMemoryUnlocked;
  }

  public void setAtomicMemoryUnlocked(List<CChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
  }

  public CChainAtomicBalances atomicMemoryLocked(List<CChainSharedAssetBalance> atomicMemoryLocked) {
    this.atomicMemoryLocked = atomicMemoryLocked;
    return this;
  }

  public CChainAtomicBalances addAtomicMemoryLockedItem(CChainSharedAssetBalance atomicMemoryLockedItem) {
    this.atomicMemoryLocked.add(atomicMemoryLockedItem);
    return this;
  }

   /**
   * Get atomicMemoryLocked
   * @return atomicMemoryLocked
  **/

  public List<CChainSharedAssetBalance> getAtomicMemoryLocked() {
    return atomicMemoryLocked;
  }

  public void setAtomicMemoryLocked(List<CChainSharedAssetBalance> atomicMemoryLocked) {
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
    CChainAtomicBalances cchainAtomicBalances = (CChainAtomicBalances) o;
    return Objects.equals(this.atomicMemoryUnlocked, cchainAtomicBalances.atomicMemoryUnlocked) &&
        Objects.equals(this.atomicMemoryLocked, cchainAtomicBalances.atomicMemoryLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atomicMemoryUnlocked, atomicMemoryLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CChainAtomicBalances {\n");
    
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
