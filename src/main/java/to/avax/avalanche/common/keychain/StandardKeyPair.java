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


abstract public class StandardKeyPair {
    
    protected byte[] pubk;
    protected byte[] privk;

    /**
     * Generates a new keypair.
     *
     * @param entropy Optional parameter that may be necessary to produce secure keys
     */
    abstract public void generateKey(byte[] entropy);

    /**
     * Imports a private key and generates the appropriate public key.
     *
     * @param privk A {@link https://github.com/feross/buffer|Buffer} representing the private key
     *
     * @returns true on success, false on failure
     */
    abstract boolean importKey(byte[] privk);

    /**
     * Takes a message, signs it, and returns the signature.
     *
     * @param msg The message to sign
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer} containing the signature
     */
    abstract byte[] sign(byte[] msg);

    /**
     * Recovers the public key of a message signer from a message and its associated signature.
     *
     * @param msg The message that's signed
     * @param sig The signature that's signed on the message
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer} containing the public
     * key of the signer
     */
    abstract byte[] recover(byte[] msg, byte[] sig);

    /**
     * Verifies that the private key associated with the provided public key produces the
     * signature associated with the given message.
     *
     * @param msg The message associated with the signature
     * @param sig The signature of the signed message
     * @param pubk The public key associated with the message signature
     *
     * @returns True on success, false on failure
     */
    abstract boolean verify(byte[] msg, byte[] sig, byte[] pubk);

    /**
     * Returns a reference to the private key.
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer} containing the private key
     */
    byte[] getPrivateKey() {
        return this.privk;
    }

    /**
     * Returns a reference to the public key.
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer} containing the public key
     */
    byte[] getPublicKey() {
        return this.pubk;
    }

    /**
     * Returns a string representation of the private key.
     *
     * @returns A string representation of the public key
     */
    abstract String getPrivateKeyString();

    /**
     * Returns the public key.
     *
     * @returns A string representation of the public key
     */
    abstract String getPublicKeyString();

    /**
     * Returns the address.
     *
     * @returns A {@link https://github.com/feross/buffer|Buffer}  representation of the address
     */
    abstract byte[] getAddress();

    /**
     * Returns the address's string representation.
     *
     * @returns A string representation of the address
     */
    abstract String getAddressString();

    abstract StandardKeyPair create(Object... args);

    abstract protected StandardKeyPair clone();
}
