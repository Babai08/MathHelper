package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.MathUtils;

public class Zeta {

    public static double zetaDefinerRaw(double n) {
        double zetaResult;

        if (n >= 1) {
            zetaResult = zetaDefinitionRaw(n);
        } else {
            zetaResult = zetaExtendedRaw(n);
        }

        return zetaResult;
    }

    public static double zetaDefinitionRaw(double n) {
        double result = 0;

        if (n > 1) {
            for (int m = 1; m <= 30000000; m++) {
                result += 1 / Math.pow(m, n);
            }
            return  result;
        }

        return Double.POSITIVE_INFINITY;
    }

    //Uses the analytic continuation
    public static double zetaExtendedRaw(double n) {
        double result;
        if (n<=-0.4) {
            result = Math.pow(2, n) * Math.pow(Math.PI, n - 1) * Math.sin(n * Math.PI / 2) * Gamma.gamma(1 - n) * zeta(1 - n);
        } else {
            result = 1/(n-1)+MathUtils.gamma+MathUtils.StieltjesGamma1 *(1-n)+MathUtils.StieltjesGamma2*Math.pow(1-n,2)/2;
        }
        return result;
    }

    //Uses a sum from Wolfram Alpha
    public static double zetaAlternateRaw(double s) {
        double sum = 0;
        double result;
        if (s>1) {
            for (int k = 0; k <= 47453132; k++) {
                sum += 1/Math.pow((1+2*k),s);
            }
            result = (Math.pow(2,s)*sum)/(Math.pow(2,s)-1);
            return result;
        }
        return Double.NaN;
    }

    //Uses the Dirichlet series for the zeta function

    public static double zeta(double s) {
        double result = 0;

        if (s > 1) {
            for (int n = 1; n <= 14566; n++) {
                result += (n*(n+1)*(((2*n+3+s)/(Math.pow(n+1,s+2)))-((2*n-1-s)/Math.pow(n,s+2))))/2;
            }
            return result/(s-1);
        } else if (s == 1) {
            return Double.NaN;
        } else if (s == 0) {
            return -0.5;
        } else if (s < 0){
            return Math.pow(2,s)*Math.pow(Math.PI,s-1)*Math.sin(Math.PI*s/2)*Gamma.gamma(1-s)*zeta(1-s);
        } else {
            return 1/(s-1)+MathUtils.gamma+MathUtils.StieltjesGamma1 *(1-s)+MathUtils.StieltjesGamma2*Math.pow(1-s,2)/2;
        }
    }

}
