package dev.babai08.mathhelper.complexFunctions;

import dev.babai08.mathhelper.realFunctions.Zeta;
import dev.babai08.mathhelper.utils.Complex;

import java.math.BigDecimal;

public class cZeta {

    public static Complex zeta(double x, double y) {

        if (y==0) {

            return new Complex(Zeta.zeta(x), 0);

        } else if (x>0) {
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
        } else if (x<=0) {
            return new Complex(1,1).mul(cExponential.exp(x*Math.log(2),y*Math.log(2)).mul(cExponential.exp((x-1)*Math.log(Math.PI),y*Math.log(Math.PI))).mul(cTrigonometricFunctions.sin(Math.PI*x/2,Math.PI*y/2)).mul(cGamma.Gamma(1-x,-y)).mul(zeta(1-x,-y)));
        }

        return new Complex(Double.NaN, Double.NaN);
    }
}
