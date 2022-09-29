package Lesson2.Inheritance;

public class HeavyBox extends Box{
    double weight;

    public HeavyBox(double height, double width, double length, double weight) {
        super(height, width, length);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void calcVolume() {
        System.out.println("Volume: " + (height * width * length));
    }
}
