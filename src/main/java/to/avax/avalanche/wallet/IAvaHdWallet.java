package to.avax.avalanche.wallet;

import to.avax.avalanche.apis.avm.keychain.KeyChain;
import to.avax.avalanche.apis.avm.keychain.KeyPair;

public interface IAvaHdWallet {
    String getMnemonic();
    KeyPair getCurrentKey();
    KeyChain getKeyChain();
}
