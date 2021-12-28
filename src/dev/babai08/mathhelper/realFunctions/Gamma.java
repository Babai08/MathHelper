package dev.babai08.mathhelper.realFunctions;

import dev.babai08.mathhelper.utils.MathUtils;

import java.math.BigDecimal;

public class Gamma{

    public static double gamma(double x) {
        double result = 0;
        int m;
        double dt;

        if(x > 1) {
            m = (int) MathUtils.roundDouble(x,0);
            dt = 0.0001;
        } else if (x != 1){
            m = 1000;
            dt = 0.000001;
        } else {
            m = 1;
            dt = 0.00001;
        }

        for(int t=1; t < 100000*m; t++) {
            result += Math.pow(t*dt,(x-1))*Math.exp(-t*dt)*dt;
        }

        return MathUtils.roundDouble(result, 5);
    }

    public static double gammaRaw(double n) {
        double result = 0;
        int m;
        double dx;

        if(n > 1) {
            m = (int) MathUtils.roundDouble(n,0);
            dx = 0.0001;
        } else if (n != 1){
            m = 100;
            dx = 0.000001;
        } else {
            m = 100;
            dx = 0.00001;
        }

        for(int i=1; i < 100000*m; i++) {
            result += Math.pow(i*dx,(n-1))*Math.exp(-i*dx)*dx;
        }

        return result;
    }

    public static double gamma1(double x) {
        double sum = 0;
        double result;

        for (int n = 1; n <= 1000000; n++) {
            sum += Math.log(Math.abs(1+(x/n)))-(x/n);
        }

        result = Math.exp(-Math.log(Math.abs(x))-MathUtils.gamma*x-sum);

        if(x >= 0) {
            return result;
        } else {
            double sgn = (Math.sin(Math.PI*x)/Math.abs(Math.sin(Math.PI*x)));
            return result*sgn;
        }
    }
}
