package to.avax.avalanche.explorer;

import java.util.List;
import to.avax.avalanche.wallet.store.modules.history.ITransactionData;

public class ExplorerAPI {

    public static List<ITransactionData> getAddressHistory(String[] addrs, int limit, String chainID, String endTime) {
        return null;
    }

    public static boolean isAddressUsedX(String addr) {
        return false;
    }

    public static String getAddressDetailX(String addr) {
        return null;
    }

    public static List<String> getAddressChains(String[] addrs) {
        return null;
    }

}
