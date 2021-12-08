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

        if (n > 1) {
            for (int m = 1; m <= 28391621; m++) {
                zetaResult += 1 / Math.pow(m, n);
            }
        } else if (n == 1) {
            zetaResult = Double.POSITIVE_INFINITY;
        }

        return MathUtils.roundDouble(zetaResult, 5);
    }

    public static double zetaExtended(double n) {
        double result;
        if (n<=-0.4) {
            result = Math.pow(2, n) * Math.pow(Math.PI, n - 1) * Math.sin(n * Math.PI / 2) * Gamma.gamma(1 - n) * zetaStandard(1 - n);
        } else {
            result = 1/(n-1)+MathUtils.gamma+MathUtils.StieltjesGamma1 *(1-n)+MathUtils.StieltjesGamma2*Math.pow(1-n,2)/2;
        }
        return MathUtils.roundDouble(result, 5);
    }

    public static double zetaDefinerRaw(double n) {
        double zetaResult;

        if (n >= 1) {
            zetaResult = zetaStandardRaw(n);
        } else {
            zetaResult = zetaExtendedRaw(n);
        }

        return zetaResult;
    }

    public static double zetaStandardRaw(double n) {
        double result = 0;

        if (n > 1) {
            for (int m = 1; m <= 28391621; m++) {
                result += 1 / Math.pow(m, n);
            }
            return  result;
        }

        return Double.POSITIVE_INFINITY;
    }

    public static double zetaExtendedRaw(double n) {
        double result;
        if (n<=-0.4) {
            result = Math.pow(2, n) * Math.pow(Math.PI, n - 1) * Math.sin(n * Math.PI / 2) * Gamma.gamma(1 - n) * zetaStandard(1 - n);
        } else {
            result = 1/(n-1)+MathUtils.gamma+MathUtils.StieltjesGamma1 *(1-n)+MathUtils.StieltjesGamma2*Math.pow(1-n,2)/2;
        }
        return result;
    }
}
