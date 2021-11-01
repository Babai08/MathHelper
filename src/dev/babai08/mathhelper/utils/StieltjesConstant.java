package dev.babai08.mathhelper.utils;

public class StieltjesConstant {

    public static double StieltjesGamma(int n) {
        double m = 1000000000;
        double rawResult = 0;
        double result;

        for (int k = 1; k <= m; k++) {
            rawResult += Math.pow(Math.log(k), n)/k;
        }
        rawResult += - Math.pow(Math.log(m), n + 1)/(n + 1);
        result = MathUtils.roundDouble(rawResult, 5);
        return result;
    }
}
