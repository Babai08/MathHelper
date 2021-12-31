package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.realFunctions.Gamma;
import dev.babai08.mathhelper.utils.Complex;

public class cGamma {

    // Uses Babai08's summation formula derived from the Euler definition
    public static Complex Gamma(double x, double y) {
        double lnRe = -Math.log(Math.sqrt(x*x+y*y));
        double lnIm = -Math.atan2(y, x);

        if (y == 0) {
            return new Complex(Gamma.gamma(x), 0);
        }

        for (int n = 1; n <= 25000000; n++) {
            double log = Math.log(1 + Math.pow(n, -1));
            lnRe += x * log - Math.log(Math.sqrt(Math.pow((x + n) / n, 2)+Math.pow(y / n, 2)));
            lnIm += y * log - Math.atan2(y / n ,(x + n) / n);
        }


        return new Complex(Math.exp(lnRe) * Math.cos(lnIm), Math.exp(lnRe) * Math.sin(lnIm));
    }
}
