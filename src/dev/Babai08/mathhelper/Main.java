package dev.Babai08.mathhelper;

import dev.Babai08.mathhelper.utils.*;

public class Main {

    public static void main(String[] args) {
        int count;
        int lineCount = 1;
        float result = 0;

        for (count = 0; count <= 100; count++) {
            result += Math.pow(-1, count) * Math.pow(MathUtils.gamma, 2 * count + 1) / Factorial.factorial(2 * count + 1);
            System.out.println("[" + lineCount + "] MATH : OUT : " + result);
            lineCount++;
        }

        System.out.println("MATH : END : " + result);
        System.out.println("Ei(" + -1 + ") = " + ExponentialIntegral.Ei(-1));
        System.out.println("zeta(" + -1 + ") = " + Zeta.zetaDefiner(-1));
    }
}
