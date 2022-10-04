package Lesson3.Abstract;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public void showName() {

    }
}
