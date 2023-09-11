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

import org.apache.commons.codec.binary.Hex;
import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.crypto.MnemonicException;
import to.avax.avalanche.utils.CB58;
import to.avax.bip32.HDKey;
import java.math.BigInteger;
import java.util.List;
import to.avax.avalanche.wallet.evm.EvmWallet;
import to.avax.ethereum.EthUtils;
import to.avax.ethereum.EvmKeyChain;

public class MnemonicWallet extends HdWalletCore implements UnsafeWallet {

    private static final String DEFAULT_PASSPHRASE = "";
    private EvmWallet evmWallet;
    private Types.WalletNameType type;
    private MnemonicPhrase mnemonic;
    private long accountIndex;
    private HDKey ethAccountKey;
    private String ethKey;
    private String ethKeyBech;
    private String seed;
    private String ethAddress;
    private BigInteger ethBalance;
    private EvmKeyChain ethKeyChain;
    private boolean isLoading;

    public MnemonicWallet(String mnemonic) {
        byte[] seed = MnemonicCode.toSeed(List.of(mnemonic.split(" ")), DEFAULT_PASSPHRASE);

        HDKey masterHdKey = HDKey.fromMasterSeed(seed);
        HDKey accountHdKey = masterHdKey.derive(Constants.AVAX_ACCOUNT_PATH);
        HDKey ethAccountKey = masterHdKey.derive(Constants.ETH_ACCOUNT_PATH + "/0/0");

        init(accountHdKey, ethAccountKey, false);

        var ethPrivateKey = ethAccountKey.getPrivateKey();
        this.ethKey = Hex.encodeHexString(ethPrivateKey);
        this.ethAddress = Hex.encodeHexString(EthUtils.privateToAddress(ethPrivateKey));
        this.ethBalance = BigInteger.ZERO;
        String cPrivKey = "PrivateKey-" + CB58.encode(ethPrivateKey); // TODO BufferAvalanche.from(
        this.ethKeyBech = cPrivKey;

        var cKeyChain = new EvmKeyChain(); // TODO "avax", 'C'); // ava.getHRP()
        this.ethKeyChain = cKeyChain;

        this.type = Types.WalletNameType.mnemonic;
        this.seed = Hex.encodeHexString(seed);
        this.mnemonic = new MnemonicPhrase(mnemonic);
        this.setHdKey(masterHdKey);
        this.isLoading = false;
    }

    @Override
    public String getEvmPrivateKeyHex() {
        return this.evmWallet.getPrivateKeyHex();
    }

    public String getMnemonic() {
        try {
            return this.mnemonic.getValue();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static MnemonicWallet create() {
        return new MnemonicWallet(WalletFunctions.generateMnemonicString());
    }

    public static String generateMnemonicPhrase() {
        return WalletFunctions.generateMnemonicString();
    }

    public static MnemonicWallet fromMnemonic(String mnemonic) {
        return new MnemonicWallet(mnemonic);
    }

    public static boolean validateMnemonic(String mnemonic) {
        return validateMnemonic(List.of(mnemonic.trim().split(" ")));
    }

    public static boolean validateMnemonic(List<String> words) {
        try {
            MnemonicCode.INSTANCE.check(words);
        } catch (MnemonicException e) {
            return false;
        }

        return true;
    }
}
