package dev.babai08.mathhelper;

import dev.babai08.mathhelper.utils.Gamma;
import dev.babai08.mathhelper.utils.Zeta;

public class FunctionDefiner {

    public static double RealFunction(String type, double coefficient, double x) {
        return switch (type) {
            case "sin" -> coefficient * Math.sin(x);
            case "cos" -> coefficient * Math.cos(x);
            case "e" -> coefficient * Math.exp(x);
            case "zeta" -> coefficient * Zeta.zetaDefinerRaw(x);
            case "gamma" -> coefficient * Gamma.gammaRaw(x);
            case "tan" -> coefficient + Math.tan(x);
            case "sec" -> coefficient / Math.cos(x);
            case "csc" -> coefficient / Math.sin(x);
            case "cot" -> coefficient / Math.tan(x);
            default -> Double.NaN;
        };
    }
}
