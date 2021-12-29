package dev.babai08.mathhelper.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bernoulli {

    public static double BernoulliNumber(int n) {
        BigDecimal bernoulliN = new BigDecimal(0);

        for (long k = 0; k <= n; k++) {
            bernoulliN = bernoulliN.add(InternalBernoulliSum(k, n));
        }

        return bernoulliN.doubleValue();
    }

    public static BigDecimal bdBernoulliNumber(int n) {
        BigDecimal bernoulliN = new BigDecimal(0);
        for (long k = 0; k <= n; k++) {
            bernoulliN = bernoulliN.add(InternalBernoulliSum(k, n));
        }

        return bernoulliN;
    }

    private static BigDecimal InternalBernoulliSum(long k, int n) {
        BigDecimal result = BigDecimal.ZERO;

        for (long v = 0; v <= k; v++) {
            result = result.add(BigDecimal.valueOf(Math.pow(-1, v)).multiply(MathUtils.nCr(k, v)).multiply(BigDecimal.valueOf(v).pow(n)).divide(BigDecimal.valueOf(k + 1), 1000, RoundingMode.HALF_EVEN));
        }

        return result;
    }

    public static double bernoulliPolynomial(int n, BigDecimal x) {
        BigDecimal bernoulliP = BigDecimal.ZERO;

        for (int i = 0; i <= n; i++) {
            bernoulliP = bernoulliP.add(MathUtils.nCr((long) n, i).multiply(bdBernoulliNumber(n - i)).multiply(BigDecimal.valueOf(Math.pow(x.longValue(), i))));
        }

        return bernoulliP.doubleValue();
    }
}
