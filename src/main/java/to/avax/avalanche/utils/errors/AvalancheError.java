/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils.errors;

public class AvalancheError extends RuntimeException{

    public static final String  ADDRESS_ERROR_CODE = "1000";
    public static final String  GOOSE_EGG_CHECK_ERROR_CODE = "1001";
    public static final String  CHAIN_ID_ERROR_CODE = "1002";
    public static final String  NO_ATOMIX_UTXOS_ERROR_CODE = "1003";
    public static final String  SYMBOL_ERROR_CODE = "1004";
    public static final String  NAME_ERROR_CODE = "1005";
    public static final String  TRANSACTION_ERROR_CODE = "1006";
    public static final String  CODEC_ID_ERROR_CODE = "1007";
    public static final String  CRED_ID_ERROR_CODE = "1008";
    public static final String  TRANSFERABLE_OUTPUT_ERROR_CODE = "1009";
    public static final String  TRANSFERABLE_INPUT_ERROR_CODE = "1010";
    public static final String  INPUT_ID_ERROR_CODE = "1011";
    public static final String  OPERATION_ERROR_CODE = "1012";
    public static final String  INVALID_OPERATION_ID_CODE = "1013";
    public static final String  CHECKSUM_ERROR_CODE = "1014";
    public static final String  OUTPUT_ID_ERROR_CODE = "1015";
    public static final String  UTXO_ERROR_CODE = "1016";
    public static final String  INSUFFICIENT_FUNDS_ERROR_CODE = "1017";
    public static final String  THRESHOLD_ERROR_CODE = "1018";
    public static final String  SECP_MINT_OUTPUT_ERROR_CODE = "1019";
    public static final String  EVM_INPUT_ERROR_CODE = "1020";
    public static final String  EVM_OUTPUT_ERROR_CODE = "1021";
    public static final String  FEE_ASSET_ERROR_CODE = "1022";
    public static final String  STAKE_ERROR_CODE = "1023";
    public static final String  TIME_ERROR_CODE = "1024";
    public static final String  DELEGATION_FEE_ERROR_CODE = "1025";
    public static final String  SUBNET_OWNER_ERROR_CODE = "1026";
    public static final String  BUFFER_SIZE_ERROR_CODE = "1027";
    public static final String  ADDRESS_INDEX_ERROR_CODE = "1028";
    public static final String  PUBLIC_KEY_ERROR_CODE = "1029";
    public static final String  MERGE_RULE_ERROR_CODE = "1030";
    public static final String  BASE58_ERROR_CODE = "1031";
    public static final String  PRIVATE_KEY_ERROR_CODE = "1032";
    public static final String  NODE_ID_ERROR_CODE = "1033";
    public static final String  HEX_ERROR_CODE = "1034";
    public static final String  TYPE_ID_ERROR_CODE = "1035";
    public static final String  UNKNOWN_TYPE_ERROR_CODE = "1036";
    public static final String  BECH32_ERROR_CODE = "1037";
    public static final String  EVM_FEE_ERROR_CODE = "1038";
    public static final String  INVALID_ENTROPY = "1039";
    public static final String  PROTOCOL_ERROR_CODE = "1040";
    public static final String  SUBNET_ID_ERROR_CODE = "1041";
    public static final String  TYPE_NAME_ERROR_CODE = "1042";
    public static final String  SUBNET_THRESHOLD_ERROR_CODE = "1043";
    public static final String  SUBNET_ADDRESS_ERROR_CODE = "1044";
    public static final String  UNKNOWN_FORMAT_ERROR_CODE = "1045";

    private String errorCode;
    public AvalancheError(String m, String code) {
        super(m);
        this.errorCode = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
