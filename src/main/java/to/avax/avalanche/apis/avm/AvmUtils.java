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

package to.avax.avalanche.apis.avm;

public class AvmUtils {
    /**
     * Takes a buffer representing the output and returns the proper [[BaseTx]] instance.
     *
     * @param txtype The id of the transaction type
     *
     * @returns An instance of an [[BaseTx]]-extended class.
     */
     public BaseTx SelectTxClass(int txtype, Object...args) {
        if (txtype == AVMConstants.BASETX) {
            return new BaseTx(args);
        } else if (txtype == AVMConstants.CREATEASSETTX) {
            return new CreateAssetTx(args);
        } else if (txtype == AVMConstants.OPERATIONTX) {
            return new OperationTx(args);
        } else if (txtype == AVMConstants.IMPORTTX) {
            return new ImportTx(args);
        } else if (txtype == AVMConstants.EXPORTTX) {
            return new ExportTx(args);
        }
        throw new RuntimeException("Error - SelectTxClass: unknown txtype");
    }
}
