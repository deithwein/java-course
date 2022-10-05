package Homeworks.Lesson2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Program {
    public static void main(String[] args) {
        Category kitchen = new Category("kitchen");
        Category car = new Category("car");
        Category laptops = new Category("laptops");

        kitchen.addProduct(new Product("sink", 500));
        kitchen.addProduct(new Product("table", 239.99));

        car.setProducts(Arrays.asList(new Product("wipes", 15.99), new Product("accumulator", 118.19)));

        laptops.addProduct(new Product("USB drive", 15));
        laptops.addProduct(new Product("USB lamp", 21.45));

        User customer = new User("user", "pass");
        Basket cb = new Basket();
        cb.setBoughtProducts(Arrays.asList(kitchen.getProducts().get(0), car.getProducts().get(1)));
        customer.setBasket(cb);

        System.out.println("Доступные товары: ");
        for (Product p : kitchen.getProducts()){
            System.out.println(p.getName());
        }
        for (Product p : car.getProducts()){
            System.out.println(p.getName());
        }
        for (Product p : laptops.getProducts()){
            System.out.println(p.getName());
        }

        System.out.println("Покупатель взял следующие вещи: ");
        for (Product p : customer.getBasket().getBoughtProducts()){
            System.out.println(p.getName());
        }

        System.out.println("____________________________________");
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
