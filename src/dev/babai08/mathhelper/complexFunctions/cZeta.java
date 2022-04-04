package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.utils.Complex;

public class cZeta {

    public static Complex zeta(double x, double y) {

        if (x>0) {
            double RePart = 0;
            double ImPart = 0;

            for (double n=1; n<=14566; n++){
                double m = n*(n+1)/2;
                double sumE1 = Math.exp(-(x+2)*Math.log(n+1));
                double sumE2 = Math.exp(-(x+2)*Math.log(n));
                double sumArg1 = y*Math.log(n+1);
                double sumArg2 = y*Math.log(n);
                double sumScalar1 = 2*n+3+x;
                double sumScalar2 = 2*n-1-x;

                RePart += m*(sumScalar1*sumE1*Math.cos(sumArg1)+y*sumE1*Math.sin(sumArg1)-sumScalar2*sumE2*Math.cos(sumArg2)+y*sumE2*Math.sin(sumArg2));
                ImPart += m*(-sumScalar1*sumE1*Math.sin(sumArg1)+y*sumE1*Math.cos(sumArg1)+sumScalar2*sumE2*Math.sin(sumArg2)+y*sumE2*Math.cos(sumArg2));
            }
            return new Complex(RePart,ImPart).div(new Complex(x-1,y));
        } else
        return new Complex(Double.NaN, Double.NaN);
    }
}
