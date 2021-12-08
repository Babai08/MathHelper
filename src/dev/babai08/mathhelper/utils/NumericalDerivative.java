package dev.babai08.mathhelper.utils;

public class NumericalDerivative {
    public static final double h = 0.00000001;

    public static double Derivative(double x) {
        double rawResult;
        double result;

        rawResult = (Math.sin(x+h)-Math.sin(x))/h;
        result = MathUtils.roundDouble(rawResult,5);
        return result;
    }
}
