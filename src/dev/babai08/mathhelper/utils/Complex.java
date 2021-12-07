package dev.babai08.mathhelper.utils;

public class Complex extends Object {
    private double x,y;

    public Complex(double u, double v) {
        x=u;
        y=v;
    }

    public double Re() {
        return x;
    }

    public double Im() {
        return y;
    }

    public double mod() {
        if (x!=0 || y!=0) {
            return Math.sqrt(x*x+y*y);
        } else {
            return 0d;
        }
    }

    public double arg() {
        return Math.atan2(y,x);
    }

    public Complex conj() {
        return new Complex(x,-y);
    }

    public Complex plus(Complex w) {
        return new Complex(x+w.Re(),y-w.Im());
    }

    public Complex minus(Complex w) {
        return new Complex(x-w.Re(), y-w.Im());
    }

    public Complex times(Complex w) {
        return new Complex(x*w.Re()-y*w.Im(),x*w.Im()+y*w.Re());
    }

    public Complex div(Complex w) {
        double den = Math.pow(w.mod(),2);
        return new Complex((x*w.Re()+y*w.Im())/den,(y*w.Re()-x*w.Im())/den);
    }

    public Complex exp() {
        return new Complex(Math.exp(x)*Math.cos(y),Math.exp(x)*Math.sin(y));
    }

    public Complex log() {
        return new Complex(Math.log(this.mod()),this.arg());
    }

    public Complex nthRoot(double n) {
        double r = Math.pow(this.mod(), 1 / n);
        double theta = this.arg() / n;
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));
    }

    public Complex sin() {
        return new Complex(Math.cosh(y)*Math.sin(x),Math.sinh(y)*Math.cos(x));
    }

    public Complex cos() {
        return new Complex(Math.cosh(y)*Math.cos(x),Math.sinh(y)*Math.sin(x));
    }

    public Complex sinh() {
        return new Complex(Math.sinh(x)*Math.cos(y),Math.cosh(x)*Math.sin(y));
    }

    public Complex cosh() {
        return new Complex(Math.cosh(x)*Math.cos(y),Math.sinh(x)*Math.sin(y));
    }

    public Complex tan() {
        return new Complex(Math.sin(2*x)/(Math.cos(2*x)+Math.cosh(2*y)),Math.sinh(2*y)/(Math.cos(2*x)+Math.cosh(2*y)));
    }

    public Complex chs() {
        return new Complex(-x,-y);
    }

    public String toString() {
        if (x!=0 && y>0) {
            return x+" + "+y+"i";
        }
        if (x!=0 && y<0) {
            return x+" - "+(-y)+"i";
        }
        if (y==0) {
            return String.valueOf(x);
        }
        if (x==0) {
            return y+"i";
        }
        return x+" + i*"+y;
    }
}