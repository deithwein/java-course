package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        for (int i=1;i<=5;i++) {
            numbers.add(String.valueOf(i));
        }
        numbers.add(3,"INSERTED ELEMENT");
        System.out.println(numbers);
        String toFind = "3";//3//NEW ELEMENT
        System.out.println("Is "+toFind+ " in the List?");
        if (numbers.contains(toFind)) {
            System.out.println("Index of "+toFind+" is " + numbers.indexOf(toFind));
        }
        else {
            System.out.println("No such element in the List");
        }
        System.out.println("Deleting item by 1 index");
        numbers.remove(1);
        System.out.println(numbers);
    }
}
