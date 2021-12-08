package dev.babai08.mathhelper.utils;

import java.util.Objects;

public class FunctionDefiner {

    public static double function(String func,double sign, double x) {
        double realSign = Math.abs(sign)/sign;
        double result = Double.NaN;
        if (Objects.equals(func, "sin")) {
            result = realSign*Math.sin(x);
        }
        if (Objects.equals(func, "cos")) {
            result = realSign*Math.cos(x);
        }
        if (Objects.equals(func, "e") || Objects.equals(func, "exp")) {
            result = realSign*Math.exp(x);
        }
        if (Objects.equals(func, "zeta")) {
            result = realSign*Zeta.zetaDefinerRaw(x);
        }
        if (Objects.equals(func, "gamma")) {
            result = realSign*Gamma.gamma(x);
        }

        return result;
    }
}
