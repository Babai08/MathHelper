package dev.babai08.mathhelper.utils;

public class Gamma{

    public static double gamma(double n) {
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
}
