package dev.babai08.mathhelper.utils;

public class DefiniteIntegral {

    public static double functionArea(double a, double b) {
        double result;
        double resultRaw = 0;
        double dx = (a + b) / 12500000;

        for (double i = a; i <= 12500000; i++) {
            resultRaw += Math.sin(i * dx) * dx;
        }
        result = MathUtils.roundDouble(resultRaw, 5);
        return result;
    }
}
