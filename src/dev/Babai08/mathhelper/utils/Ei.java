package dev.Babai08.mathhelper.utils;

public class Ei {

    public static double Ei(double n, double gamma) {
        double EiResult = 0;

        if (n >= -34 && n <= 34) {
            EiResult += gamma + Math.log(java.lang.Math.abs(n));

            for (int m = 1; m <= 100; m++) {
                EiResult += Math.pow(n, m) / (m * (Factorial.factorial(m)));
            }
        } else if (n < -34) {
            EiResult = 0;
        } else {
            EiResult = Double.NaN;
        }

        return EiResult;
    }
}
