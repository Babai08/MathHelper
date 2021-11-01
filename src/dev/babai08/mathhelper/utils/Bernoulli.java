package dev.babai08.mathhelper.utils;

public class Bernoulli {

    public static double bernoulliNumber(int n) {
        double bernoulliN;
        double result;

        if (n > 1 && n % 2 == 0) {
            bernoulliN = Math.pow(-1, (n / 2) - 1) * Zeta.zetaStandard(n) * 2 * Factorial.factorial(n) / Math.pow(2 * Math.PI, n);
        } else if (n == 1) {
            bernoulliN = -0.5;
        } else if (n == 0) {
            bernoulliN = 1;
        } else if (n > 1){
            bernoulliN = 0;
        } else {
            bernoulliN = Double.NaN;
        }
        result = MathUtils.roundDouble(bernoulliN, 5);
        return result;
    }

    public static double bernoulliPolynomial(int n, double x) {
        double bernoulliP = 0;
        double result;

        for (int i = 0; i <= n; i++) {
            bernoulliP += MathUtils.nCr(n, i) * bernoulliNumber(n-i) * Math.pow(x, i);
        }
        result = MathUtils.roundDouble(bernoulliP, 5);
        return result;
    }
}
