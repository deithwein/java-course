package Homeworks.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите любое предложение.");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.isEmpty()) {
            System.out.println("Введеная строка пуста. Завершение программы...");
            return;
        }
        int count = 0;
        char[] letters = line.toCharArray();
        for (char c : letters) {
            if (c==' ') count += 1;
        }
        count +=1; //так как пробелов на 1 меньше чем слов
        System.out.println("Предложение состоит из " + count + " слов");

        int[] numbers = new int[]{5,10,15,20,25};
        int sum = 0;
        for (int number : numbers) {
            sum+= number;
        }
        System.out.print("Среднеарифметическое массива " + Arrays.toString(numbers) + " = ");
        System.out.println(sum/numbers.length);
    }
}
