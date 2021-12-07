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
        double zetaResult;

        zetaResult = Math.pow(2, n) * Math.pow(Math.PI, n - 1) * Math.sin(n * Math.PI / 2) * Gamma.gamma(1 - n) * zetaStandard(1 - n);

        result = MathUtils.roundDouble(zetaResult, 5);

        return result;
    }

}
