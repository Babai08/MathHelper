package dev.babai08.mathhelper;

import dev.babai08.mathhelper.utils.*;

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
        System.out.println("Omega e^ Omega = " + MathUtils.omega * Math.exp(MathUtils.omega));
        System.out.println("Area under circle between 0 and 1 is " + DefiniteIntegral.functionArea(0, 1, 1250000));
        System.out.println("Bernoulli 6 is " + Bernoulli.bernoulliNumber(6));
        System.out.println("Stieltjes 1 is " + StieltjesConstant.StieltjesGamma(1));
    }
}
