package to.avax.avalanche.wallet;

import to.avax.avalanche.apis.avm.AvmKeyChain;
import to.avax.avalanche.apis.avm.AvmKeyPair;

public interface IAvaHdWallet {
    String getMnemonic();
    AvmKeyPair getCurrentKey();
    AvmKeyChain getKeyChain();
}
