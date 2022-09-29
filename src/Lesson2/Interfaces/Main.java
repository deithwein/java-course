package Lesson2.Interfaces;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", "Author1");
        b1.print();

        Journal j = new Journal("Top Gear");
        j.print();
    }
}
