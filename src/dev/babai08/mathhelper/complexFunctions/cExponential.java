package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.BigComplex;
import dev.babai08.mathhelper.utils.Complex;

import java.math.BigDecimal;

public class cExponential {

    public static Complex exp(double x, double y) {
        return new Complex(Math.exp(x)*Math.cos(y), Math.exp(x)*Math.sin(y));
    }

    public static BigComplex exp(BigDecimal x, BigDecimal y) {
        return new BigComplex(BigDecimal.valueOf(Math.exp(x.longValueExact())*Math.cos(y.longValueExact())),BigDecimal.valueOf(Math.exp(x.longValueExact())*Math.sin(y.longValueExact())));
    }
}
