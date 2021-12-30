package dev.babai08.mathhelper;

import dev.babai08.mathhelper.realFunctions.*;
import dev.babai08.mathhelper.complexFunctions.*;
import dev.babai08.mathhelper.utils.Complex;
import dev.babai08.mathhelper.utils.Factorial;

public class FunctionDefiner {

    public static double RealFunction(String type, double coefficient, double x, double exponent) {
        return switch (type) {
            case "sin" -> coefficient * Math.pow(Math.sin(x), exponent);
            case "cos" -> coefficient * Math.pow(Math.cos(x), exponent);
            case "e" -> coefficient * Math.pow(Math.exp(x),exponent);
            case "zeta" -> coefficient * Math.pow(Zeta.zeta(x), exponent);
            case "tan" -> coefficient * Math.pow(Math.tan(x), exponent);
            case "sec" -> coefficient / Math.pow(Math.cos(x), exponent);
            case "csc" -> coefficient / Math.pow(Math.sin(x), exponent);
            case "cot" -> coefficient / Math.pow(Math.tan(x), exponent);
            case "Ei" -> coefficient * Math.pow(ExponentialIntegral.Ei(x), exponent);
            case "^" -> coefficient * Math.pow(x, exponent);
            case "ln" -> coefficient * Math.pow(Math.log(x), exponent);
            case "Li" -> coefficient * Math.pow(LogarithmicIntegral.Li(x), exponent);
            case "gamma" -> coefficient * Math.pow(Gamma.gamma(x),exponent);
            case "!" -> coefficient * Math.pow(Factorial.extFactorial(x),exponent);
            default -> Double.NaN;
        };
    }

    public static Complex complexFunction(String type, double ReCoefficient, double ImCoefficient, double x, double y, double ReExponent, double ImExponent) {
        return switch (type) {
            case "sin" -> (cTrigonometricFunctions.sin(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "cos" -> (cTrigonometricFunctions.cos(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "tan" -> (cTrigonometricFunctions.tan(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "sec" -> (cTrigonometricFunctions.sec(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "csc" -> (cTrigonometricFunctions.csc(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "cot" -> (cTrigonometricFunctions.cot(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "Ei" -> (cExponentialIntegral.Ei(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "^" -> (new Complex(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "sinh" -> (cHyperbolicTrigonometricFunctions.sinh(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "cosh" -> (cHyperbolicTrigonometricFunctions.cosh(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "tanh" -> (cHyperbolicTrigonometricFunctions.tanh(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "sech" -> (cHyperbolicTrigonometricFunctions.sech(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "csch" -> (cHyperbolicTrigonometricFunctions.csch(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "coth" -> (cHyperbolicTrigonometricFunctions.coth(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            case "e" -> (cExponential.exp(x,y).power(new Complex(ReExponent, ImExponent))).mul(new Complex(ReCoefficient, ImCoefficient));
            default -> new Complex(Double.NaN, Double.NaN);
        };
    }
}
