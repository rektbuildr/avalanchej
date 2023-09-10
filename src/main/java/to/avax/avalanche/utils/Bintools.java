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

import org.bitcoinj.core.Bech32;
import to.avax.avalanche.wallet.Types;

public class Bintools {
    public static String addressToString(String hrp, Types.ChainAlias chainId, byte[] addrBuf) {
        byte[] b8t5 = AvaxtoBech32.encode8to5(addrBuf);
        String addr = Bech32.encode(Bech32.Encoding.BECH32, hrp, b8t5);
        return String.format("%s-%s", chainId, addr);
    }
    public static String bytesToHex(byte[] input) {
        StringBuilder sb = new StringBuilder(input.length * 2);
        for(byte b: input) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
