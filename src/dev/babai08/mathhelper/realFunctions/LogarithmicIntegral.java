package dev.babai08.mathhelper.realFunctions;

public class LogarithmicIntegral {

    public static double Li(double x) {
        if (x >= 0) {
            return ExponentialIntegral.Ei(Math.log(x));
        }

        return Double.NaN;
    }
}
