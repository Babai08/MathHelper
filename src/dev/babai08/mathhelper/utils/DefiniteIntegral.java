package dev.babai08.mathhelper.utils;

public class DefiniteIntegral {

    public static double functionArea(double a, double b, int iterations) {
        double resultRaw = 0;
        double dx = (a + b) / iterations;

        for (double i = a; i <= iterations; i++) {
            resultRaw += Math.sqrt(1 - Math.pow(i * dx, 2)) * dx;
        }

        return MathUtils.roundDouble(resultRaw, 5);
    }
}
