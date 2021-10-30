package dev.Babai08.mathhelper;

import dev.Babai08.mathhelper.utils.Ei;
import dev.Babai08.mathhelper.utils.Factorial;
import dev.Babai08.mathhelper.utils.Zeta;

public class Main {
    private static final double gamma = 0.5772156649015328606065120900824024310421593359399235988057672348848677267776646709369470632917467495146314472498070824809605040;

    public static void main(String[] args) {
        int count;
        int lineCount = 1;
        float result = 0;

        for (count = 0; count <= 100; count++) {
            result += Math.pow(-1, count) * Math.pow(gamma, 2 * count + 1) / Factorial.factorial(2 * count + 1);
            System.out.println("[" + lineCount + "] MATH : OUT : " + result);
            lineCount++;
        }

        System.out.println("MATH : END : " + result);
        System.out.println("EI(" + -1 + ") = " + Ei.Ei(-1, gamma));
        System.out.println("zeta(" + -1 + ") = " + Zeta.zetaDefiner(-1));
    }
}
