package dev.babai08.mathhelper.utils;

import dev.babai08.mathhelper.realFunctions.Gamma;
import java.math.BigDecimal;

public class Factorial {

    public static double factorial(int n) {
        if (n == 0) return 1;
        else return (n * factorial(n - 1));
    }

    public static BigDecimal factorial(long n) {
        if (n == 0) return BigDecimal.ONE;
        else return factorial(n - 1).multiply(BigDecimal.valueOf(n));
    }

    public static double extFactorial(double n) {
        return Gamma.gamma(n + 1);
    }
}
