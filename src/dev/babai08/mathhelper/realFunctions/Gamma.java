package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.MathUtils;

import java.math.BigDecimal;

public class Gamma{

    //Uses the natural log series expansion of the Weierstrass definition, more accurate for -ve numbers
    public static double gamma(double x) {
        double sum = 0;
        double result;

        for (int n = 1; n <= 1000000; n++) {
            sum += Math.log(Math.abs(1+(x/n)))-(x/n);
        }

        result = Math.exp(-Math.log(Math.abs(x))-MathUtils.gamma*x-sum);

        if(x >= 0) {
            return result;
        } else {
            double sgn = (Math.sin(Math.PI*x)/Math.abs(Math.sin(Math.PI*x)));
            return result*sgn;
        }
    }
}
