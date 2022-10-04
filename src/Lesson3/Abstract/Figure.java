package Lesson3.Abstract;

public abstract class Figure {
    protected String name = "";
    protected double pi = 3.14159;
    private double x, y;
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public abstract void showName();
}
