package dev.babai08.mathhelper;

import dev.babai08.mathhelper.utils.*;

import java.math.BigDecimal;
//import dev.babai08.mathhelper.window.Frame;

public class Main {

    public static void main(String[] args) {
        int count;
        int lineCount = 1;
        float result = 0;

        for (count = 0; count <= 100; count++) {
            result += Math.pow(-1, count) * Math.pow(Math.PI, 2 * count + 1) / Factorial.factorial(2 * count + 1);
            System.out.println("[" + lineCount + "] MATH : OUT : " + result);
            lineCount++;
        }

        System.out.println("MATH : END : " + result);
        System.out.println("Area under circle between 0 and 1 is " + DefiniteIntegral.functionArea(0, 1, 1250000));
        System.out.println("Bernoulli 4 is " + Bernoulli.BernoulliNumber(4));
        System.out.println("H_100 = " + HarmonicSeries.harmonicSeries(100));
        System.out.println("d/dx of Gamma(1) = " + NumericalDerivative.derivative("gamma",1,1, 1,0.000001));
        System.out.println("Ei(-1) = " + FunctionDefiner.complexFunction("Ei", 1, 0, -1, 0, 1, 0));
        System.out.println("(1+i)tan(1+i)^(1+i) = " + FunctionDefiner.complexFunction("tan",1,1,1,1,1,1));
        //System.out.println("Stieltjes_1 = " + StieltjesConstant.StieltjesGamma(1));
        System.out.println("(1+i)^(1+i) = "+ new BigComplex(BigDecimal.valueOf(1), BigDecimal.valueOf(1)).power(new BigComplex(BigDecimal.valueOf(1), BigDecimal.valueOf(1))));
        System.out.println("(1+i)^(1+i) = "+ new Complex(1,1).power(new Complex(1,1)));
        System.out.println("24! = " + Factorial.factorial(24));
        System.out.println("Gamma(3) = " + FunctionDefiner.RealFunction("gamma", 1,3,1));
        System.out.println("BernoulliB_2(100) = " + Bernoulli.bernoulliPolynomial(2, BigDecimal.valueOf(100)));
        System.out.println("Zeta(2) = " + FunctionDefiner.RealFunction("zeta",1,2,1));
        /*
        Test code for the window.
        Frame frame = new Frame();

        Some test code to see if the func was working

        double realSign = Math.abs(5) / 5;
        System.out.println("A " + realSign * Math.sin(5));
        System.out.println("B " + MathUtils.MathDot("sin", 5, 5));
        */
    }
}
