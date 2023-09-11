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

package to.avax.bip32;

import lombok.Data;
import org.bitcoinj.crypto.ChildNumber;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.HDPath;
import org.bitcoinj.params.MainNetParams;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.bitcoinj.crypto.HDKeyDerivation;


@Data
public class HDKey {

    private DeterministicKey key;
    final static Map<String, Integer> BITCOIN_VERSIONS;
    final static byte[] MASTER_SECRET;
    final static long HARDENED_OFFSET = 2147483648L;
    final static int LEN = 78;

    static {
        MainNetParams mainNetParams = new MainNetParams();
        MASTER_SECRET = "Bitcoin seed".getBytes(StandardCharsets.UTF_8);
        BITCOIN_VERSIONS = new HashMap<>();
        BITCOIN_VERSIONS.put("private", mainNetParams.getBip32HeaderP2PKHpriv());
        BITCOIN_VERSIONS.put("public",  mainNetParams.getBip32HeaderP2PKHpub());
    }

    byte[] chainCode;
    BIP32Network network;
    boolean lowR;
    int index;
    int fingerprint;
    byte[] publicKey;
    byte[] privateKey;
    byte[] identifier;

    Map<String, Integer> versions;

    public HDKey(Map<String, Integer> versions) {
        this.versions = versions;
        this.index = 0;
        this.privateKey = null;
        this.publicKey = null;
        this.chainCode = null;
        this.fingerprint = 0;
    }

    public HDKey() {
       this(BITCOIN_VERSIONS);
    }
    public byte[] getPrivateKey() {
        return this.key.getPrivKeyBytes();
    }
    public byte[] getPublicKey() {
        return this.key.getPubKey();
    }
    public boolean isNeutered() {
        return false;
    }
    public BIP32Interface neutered() {
        return null;
    }
    public String toBase58() {
        return null;
    }
    public String toWIF() {
        return null;
    }
    public HDKey derive(int index) {
        HDKey h = new HDKey();
        h.key = HDKeyDerivation.deriveChildKey(this.key, new ChildNumber(index));
        return h;
    }
    public HDKey deriveHardened(BigInteger index) {
        return null;
    }

    public HDKey derive(String path) {
        if (path.equals("m") || path.equals("M") || path.equals("m'") || path.equals("M'")) {
            return this;
        }

        var entries = path.split("/");
        var hdkey = this;
        for (int i=0; i< entries.length; i++){
            var c = entries[i];
            if (i == 0) {
                if (!c.startsWith("m") && !c.startsWith("M")) {
                    throw new RuntimeException("Path must start with \"m\" or \"M\"");
                }
                continue;
            }

            var hardened = (c.length() > 1) && (c.endsWith("'"));
            String index = c.substring(0, c.length() - (hardened ? 1 : 0));
            var childIndex = Integer.parseInt(index, 10); // & (HARDENED_OFFSET - 1)
            if(childIndex >= HARDENED_OFFSET) {
                throw new RuntimeException("Invalid index");
            }

            if (hardened) childIndex += HARDENED_OFFSET;

            hdkey = hdkey.derive(childIndex);

        }

        return hdkey;

    }

    public byte[] sign(byte[] hash, boolean lowR) {
        return new byte[0];
    }

    public static int indexFromPath(String path) {
        var parts = path.split("/");
        return Integer.parseInt(parts[parts.length - 1]);
    }
    
    public boolean verify(byte[] hash, byte[] signature) {
        return false;
    }

    public static HDKey fromMasterSeed(byte[] seed) {
        HDKey h = new HDKey();
        DeterministicKey dk = HDKeyDerivation.createMasterPrivateKey(seed);
        h.setKey(dk);
        return h;
    }

    public static HDKey fromBase58(String base58, BIP32Network network) {
        return null;
    }

    public static HDKey fromPrivateKey(byte[] privateKey, byte[] chainCode, BIP32Network network) {
        return null;
    }

    public static HDKey fromPublicKey(byte[] publicKey, byte[] chainCode, BIP32Network network) {
        return null;
    }
}
