package Homeworks.Lesson1;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Program {
    public static void main(String[] args) {
        Scanner params = new Scanner(System.in);
        System.out.println("Введите длину: ");
        double length = parseDouble(params.nextLine());
        System.out.println("Введите ширину: ");
        double width = parseDouble(params.nextLine());
        Rectangle r = new Rectangle(length, width);
        r.displayProperties();
    }
}
