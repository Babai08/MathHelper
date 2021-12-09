package dev.babai08.mathhelper.utils;

import dev.babai08.mathhelper.FunctionDefiner;

public class NumericalDerivative {
    public static final double h = 0.00000001;

    public static double Derivative(String func,double coefficient,double x) {
        return MathUtils.roundDouble((FunctionDefiner.RealFunction(func,coefficient,x+h)-FunctionDefiner.RealFunction(func,coefficient,x))/h,5);
    }
}
