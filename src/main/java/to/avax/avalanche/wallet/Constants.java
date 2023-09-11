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

package to.avax.avalanche.wallet;

public class Constants {
    public final static String AVAX_TOKEN_INDEX = "9000";
    public final static String AVAX_TOKEN_PATH = String.format("m/44'/%s", AVAX_TOKEN_INDEX);
    public final static String AVAX_ACCOUNT_PATH = String.format("m/44'/%s'/0'", AVAX_TOKEN_INDEX); // Change and index left out
    public final static String ETH_ACCOUNT_PATH = "m/44'/60'/0";
    public final static String LEDGER_ETH_ACCOUNT_PATH = ETH_ACCOUNT_PATH + "/0/0";

    public final static int HD_SCAN_GAP_SIZE = 20; // a gap of at least 20 indexes is needed to claim an index unused
    public final static int SCAN_SIZE = 70; // the total number of utxos to look at initially to calculate last index
    public final static int HD_SCAN_LOOK_UP_WINDOW = 64; // Number of addresses to check with the explorer at a single call
    public final static int SCAN_RANGE = SCAN_SIZE - HD_SCAN_GAP_SIZE; // How many items are actually scanned

    public final static int LEDGER_EXCHANGE_TIMEOUT = 90_000;
    public final static String MIN_EVM_SUPPORT_V = "0.5.3";
    /**
     * Note: Original comment from Ava Labs TS code :
     * In order to free the thread when deriving addresses, the execution will sleep every N address derived
     */
    public final static int DERIVATION_SLEEP_INTERVAL = 200;
    
}
