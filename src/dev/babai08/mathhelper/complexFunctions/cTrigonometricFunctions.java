package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.Complex;

public class cTrigonometricFunctions {

    //Uses the fact that isinh(ix)=sin(x) and cosh(ix)=cos(x) and multiple input formula's derived from complex definition
    public static Complex sin(double x, double y) {
        return (new Complex(Math.sin(x)*Math.cosh(y), Math.cos(x)*Math.sinh(y)));
    }
    public static Complex cos(double x, double y) {
        return (new Complex(Math.cos(x)*Math.cosh(y), -Math.sin(x)*Math.sinh(y)));
    }
    public static Complex tan(double x, double y) {
        return sin(x,y).div(cos(x,y));
    }
    public static Complex sec(double x, double y) {
        return new Complex(1,0).div(cos(x,y));
    }
    public static Complex csc(double x, double y) {
        return new Complex(1,0).div(sin(x,y));
    }
    public static Complex cot(double x, double y) {
        return new Complex(1,0).div(tan(x,y));
    }
}

