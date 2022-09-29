package Lesson2.Interfaces;

public class Journal implements Printable {
    String name;

    public Journal(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("This is journal: " + name);
    }
}
