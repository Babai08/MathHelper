package dev.babai08.mathhelper.utils;

public class NumericalDerivative {
    public static final double h = 0.00000001;

    public static double Derivative(double x) {
        return MathUtils.roundDouble((Math.sin(x+h)-Math.sin(x))/h,5);
    }
}
