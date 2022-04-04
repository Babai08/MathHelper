package dev.babai08.mathhelper.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigComplex {

    private final BigDecimal x, y;

    public BigComplex(BigDecimal u, BigDecimal v) {
        x = u;
        y = v;
    }

    public BigDecimal Re() {
        return x;
    }

    public BigDecimal Im() {
        return y;
    }

    public BigDecimal mod() {
        return BigDecimal.valueOf(Math.sqrt((x.pow(2).add(y.pow(2))).longValueExact()));
    }

    public BigDecimal arg() {
        return BigDecimal.valueOf(Math.atan2(y.longValueExact(), x.longValueExact()));
    }

    public BigComplex conj() {
        return new BigComplex(x, y.multiply((BigDecimal.valueOf(-1))));
    }

    public BigComplex add(BigComplex w) {
        return new BigComplex(x.add(w.Re()), y.add(w.Im()));
    }

    public BigComplex sub(BigComplex w) {
        return new BigComplex(x.subtract(w.Re()), y.subtract(w.Im()));
    }

    public BigComplex mul(BigComplex w) {
        return new BigComplex(x.multiply(w.Re()).subtract(y.multiply(w.Im())), x.multiply(w.Im()).add(y.multiply(w.Re())));
    }

    public BigComplex div(BigComplex w) {
        BigDecimal r2 = mod().pow(2);
        return new BigComplex((x.multiply(w.Re()).add(y.multiply(w.Im()))).divide(r2, RoundingMode.HALF_UP), (y.multiply(w.Re()).subtract(x.multiply(w.Im()))).divide(r2, RoundingMode.HALF_UP));
    }

    public BigComplex power(BigComplex w) {
        double theta = Math.atan2(y.longValueExact(), x.longValueExact());
        double mod = Math.sqrt((x.pow(2).add(y.pow(2))).longValueExact());

        BigDecimal RePart = BigDecimal.valueOf(Math.pow(mod, w.Re().longValueExact()) * Math.exp(-w.Im().longValueExact() * theta) * Math.cos(Math.log(mod) * w.Im().longValueExact() + w.Re().longValueExact() * theta));
        BigDecimal ImPart = BigDecimal.valueOf(Math.pow(mod, w.Re().longValueExact()) * Math.exp(-w.Im().longValueExact() * theta) * Math.sin(Math.log(mod) * w.Im().longValueExact() + w.Re().longValueExact() * theta));

        return new BigComplex(RePart, ImPart);
    }

    public BigComplex chs(BigComplex w) {
        return new BigComplex(w.Re().multiply(BigDecimal.valueOf(-1)), w.Im().multiply(BigDecimal.valueOf(-1)));
    }

    public String toString() {
        if (x.doubleValue() != 0 && y.doubleValue() > 0) {
            return x.doubleValue() + " + " + y.doubleValue() + "i";
        }
        if (x.doubleValue() != 0 && y.doubleValue() < 0) {
            return x.doubleValue() + " - " + (y.multiply((BigDecimal.valueOf(-1)))).doubleValue() + "i";
        }
        if (y.doubleValue() == 0) {
            return String.valueOf(x.doubleValue());
        } else {
            return y.doubleValue() + "i";
        }
    }
}
