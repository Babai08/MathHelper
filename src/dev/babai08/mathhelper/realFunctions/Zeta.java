package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.Factorial;
import dev.babai08.mathhelper.utils.MathUtils;

public class Zeta {

    public static double zetaDefinitionRaw(double n) {
        double result = 0;

        if (n > 1) {
            for (int m = 1; m <= 30000000; m++) {
                result += 1 / Math.pow(m, n);
            }
            return result;
        }

        return Double.POSITIVE_INFINITY;
    }

    // Uses a sum from Wolfram Alpha
    public static double zetaAlternateRaw(double s) {
        double sum = 0;
        if (s > 1) {
            for (int k = 0; k <= 47453132; k++) {
                sum += 1 / Math.pow((1 + 2 * k), s);
            }
            return (Math.pow(2, s) * sum) / (Math.pow(2, s) - 1);
        }
        return Double.NaN;
    }

    // Uses the Dirichlet series for the zeta function in the loop for s > 1, Uses the analytic continuation for s < 0, uses the Laurent series for 0 < s < 1
    public static double zeta(double s) {
        double result = 0;

        if (s > 15) {
            for (int n = 1; n <= 14566; n++) {
                result += (n * (n + 1) * (((2 * n + 3 + s) / (Math.pow(n + 1, s + 2))) - ((2 * n - 1 - s) / Math.pow(n, s + 2)))) / 2;
            }
            return result / (s - 1);
        } else if (s == 1) {
            return Double.NaN;
        } else if (s == 0) {
            return -0.5;
        } else if (s < -17) {
            return Math.pow(2, s) * Math.pow(Math.PI, s - 1) * Math.sin(Math.PI * s / 2) * Gamma.gamma(1 - s) * zeta(1 - s);
        } else {
            for (int n = 0; n<= 78; n++) {
                result += MathUtils.StieltjesGamma[n]*Math.pow((1-s),n)/ Factorial.factorial(n);
            }
            return 1/(s-1)+result;
        }
    }
}
