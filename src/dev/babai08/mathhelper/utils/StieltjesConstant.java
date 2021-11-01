package dev.babai08.mathhelper.utils;

public class StieltjesConstant {

    public static double StieltjesGamma(double m) {
        double stieltjesGammaN = 0;
        double innerFor = 0;
        double result;

        for (int n = 0; n <= 500; n++) {
            for (int k = 0; k <= n; k++){
                innerFor += Math.pow(-1, k) * MathUtils.nCr(n, k) * Math.pow(Math.log(k+1), m+1);
            }
            stieltjesGammaN += 1/(n+1) * innerFor;
            innerFor = 0;
        }
        stieltjesGammaN *= -1/(m + 1);
        result = MathUtils.roundDouble(stieltjesGammaN, 5);
        return result;
    }
}
