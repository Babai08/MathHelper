/*
 * Created by Dom (YSoToxic) and Babai08 on 29/10/2021
 * Copyright (c) 2021.
 *
 * https://github.com/YSoToxic
 * https://github.com/Babai08
 *
 * last modified: 29/10/2021 9:55 PM
 */

package com.ysotoxic.examples.factorial;

public class FactorialExample {

    public static void main(String[] args) {
        int count;
        int lineCount = 1;
        float result = 0;

        for (count = 0; count <= 100; count++) {
            result += 1 / factorial(count);
            System.out.println("[" + lineCount + "] MATH : OUT : " + result);
            lineCount++;
        }

        System.out.println("MATH : END : " + result);
    }

    public static float factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }
}
