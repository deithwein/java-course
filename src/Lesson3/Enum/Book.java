package Lesson3.Enum;

public class Book {
    String name;
    Type bookType;
    String author;

    public Book(String name, Type bookType, String author) {
        this.name = name;
        this.bookType = bookType;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Type getBookType() {
        return bookType;
    }
}
