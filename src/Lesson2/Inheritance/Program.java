package Lesson2.Inheritance;

public class Program {
    public static void main(String[] args) {
        HeavyBox hb = new HeavyBox(10, 10, 10, 50);
        System.out.println(hb.getWeight());
        hb.calcVolume();
    }
}
