package dev.babai08.mathhelper.utils;

import java.math.BigDecimal;

public class StieltjesConstant {

    public static double StieltjesGamma(int n) {
        double m = 1000000000;
        double rawResult = 0;

        for (int k = 1; k <= m; k++) {
            rawResult += Math.pow(Math.log(k), n)/k;
        }

        rawResult += - Math.pow(Math.log(m), n + 1)/(n + 1);
        return MathUtils.roundDouble(rawResult, 5);
    }

}
