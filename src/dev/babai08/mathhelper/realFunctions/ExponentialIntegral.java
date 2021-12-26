package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.Factorial;
import dev.babai08.mathhelper.utils.MathUtils;

public class ExponentialIntegral {

    public static double Ei(double x) {
        double EiResult = 0;

        if (x >= -34 && x <= 34) {
            EiResult += MathUtils.gamma + Math.log(java.lang.Math.abs(x));

            for (int n = 1; n <= 10000; n++) {
                EiResult += Math.pow(x, n) / (n * (Factorial.factorial(n)));
            }
        } else if (x < -34) {
            EiResult = 0;
        } else {
            EiResult = Double.NaN;
        }

        return EiResult;
    }
}
