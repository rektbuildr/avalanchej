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

package to.avax.avalanche.common.keychain;
import to.avax.avalanche.utils.Bintools;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class StandardKeyChain<KPClass extends StandardKeyPair> {
    protected Map<String, KPClass> keys;

    /**
     * Makes a new [[StandardKeyPair]], returns the address.
     *
     * @returns Address of the new [[StandardKeyPair]]
     */
    protected abstract KPClass makeKey();

    /**
     * Given a private key, makes a new [[StandardKeyPair]], returns the address.
     *
     * @param privk A <a href='https://github.com/feross/buffer|Buffer'>byte[]</a> representing the private key
     *
     * @returns A new [[StandardKeyPair]]
     */
    protected abstract KPClass importKey(byte[] privk);

    /**
     * Gets an array of addresses stored in the [[StandardKeyChain]].
     *
     * @returns An array of <a href='https://github.com/feross/buffer|Buffer'>byte[]</a>  representations
     * of the addresses
     */
    List<Byte[]> getAddresses() {
        ArrayList<Byte[]> ret = new ArrayList<>();
        for (KPClass k : keys.values()) {
            Byte[] bArr = new Byte[k.getAddress().length];
            int i  = 0;
            for (byte bi : k.getAddress()) {
                bArr[i++] = bi;
            }
            ret.add(bArr);
        }
        return ret;
    }


    /**
     * Gets an array of addresses stored in the [[StandardKeyChain]].
     *
     * @returns An array of string representations of the addresses
     */
    List<String> getAddressStrings() {
        return this.keys.values().stream().map(x -> x.getAddressString()).toList();
    }

    /**
     * Adds the key pair to the list of the keys managed in the [[StandardKeyChain]].
     *
     * @param newKey A key pair of the appropriate class to be added to the [[StandardKeyChain]]
     */
    void addKey(KPClass newKey) {
        this.keys.put(Bintools.bytesToHex(newKey.getAddress()), newKey);
    }

    /**
     * Removes the key pair from the list of they keys managed in the [[StandardKeyChain]].
     *
     * @param key A <a href='https://github.com/feross/buffer|Buffer'>byte[]</a> for the address or
     * KPClass to remove
     *
     * @returns The boolean true if a key was removed.
     */
    boolean removeKey(KPClass key) {
        String kaddr = Bintools.bytesToHex(key.getAddress());
        if (this.keys.containsKey(kaddr)) {
            this.keys.remove(kaddr);
            return true;
        }
        return false;
    }

    /**
     * Checks if there is a key associated with the provided address.
     *
     * @param address The address to check for existence in the keys database
     *
     * @returns True on success, false if not found
     */
    boolean hasKey(byte[] address) {
        return this.keys.containsKey(Bintools.bytesToHex(address));
    }

    /**
     * Returns the [[StandardKeyPair]] listed under the provided address
     *
     * @param address The <a href='https://github.com/feross/buffer|Buffer}'>byte[]</a> of the address to
     * retrieve from the keys database
     *
     * @returns A reference to the [[StandardKeyPair]] in the keys database
     */
    KPClass getKey(byte[] address) {
        return this.keys.get(Bintools.bytesToHex(address));
    }

    protected abstract StandardKeyChain create(Object... args);

    abstract protected StandardKeyChain clone();

    protected abstract StandardKeyChain union(StandardKeyChain kc);

}
