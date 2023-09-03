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

package to.avax.avalanche.utils;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String PrivateKeyPrefix = "PrivateKey-";
    public static final String NodeIDPrefix = "NodeID-";
    public static final String PrimaryAssetAlias = "AVAX";
    public static final String MainnetAPI = "api.avax.network";
    public static final String FujiAPI = "api.avax-test.network";

    public static final Map<Integer, String> NetworkIDToHRP = Map.of(
        0, "custom",
        1, "avax",
        2, "cascade",
        3, "denali",
        4, "everest",
        5, "fuji",
        1337, "custom",
        12345, "local"
    );

    public static final Map<String, Integer> HRPToNetworkID = Map.of(
        "manhattan", 0,
        "avax", 1,
        "cascade", 2,
        "denali", 3,
        "everest", 4,
        "fuji", 5,
        "custom", 1337,
        "local", 12345
    );

    public static final Map<Integer, String[]> NetworkIDToNetworkNames = Map.of(
            0, new String[]{"Manhattan"},
            1, new String[]{"Avalanche", "Mainnet"},
            2, new String[]{"Cascade"},
            3, new String[]{"Denali"},
            4, new String[]{"Everest"},
            5, new String[]{"Fuji", "Testnet"},
            1337, new String[]{"Custom Network"},
            12345, new String[]{"Local Network"}
    );

    public static final Map<String, Integer>  NetworkNameToNetworkID = new HashMap<>();

    // of only takes 10 entries
    static {
        NetworkNameToNetworkID.put("Manhattan", 0);
        NetworkNameToNetworkID.put("Avalanche", 1);
        NetworkNameToNetworkID.put("Mainnet", 1);
        NetworkNameToNetworkID.put("Cascade", 2);
        NetworkNameToNetworkID.put("Denali", 3);
        NetworkNameToNetworkID.put("Everest", 4);
        NetworkNameToNetworkID.put("Fuji", 5);
        NetworkNameToNetworkID.put("Testnet", 5);
        NetworkNameToNetworkID.put("Custom", 1337);
        NetworkNameToNetworkID.put("Custom Network", 1337);
        NetworkNameToNetworkID.put("Local", 12345);
        NetworkNameToNetworkID.put("Local Network", 12345);
    }

    public static final String FallbackHRP = "custom";
    public static final String FallbackNetworkName = "Custom Network";
    public static final int FallbackEVMChainID = 43112;
    public static final int DefaultNetworkID = 1;
    public static final String PlatformChainID = "11111111111111111111111111111111LpoYY";
    public static final String PrimaryNetworkID = "11111111111111111111111111111111LpoYY";
    public static final String XChainAlias = "X";
    public static final String CChainAlias = "C";
    public static final String PChainAlias = "P";
    public static final String XChainVMName = "avm";
    public static final String CChainVMName = "evm";
    public static final String PChainVMName = "platformvm";
    public static final BigInteger ONEAVAX = new BigInteger("1000000000");
    public static final BigInteger DECIAVAX = ONEAVAX.divide(new BigInteger("10"));
    public static final BigInteger CENTIAVAX = ONEAVAX.divide(new BigInteger("100"));
    public static final BigInteger MILLIAVAX = ONEAVAX.divide(new BigInteger("1000"));
    public static final BigInteger MICROAVAX = ONEAVAX.divide(new BigInteger("1000000"));
    public static final BigInteger NANOAVAX = ONEAVAX.divide(new BigInteger("1000000000"));
    public static final BigInteger WEI = BigInteger.ONE;
    public static final BigInteger GWEI = WEI.multiply(new BigInteger("1000000000"));
    public static final BigInteger AVAXGWEI = NANOAVAX;
    public static final BigInteger AVAXSTAKECAP = ONEAVAX.multiply(new BigInteger("3000000"));
    public static final String avaxAssetID = "FvwEAhmxKfeiG8SnEvq42hc6whRyY3EFYAvebMqDNDGCgxN5Z";
    public static final String XblockchainID = "2oYMBNV4eNHyqk2fjjV5nVQLDbtmNJzq5s3qs3Lo6ftnC6FByM";
    public static final String CblockchainID = "2q9e4r6Mu3U68nU1fYjgbR6JvwrRx36CohpAX5UQxse55x1Q5";
    public static final String PblockchainID = PlatformChainID;


}
