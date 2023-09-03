package to.avax.avalanche.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class NumberUtils {

    public static String bnToAvaxX(BigInteger val) {
        return bnToLocaleString(val, 9);
    }

    public static String bnToLocaleString(BigInteger val, int decimals) {
        var bigVal = bnToBig(val, decimals);
        return bigToLocaleString(bigVal, decimals);
    }

    public static BigDecimal bnToBig(BigInteger val, int denomination) {
        var mult = new BigDecimal(10).pow(denomination);
        return new BigDecimal(val.toString()).divide(mult);
    }
    public static String bigToLocaleString(BigDecimal bigVal, int decimals) {
        var b2 = bigVal.setScale(decimals, RoundingMode.HALF_UP);
        return b2.toPlainString();
    }
    public static String bigToLocaleString(BigDecimal bigVal) {
        return bigToLocaleString(bigVal, 9);
    }

}
