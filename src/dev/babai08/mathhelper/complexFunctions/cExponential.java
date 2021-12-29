package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.Complex;

public class cExponential {

    //Uses Euler's Formula e^ix=cos(x)+isin(x)
    public static Complex exp(double x, double y) {
        return new Complex(Math.exp(x)*Math.cos(y), Math.exp(x)*Math.sin(y));
    }
}
