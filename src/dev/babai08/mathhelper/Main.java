package dev.babai08.mathhelper;

import dev.babai08.mathhelper.realFunctions.*;
import dev.babai08.mathhelper.utils.*;
import dev.babai08.mathhelper.window.Frame;
import dev.babai08.mathhelper.complexFunctions.*;

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
        System.out.println("Ei(" + -1 + ") = " + ExponentialIntegral.Ei(-1));
        System.out.println("zeta(" + -1 + ") = " + Zeta.zetaDefiner(-1));
        System.out.println("Omega e^ Omega = " + MathUtils.omega * Math.exp(MathUtils.omega));
        System.out.println("Area under circle between 0 and 1 is " + DefiniteIntegral.functionArea(0, 1, 1250000));
        System.out.println("Bernoulli 8 is " + Bernoulli.bernoulliNumber(8));
        System.out.println("tan(1-i) = " + new Complex(1,-1).tan());
        System.out.println("2/1+i = " + new Complex(2,0).div(new Complex(1,1)));
        System.out.println("Gamma(0.5) = " + Gamma.gamma(0.5));
        System.out.println("-0.5! = " + Factorial.extFactorial(-0.5));
        System.out.println("H_100 = " + HarmonicSeries.harmonicSeries(100));
        System.out.println("H_1000000-ln(1000000) = " + (HarmonicSeries.harmonicSeries(1000000) - Math.log(1000000)));
        System.out.println("d/dx of Gamma(1) = " + NumericalDerivative.derivative("gamma",1,1, 1, 0.01));
        System.out.println("arg(1+i) = " + new Complex(1,1).arg());
        System.out.println("(-1)^i = " + new Complex(-1,0).power(new Complex(0,1)));
        System.out.println("Ei(-1) = " + FunctionDefiner.complexFunction("Ei", 1, 0, -1, 0, 1, 0));
        System.out.println("(1+i)tan(1+i)^(1+i) = " + FunctionDefiner.complexFunction("tan",1,1,1,1,1,1));
        //System.out.println("Stieltjes_1 = " + StieltjesConstant.StieltjesGamma(1));

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
