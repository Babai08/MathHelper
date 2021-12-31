package dev.babai08.mathhelper.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bernoulli {

    // Based upon tgdavies' implementation of equation 33 found at https://mathworld.wolfram.com/BernoulliNumber.html
    public static double BernoulliNumber(int n) {
        BigDecimal bernoulliN = new BigDecimal(0);

        for (long k = 0; k <= n; k++) {
            bernoulliN = bernoulliN.add(InternalBernoulliSum(k, n));
        }

        return bernoulliN.doubleValue();
    }

    private static BigDecimal InternalBernoulliSum(long k, int n) {
        BigDecimal result = BigDecimal.ZERO;

        for (long v = 0; v <= k; v++) {
            result = result.add(BigDecimal.valueOf(Math.pow(-1, v)).multiply(MathUtils.nCr(k, v)).multiply(BigDecimal.valueOf(v).pow(n)).divide(BigDecimal.valueOf(k + 1), 1000, RoundingMode.HALF_EVEN));
        }

        return result;
    }

    // Uses the
    public static double bernoulliPolynomial(int n, double x) {
        double bernoulliP = 0;

        for (int r = 0; r <= n; r++) {
            bernoulliP += MathUtils.nCr(n,r)*BernoulliNumber(n-r)*Math.pow(x,r);
        }

        return bernoulliP;
    }
}
