/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 AVAXBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.apis.platformvm;

import com.fasterxml.jackson.databind.JsonNode;
import to.avax.avalanche.AvalancheCore;
import to.avax.avalanche.common.JRPCAPI;
import to.avax.avalanche.common.RequestResponseData;
import to.avax.avalanche.crypto.KeyChain;
import to.avax.avalanche.utils.CB58;
import to.avax.avalanche.utils.Constants;

import java.math.BigInteger;
import java.util.Map;

public class PlatformVMAPI extends JRPCAPI {
    protected KeyChain keychain;

    protected String blockchainID;

    protected String blockchainAlias;

    protected byte[] AVAXAssetID;

    protected BigInteger txFee;

    protected BigInteger creationTxFee;

    protected BigInteger minValidatorStake;

    protected BigInteger minDelegatorStake;

    public PlatformVMAPI(AvalancheCore core, String baseURL) {
        super(core, baseURL);
        this.blockchainID = Constants.PblockchainID;
    }

    public RequestResponseData getCurrentValidators(String subnetID, String[] nodeIDs) {

        Map<String, Object> params = Map.of(
               // "subnetID", subnetID
        );

        if ( (nodeIDs != null) && (nodeIDs.length > 0) ) {
            params.put("nodeIDs", nodeIDs);
        }

        return callMethod("platform.getCurrentValidators", params);
    }

    public RequestResponseData getCurrentValidators(byte[] subnetID, String[] nodeIDs) {
        String sidCB58 = CB58.encode(subnetID);
        return getCurrentValidators(sidCB58, nodeIDs);
    }
}
