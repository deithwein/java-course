package Homeworks.Lesson2;

import Homeworks.Lesson1.Rectangle;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Program {
    public static void main(String[] args) {
        Scanner params = new Scanner(System.in);
        System.out.println("Введите длину: ");
        double length = parseDouble(params.nextLine());
        System.out.println("Введите ширину: ");
        double width = parseDouble(params.nextLine());
        //Rectangle r1 = new Rectangle(4, 5);
        //Rectangle r2 = new Rectangle(5, 8);
        //r1.displayProperties();
        //r2.displayProperties();
        Rectangle r = new Rectangle(length, width);
        r.displayProperties();
    }
}
