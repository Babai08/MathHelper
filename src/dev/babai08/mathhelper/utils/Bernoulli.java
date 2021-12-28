package dev.babai08.mathhelper.utils;

import dev.babai08.mathhelper.realFunctions.Zeta;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bernoulli {

    public static double bernoulliNumber(int n) {
        double bernoulliN;

        if (n > 1 && n % 2 == 0) {
            bernoulliN = Math.pow(-1, (n * 0.5) - 1) * Zeta.zetaStandard(n) * 2 * Factorial.factorial(n) / Math.pow(2 * Math.PI, n);
        } else if (n == 1) {
            bernoulliN = -0.5;
        } else if (n == 0) {
            bernoulliN = 1;
        } else if (n > 1){
            bernoulliN = 0;
        } else {
            bernoulliN = Double.NaN;
        }
        return MathUtils.roundDouble(bernoulliN, 5);
    }

    public static double bernoulliNumber2(int n) {
        BigDecimal bernoulliN = new BigDecimal(0);
        for (long k = 0; k <= n; k++) {
            bernoulliN = bernoulliN.add(sum2(k,n));
        }
        return bernoulliN.doubleValue();
    }
    public static BigDecimal sum2(long k, int n) {
        BigDecimal result = BigDecimal.ZERO;

        for (long v = 0; v <= k; v++) {
            result = result.add(BigDecimal.valueOf(Math.pow(-1, v)).multiply(MathUtils.nCr(k,v)).multiply(BigDecimal.valueOf(v).pow(n)).divide(BigDecimal.valueOf(k + 1), 1000, RoundingMode.HALF_EVEN));
        }
        return result;
    }

    public static double bernoulliPolynomial(int n, double x) {
        double bernoulliP = 0;

        for (int i = 0; i <= n; i++) {
            bernoulliP += MathUtils.nCr((long) n, i).doubleValue() * bernoulliNumber2(n-i) * Math.pow(x, i);
        }
        return MathUtils.roundDouble(bernoulliP, 5);
    }
}
