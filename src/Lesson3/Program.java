package Lesson3;

import Lesson3.Enum.Book;
import Lesson3.Enum.Student;
import Lesson3.Enum.Directions;
import Lesson3.Enum.Type;
import Lesson3.Polymorphism.Circle;
import Lesson3.Polymorphism.Forms;
import Lesson3.Polymorphism.Triangle;

import static Lesson3.Enum.Type.FANTASY;

public class Program {
    public static void main(String[] args) {
        Forms forms = new Forms();
        Triangle tr = new Triangle();
        Circle c = new Circle();

        forms.shapeArea();
        tr.shapeArea();
        c.shapeArea();

        Student s = Student.MARK;
        Student s1 = Student.valueOf("DAN");
        System.out.println(s.getAge());
        System.out.println(s1.getAge());

        Book b = new Book("LOTR", FANTASY, "Tolkien");
        switch (b.getBookType()) {
            case FANTASY -> System.out.println("это фэнтэзи");
            case SCIENCE -> System.out.println("это наука");
            case SCIENCE_FICTION -> System.out.println("это научная фантастика");
        }
        System.out.println("Book called " + b.getName() + " is " + b.getBookType());
    }
}