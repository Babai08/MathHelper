package dev.babai08.mathhelper.utils;

public class HarmonicSeries {

    public static double harmonicSeries(int n) {
        double result = 0;
        for (double i = 1; i <= n; i++) {
            result += 1 / i;
        }

        return result;
    }
}
