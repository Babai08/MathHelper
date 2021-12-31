package dev.babai08.mathhelper;

import dev.babai08.mathhelper.complexFunctions.cGamma;
import dev.babai08.mathhelper.utils.*;

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
        System.out.println("H_100 = " + HarmonicSeries.harmonicSeries(100));
        System.out.println("d/dx of Gamma(1) = " + NumericalDerivative.derivative("gamma",1,1, 1,0.0000001));
        System.out.println("Ei(-1) = " + FunctionDefiner.complexFunction("Ei", 1, 0, -1, 0, 1, 0));
        System.out.println("(1+i)tan(1+i)^(1+i) = " + FunctionDefiner.complexFunction("tan",1,1,1,1,1,1));
        //System.out.println("Stieltjes_1 = " + StieltjesConstant.StieltjesGamma(1));
        System.out.println("Gamma(-2.1) = " + FunctionDefiner.RealFunction("gamma", 1,-2.1,1));
        System.out.println("BernoulliB_2(100) = " + Bernoulli.bernoulliPolynomial(1, 100));
        System.out.println("Zeta(2) = " + FunctionDefiner.RealFunction("zeta",1,2,1));
        System.out.println("Gamma(0.1+0.1i) = " + cGamma.Gamma(0.1,0.1));
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
