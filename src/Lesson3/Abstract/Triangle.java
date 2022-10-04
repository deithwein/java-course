package Lesson3.Abstract;

public class Triangle extends Figure {
    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void showName() {
        System.out.println("Треугольник");
    }
}
