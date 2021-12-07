package dev.babai08.mathhelper.utils;

public class Zeta {

    public static double zetaDefiner(double n) {
        double zetaResult;

        if (n >= 1) {
            zetaResult = zetaStandard(n);
        } else {
            zetaResult = zetaExtended(n);
        }
        return zetaResult;
    }

    public static double zetaStandard(double n) {
        double zetaResult = 0;
        double result;

        if (n > 1) {
            for (int m = 1; m <= 28391621; m++) {
                zetaResult += 1 / Math.pow(m, n);
            }
        } else if (n == 1) {
            zetaResult = Double.POSITIVE_INFINITY;
        }
        result = MathUtils.roundDouble(zetaResult, 5);
        return result;
    }

    public static double zetaExtended(double n) {
        double result;
        double zetaResult = 0;
        //int intN = (int) MathUtils.roundDouble(n);

        //if (intN < 0) {
            //zetaResult -= Bernoulli.bernoulliNumber(Math.abs(intN) + 1) / (Math.abs(intN) + 1);
        //} else if (n == 0) {
            //zetaResult = -0.5;
        //} else if (n < 0) {
            double dx = 0.001;

            for (double x = 0; x <= 10 * Math.abs(n); x += dx) {
                zetaResult += ((Math.pow(1 + Math.pow(x, 2), - n / 2)) * Math.sin(n * Math.atan(x)) / (Math.exp(2 * Math.PI * x) - 1));
            }
            zetaResult += zetaResult;
            zetaResult -= (n+1) / (2 - 2 * n);
        //}
        result = MathUtils.roundDouble(zetaResult, 5);
        return result;
    }
}
