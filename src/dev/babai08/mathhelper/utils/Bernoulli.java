package dev.babai08.mathhelper.utils;

import dev.babai08.mathhelper.realFunctions.Zeta;

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

    public static double bernoulliPolynomial(int n, double x) {
        double bernoulliP = 0;
        double result;

        for (int i = 0; i <= n; i++) {
            bernoulliP += MathUtils.nCr(n, i) * bernoulliNumber(n-i) * Math.pow(x, i);
        }
        return MathUtils.roundDouble(bernoulliP, 5);
    }
}
