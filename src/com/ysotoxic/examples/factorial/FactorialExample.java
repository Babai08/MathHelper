/*
 * Created by Dom (YSoToxic) and Babai08 on 29/10/2021
 * Copyright (c) 2021.
 *
 * https://github.com/YSoToxic
 * https://github.com/Babai08
 *
 * last modified: 30/10/2021 6:33 PM
 */

package com.ysotoxic.examples.factorial;

public class FactorialExample {
    public static final double gamma = 0.5772156649015328606065120900824024310421593359399235988057672348848677267776646709369470632917467495146314472498070824809605040;

    public static void main(String[] args) {
        int count;
        int lineCount = 1;
        float result = 0;

        for (count = 0; count <= 100; count++) {
            result += Math.pow(-1, count) * Math.pow(gamma, 2 * count + 1) / factorial(2 * count + 1);
            System.out.println("[" + lineCount + "] MATH : OUT : " + result);
            lineCount++;
        }

        System.out.println("MATH : END : " + result);
        System.out.println("EI(" + -1 + ") = " + Ei(-1));
        System.out.println("zeta(" + -1 + ") = " + zetaDefiner(-1));
    }

    public static double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }

    public static double Ei(double n) {
        double EiResult = 0;

        if (n >= -34 && n <= 34) {
            EiResult += gamma + Math.log(java.lang.Math.abs(n));

            for (int m = 1; m <= 100; m++) {
                EiResult += Math.pow(n, m) / (m * (factorial(m)));
            }

        } else if (n < -34) {
            EiResult = 0;
        } else {
                EiResult = Double.NaN;
            }

        return EiResult;
    }

    public static double zetaDefiner(double n) {
        double zetaResult;

        if (n >= 1) {
            zetaResult = zetaStandard(n);
        } else {
            zetaResult = zetaExtended(n);
        }
        return zetaResult;
    }

    public static double zetaStandard(double n) {
        double zetaResult = 0;

        if (n > 1) {
            for (int m = 1; m <= 28391621; m++) {
                zetaResult += 1 / Math.pow(m, n);
            }
            //round this to 4 or 5 decimal places
        } else if (n == 1) {
            zetaResult = Double.POSITIVE_INFINITY;
        }

        return zetaResult;
    }

    public static double zetaExtended(double n) {
        double zetaResult = 0;

        if (n < 0 && n % 2 == 0) {
            zetaResult = 0;
        } else if (n == 0) {
            zetaResult = -0.5;
        } else if (n == -1) {
            zetaResult = -0.0833333333333333333333333;
        }
        return zetaResult;
    }

}
