package dev.babai08.mathhelper.realFunctions;

public class ProductLog {

    public static double W(double x) {
        double ans = Math.abs(Math.log(Math.abs(x)));

        if (x==0) {
            return 0;
        } else {
            for (int i = 1; i < 25; i++) {
                ans = ans - (ans * Math.exp(ans) - x) / (ans * Math.exp(ans) + Math.exp(ans));
            }
            return ans;
        }
    }
}
