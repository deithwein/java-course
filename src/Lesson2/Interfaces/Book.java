package Lesson2.Interfaces;

public class Book implements Printable, Searchable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Name: " + name + ". Author: " + author);
    }

    @Override
    public void search() {
        System.out.println("Searching through this book...");
    }
}
