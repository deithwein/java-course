package Homeworks.Lesson2;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Program {
    public static void main(String[] args) {
        MathFunctions func = new MathFunctions();
        Scanner params = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num = parseDouble(params.nextLine());
        System.out.println("Введите степень: ");
        int pow = (Integer.parseInt(params.nextLine()));

        System.out.println("Число в степени: " + func.Power(num,pow));
        System.out.println("Модуль комплексного числа z=-5+15i равно " + func.AbsComplex(-5,15));
        System.out.println("Длина окружности с радиусом 5.15 равно " + func.CirclePerimeter(5.15));
    }
}
