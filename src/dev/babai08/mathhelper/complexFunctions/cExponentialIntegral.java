package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.*;

public class cExponentialIntegral {

    public static Complex Ei(double x, double y) {
        double theta = Math.atan2(y,x);
        double mod = Math.sqrt(x*x+y*y);
        double RePart = MathUtils.gamma + Math.log(mod);
        double ImPart = theta;

        if (mod < 34) {
            for (int n = 1; n <= 10000; n++) {
                RePart += Math.pow(mod, n) * Math.cos(n * theta) / (n * Factorial.factorial(n));
                ImPart += Math.pow(mod, n) * Math.sin(n * theta) / (n * Factorial.factorial(n));
            }
            return new Complex(RePart, ImPart);
        } else {
            return new Complex(Double.NaN, Double.NaN);
        }
    }
}
