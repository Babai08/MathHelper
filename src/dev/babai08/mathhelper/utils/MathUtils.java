package dev.babai08.mathhelper.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {

    public static final double gamma = 0.5772156649015328606065120900824024310421593359399235988057672348848677267776646709369470632917467495146314472498070824809605040;
    public static final double omega = 0.5671432904097838729999686622103555497538157871865125081351310792230457930866845666932194469617522945576380249728667897854523584;
    public static final double StieltjesGamma1 = -0.0728158454836767248605863758749013191377363383343379525990065597414014335715114848780869282448440146040772072788867447594646;
    public static final double StieltjesGamma2 = -0.0096903631928723184845303860352125293590658061013407498807013654518507553822804141719781973813745373192862238585879468231253;

    public static long getDelta(int one, int two) {
        return Math.abs(one - two);
    }

    public static float getDelta(float one, float two) {
        return Math.abs(one - two);
    }

    public static double getDelta(double one, double two) {
        return Math.abs(one - two);
    }

    public static long getDelta(long one, long two) {
        return Math.abs(one - two);
    }

    public static float roundFloat(float value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(0, RoundingMode.UP);
        return bd.floatValue();
    }

    public static float roundFloat(float value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

    public static float roundFloat(float value, int places, RoundingMode mode) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, mode);
        return bd.floatValue();
    }

    public static double roundDouble(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(0, RoundingMode.UP);
        return bd.doubleValue();
    }

    public static double roundDouble(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        if(Double.isNaN(value) || Double.isInfinite(value)) return value;

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double roundDouble(double value, int places, RoundingMode mode) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, mode);
        return bd.doubleValue();
    }

    public static double nCr(int n, int r) {
        return Factorial.factorial(n) / (Factorial.factorial(n - r) * Factorial.factorial(r));
    }
}
