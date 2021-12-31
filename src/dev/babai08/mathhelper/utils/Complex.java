package dev.babai08.mathhelper.utils;

public class Complex {

    private final double x, y;

    public Complex(double u, double v) {
        x = u;
        y = v;
    }

    public double Re() {
        return x;
    }

    public double Im() {
        return y;
    }

    public double mod() {
        if (x != 0 || y != 0) {
            return Math.sqrt(x * x + y * y);
        } else {
            return 0d;
        }
    }

    public double arg() {
        return Math.atan2(y, x);
    }

    public Complex conj() {
        return new Complex(x, -y);
    }

    public Complex add(Complex w) {
        return new Complex(x + w.Re(), y + w.Im());
    }

    public Complex sub(Complex w) {
        return new Complex(x - w.Re(), y - w.Im());
    }

    public Complex mul(Complex w) {
        return new Complex(x * w.Re() - y * w.Im(), x * w.Im() + y * w.Re());
    }

    public Complex div(Complex w) {
        double den = Math.pow(w.mod(), 2);
        return new Complex((x * w.Re() + y * w.Im()) / den, (y * w.Re() - x * w.Im()) / den);
    }

    public Complex log() {
        return new Complex(Math.log(this.mod()), this.arg());
    }

    public Complex nthRoot(double n) {
        double r = Math.pow(this.mod(), 1 / n);
        double theta = this.arg() / n;
        return new Complex(r * Math.cos(theta), r * Math.sin(theta));
    }

    public Complex chs() {
        return new Complex(-x, -y);
    }

    public Complex power(Complex w) {
        double theta = Math.atan2(y, x);
        double mod = Math.sqrt(x * x + y * y);

        return new Complex(Math.pow(mod, w.Re()) * Math.exp(-w.Im() * theta) * Math.cos(Math.log(mod) * w.Im() + w.Re() * theta), Math.pow(mod, w.Re()) * Math.exp(-w.Im() * theta) * Math.sin(Math.log(mod) * w.Im() + w.Re() * theta));
    }

    public String toString() {
        if (x != 0 && y > 0) {
            return x + " + " + y + "i";
        }
        if (x != 0 && y < 0) {
            return x + " - " + (-y) + "i";
        }
        if (y == 0) {
            return String.valueOf(x);
        } else {
            return y + "i";
        }
    }
}
