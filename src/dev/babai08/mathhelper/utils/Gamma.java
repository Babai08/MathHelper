package dev.babai08.mathhelper.utils;

public class Gamma{

    public static double gamma(double n) {
        double result;
        double resultRaw = 0;
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
            resultRaw += Math.pow(i*dx,(n-1))*Math.exp(-i*dx)*dx;
        }
        result = MathUtils.roundDouble(resultRaw, 5);
        return result;
    }
}
