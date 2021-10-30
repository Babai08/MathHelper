package dev.Babai08.mathhelper.utils;

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

        if (n > 1) {
            for (int m = 1; m <= 28391621; m++) {
                zetaResult += 1 / Math.pow(m, n);
            }
            //round this to 4 or 5 decimal places
        } else if (n == 1) {
            zetaResult = Double.POSITIVE_INFINITY;
        }

        return zetaResult;
    }

    public static double zetaExtended(double n) {
        double zetaResult = 0;

        if (n < 0 && n % 2 == 0) {
            zetaResult = 0;
        } else if (n == 0) {
            zetaResult = -0.5;
        } else if (n == -1) {
            zetaResult = -0.0833333333333333333333333;
        }
        return zetaResult;
    }
}
