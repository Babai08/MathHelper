package dev.babai08.mathhelper.utils;

import dev.babai08.mathhelper.FunctionDefiner;

public class NumericalDerivative {

    public static final double h = 0.00000001;

    public static double derivative(String func, double coefficient, double x, double exponent) {
        return MathUtils.roundDouble((FunctionDefiner.RealFunction(func, coefficient, x + h, exponent) - FunctionDefiner.RealFunction(func, coefficient, x, exponent)) / h, 5);
    }

    public static double derivative(String func, double coefficient, double x, double exponent, double dx) {
        return MathUtils.roundDouble((FunctionDefiner.RealFunction(func, coefficient, x + dx, exponent) - FunctionDefiner.RealFunction(func, coefficient, x, exponent)) / dx, 5);
    }
}
