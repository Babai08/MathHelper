package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.MathUtils;

public class Gamma{

    // Directs the value to the more accurate definition for its sign.
    public static double gamma(double x) {

        if (x>0) {
            return EulerGamma(x);
        } else if (x < 0) {
            return WeierstrassGamma(x);
        }
        return Double.NaN;
    }

    //Uses the Euler Product definition of the Gamma function
    public static double EulerGamma(double x) {
        double result = 1/x;

        for (int n = 1; n <= 25000000; n++) {
            result *= Math.pow(1+Math.pow(n,-1),x)/(1+(x/n));
        }
        return result;
    }

    //Uses the Weierstrass Product definition of the Gamma function
    public static double WeierstrassGamma(double x) {
        double result = Math.exp(x*(-MathUtils.StieltjesGamma[0]))/x;

        for (int n=1; n <= 25000000; n++) {
            result *= Math.exp(x/n)/(1+(x/n));
        }
        return result;
    }
}
