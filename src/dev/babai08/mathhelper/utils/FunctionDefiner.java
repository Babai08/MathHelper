package dev.babai08.mathhelper.utils;

public class FunctionDefiner {

    public static double MathDot(String type, double sign, double x) {
        double realSign = Math.abs(sign) / sign;
        return switch (type) {
            case "sin" -> realSign * Math.sin(x);
            case "cos" -> realSign * Math.cos(x);
            case "e" -> realSign * Math.exp(x);
            case "zeta" -> realSign * Zeta.zetaDefinerRaw(x);
            case "gamma" -> realSign * Gamma.gamma(x);
            default -> Double.NaN;
        };
    }
}
