package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.Complex;

public class cHyperbolicTrigonometricFunctions {

    //Uses the fact that isinh(ix)=sin(x) and cosh(ix)=cos(x) and multiple input formula's derived from definition
    public static Complex sinh(double x, double y) {
        return new Complex(Math.sinh(x)*Math.cos(y),Math.cosh(x)*Math.sin(y));
    }
    public static Complex cosh(double x, double y) {
        return new Complex(Math.cosh(x)*Math.cos(y),Math.sinh(x)*Math.sin(y));
    }
    public static Complex tanh(double x, double y) {
        return sinh(x,y).div(cosh(x,y));
    }
    public static Complex sech(double x, double y) {
        return new Complex(1, 0).div(cosh(x,y));
    }
    public static Complex csch(double x, double y) {
        return new Complex(1, 0).div(sinh(x,y));
    }
    public static Complex coth(double x, double y) {
        return cosh(x,y).div(sinh(x,y));
    }
}
