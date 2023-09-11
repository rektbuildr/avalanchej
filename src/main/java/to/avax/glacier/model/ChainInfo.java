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
import to.avax.glacier.model.ChainStatus;
import to.avax.glacier.model.NetworkToken;
import to.avax.glacier.model.UtilityAddresses;
import to.avax.glacier.model.VmName;
import java.io.IOException;
/**
 * ChainInfo
 */

public class ChainInfo {
  @JsonProperty("chainId")
  private String chainId = null;

  @JsonProperty("status")
  private ChainStatus status = null;

  @JsonProperty("chainName")
  private String chainName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("platformChainId")
  private String platformChainId = null;

  @JsonProperty("subnetId")
  private String subnetId = null;

  @JsonProperty("vmId")
  private String vmId = null;

  @JsonProperty("vmName")
  private VmName vmName = null;

  @JsonProperty("explorerUrl")
  private String explorerUrl = null;

  @JsonProperty("rpcUrl")
  private String rpcUrl = null;

  @JsonProperty("wsUrl")
  private String wsUrl = null;

  @JsonProperty("isTestnet")
  private Boolean isTestnet = null;

  @JsonProperty("utilityAddresses")
  private UtilityAddresses utilityAddresses = null;

  @JsonProperty("networkToken")
  private NetworkToken networkToken = null;

  @JsonProperty("chainLogoUri")
  private String chainLogoUri = null;

  public ChainInfo chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/

  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public ChainInfo status(ChainStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/

  public ChainStatus getStatus() {
    return status;
  }

  public void setStatus(ChainStatus status) {
    this.status = status;
  }

  public ChainInfo chainName(String chainName) {
    this.chainName = chainName;
    return this;
  }

   /**
   * Get chainName
   * @return chainName
  **/

  public String getChainName() {
    return chainName;
  }

  public void setChainName(String chainName) {
    this.chainName = chainName;
  }

  public ChainInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChainInfo platformChainId(String platformChainId) {
    this.platformChainId = platformChainId;
    return this;
  }

   /**
   * Get platformChainId
   * @return platformChainId
  **/

  public String getPlatformChainId() {
    return platformChainId;
  }

  public void setPlatformChainId(String platformChainId) {
    this.platformChainId = platformChainId;
  }

  public ChainInfo subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/

  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public ChainInfo vmId(String vmId) {
    this.vmId = vmId;
    return this;
  }

   /**
   * Get vmId
   * @return vmId
  **/

  public String getVmId() {
    return vmId;
  }

  public void setVmId(String vmId) {
    this.vmId = vmId;
  }

  public ChainInfo vmName(VmName vmName) {
    this.vmName = vmName;
    return this;
  }

   /**
   * Get vmName
   * @return vmName
  **/

  public VmName getVmName() {
    return vmName;
  }

  public void setVmName(VmName vmName) {
    this.vmName = vmName;
  }

  public ChainInfo explorerUrl(String explorerUrl) {
    this.explorerUrl = explorerUrl;
    return this;
  }

   /**
   * Get explorerUrl
   * @return explorerUrl
  **/

  public String getExplorerUrl() {
    return explorerUrl;
  }

  public void setExplorerUrl(String explorerUrl) {
    this.explorerUrl = explorerUrl;
  }

  public ChainInfo rpcUrl(String rpcUrl) {
    this.rpcUrl = rpcUrl;
    return this;
  }

   /**
   * Get rpcUrl
   * @return rpcUrl
  **/

  public String getRpcUrl() {
    return rpcUrl;
  }

  public void setRpcUrl(String rpcUrl) {
    this.rpcUrl = rpcUrl;
  }

  public ChainInfo wsUrl(String wsUrl) {
    this.wsUrl = wsUrl;
    return this;
  }

   /**
   * Get wsUrl
   * @return wsUrl
  **/

  public String getWsUrl() {
    return wsUrl;
  }

  public void setWsUrl(String wsUrl) {
    this.wsUrl = wsUrl;
  }

  public ChainInfo isTestnet(Boolean isTestnet) {
    this.isTestnet = isTestnet;
    return this;
  }

   /**
   * Get isTestnet
   * @return isTestnet
  **/

  public Boolean isIsTestnet() {
    return isTestnet;
  }

  public void setIsTestnet(Boolean isTestnet) {
    this.isTestnet = isTestnet;
  }

  public ChainInfo utilityAddresses(UtilityAddresses utilityAddresses) {
    this.utilityAddresses = utilityAddresses;
    return this;
  }

   /**
   * Get utilityAddresses
   * @return utilityAddresses
  **/

  public UtilityAddresses getUtilityAddresses() {
    return utilityAddresses;
  }

  public void setUtilityAddresses(UtilityAddresses utilityAddresses) {
    this.utilityAddresses = utilityAddresses;
  }

  public ChainInfo networkToken(NetworkToken networkToken) {
    this.networkToken = networkToken;
    return this;
  }

   /**
   * Get networkToken
   * @return networkToken
  **/

  public NetworkToken getNetworkToken() {
    return networkToken;
  }

  public void setNetworkToken(NetworkToken networkToken) {
    this.networkToken = networkToken;
  }

  public ChainInfo chainLogoUri(String chainLogoUri) {
    this.chainLogoUri = chainLogoUri;
    return this;
  }

   /**
   * Get chainLogoUri
   * @return chainLogoUri
  **/

  public String getChainLogoUri() {
    return chainLogoUri;
  }

  public void setChainLogoUri(String chainLogoUri) {
    this.chainLogoUri = chainLogoUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainInfo chainInfo = (ChainInfo) o;
    return Objects.equals(this.chainId, chainInfo.chainId) &&
        Objects.equals(this.status, chainInfo.status) &&
        Objects.equals(this.chainName, chainInfo.chainName) &&
        Objects.equals(this.description, chainInfo.description) &&
        Objects.equals(this.platformChainId, chainInfo.platformChainId) &&
        Objects.equals(this.subnetId, chainInfo.subnetId) &&
        Objects.equals(this.vmId, chainInfo.vmId) &&
        Objects.equals(this.vmName, chainInfo.vmName) &&
        Objects.equals(this.explorerUrl, chainInfo.explorerUrl) &&
        Objects.equals(this.rpcUrl, chainInfo.rpcUrl) &&
        Objects.equals(this.wsUrl, chainInfo.wsUrl) &&
        Objects.equals(this.isTestnet, chainInfo.isTestnet) &&
        Objects.equals(this.utilityAddresses, chainInfo.utilityAddresses) &&
        Objects.equals(this.networkToken, chainInfo.networkToken) &&
        Objects.equals(this.chainLogoUri, chainInfo.chainLogoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, status, chainName, description, platformChainId, subnetId, vmId, vmName, explorerUrl, rpcUrl, wsUrl, isTestnet, utilityAddresses, networkToken, chainLogoUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainInfo {\n");
    
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chainName: ").append(toIndentedString(chainName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    platformChainId: ").append(toIndentedString(platformChainId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    explorerUrl: ").append(toIndentedString(explorerUrl)).append("\n");
    sb.append("    rpcUrl: ").append(toIndentedString(rpcUrl)).append("\n");
    sb.append("    wsUrl: ").append(toIndentedString(wsUrl)).append("\n");
    sb.append("    isTestnet: ").append(toIndentedString(isTestnet)).append("\n");
    sb.append("    utilityAddresses: ").append(toIndentedString(utilityAddresses)).append("\n");
    sb.append("    networkToken: ").append(toIndentedString(networkToken)).append("\n");
    sb.append("    chainLogoUri: ").append(toIndentedString(chainLogoUri)).append("\n");
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
