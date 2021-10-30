package dev.babai08.mathhelper.utils;

public class Factorial {

    public static double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }
}
