package Homeworks.Lesson2;

public class MathFunctions implements IMathFunction{

    @Override
    public double Power(double num, int p) {
        return Math.pow(num, p);
    }

    @Override
    public double AbsComplex(double x, double y) {
        double z = Math.sqrt((x*x + y*y));
        return z;
    }

    public double CirclePerimeter(double r) {
        return 2*r*pi;

    }
}
