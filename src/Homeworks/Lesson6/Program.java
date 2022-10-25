package Homeworks.Lesson6;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static LinkedList<String> colors = new LinkedList<>();
    public static void main(String[] args) {
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("White");
        System.out.println(colors);
        System.out.println("Введите номер элемента для удаления (начиная с нуля)");
        Scanner sc = new Scanner(System.in);
        colors.remove(java.lang.Integer.parseInt(sc.nextLine()));
        System.out.println(colors);
        System.out.println("Поменяем местами первый и третий элементы");
        swap(1,3);
        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("Red");
        colors2.add("Beige");
        colors2.add("Green");
        colors2.add("Crimson");
        System.out.println("Объеденим этот список с списком: " + colors2);
        colors.addAll(colors2);
        System.out.println(colors);
    }

    public static void swap(int x, int y) {
        if (x > colors.size() || y > colors.size()) {
            System.out.println("Один из указанных индексов отсутствует в списке");
            return;
        }
        String node1 = colors.get(x);
        String node2 = colors.get(y);
        colors.set(x, node2);
        colors.set(y, node1);
        System.out.println(colors);
    }
}
