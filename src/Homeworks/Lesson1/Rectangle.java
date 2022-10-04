package Homeworks.Lesson1;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return length*width;
    }

    public double Perimeter() {
        return 2*(length+width);
    }

    public void displayProperties() {
        System.out.printf("Длина: %s. Ширина: %s. \n", length, width);
        System.out.printf("Площадь: %s. Периметр: %s. \n", Area(), Perimeter());
    }
}
