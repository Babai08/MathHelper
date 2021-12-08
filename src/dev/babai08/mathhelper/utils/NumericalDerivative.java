package dev.babai08.mathhelper.utils;

public class NumericalDerivative {
    public static final double h = 0.00000001;

    public static double Derivative(String func,double sign,double x) {
        double realSign = Math.abs(sign)/sign;
        return MathUtils.roundDouble((FunctionDefiner.function(func,realSign,x+h)-FunctionDefiner.function(func,realSign,x))/h,5);
    }
}
