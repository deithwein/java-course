package Lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> origLetters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(letters);
        letters.add("E");
        letters.add("H");
        System.out.println(letters);
        letters.add(5,"F");
        letters.add(6,"G");
        System.out.println(letters);
        System.out.println("Letters list contains E ?" + letters.contains("E"));
        System.out.println("Letters list contains Z ?" + letters.contains("Z"));
        System.out.println("Letter at 5th place: " + letters.get(5));
        List<String> tempList = new ArrayList<>();
        System.out.println("tempList is empty ?" + tempList.isEmpty());
        System.out.println("First index of D = " + letters.indexOf("D"));
        System.out.println("Last index of D = " + letters.lastIndexOf("D"));
        System.out.println(letters);
        letters.remove("D");
        System.out.println("After removing 'D' letters contains" + letters);
        boolean isRemoved = letters.remove("D");
        System.out.println("H removed? "+ isRemoved + ". Letters contains " + letters);
        letters.removeAll(origLetters);
        letters.remove(letters.size()-1);
        System.out.println("List contains " + letters);
        letters = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        System.out.println(letters);
        tempList.add("A");
        tempList.add("B");
        tempList.add("C");
        letters.retainAll(tempList);
        System.out.println("letters elements after retainAll operation: " + letters);
        System.out.println("letters ArrayList size = " + letters.size());
        letters.set(2, "D");
        System.out.println(letters);

        /* Вывод
        [A, B, C, D]
        [A, B, C, D, E, H]
        [A, B, C, D, E, F, G, H]
        Letters list contains E ?true
        Letters list contains Z ?false
        Letter at 5th place: F
        tempList is empty ?true
        First index of D = 3
        Last index of D = 3
        [A, B, C, D, E, F, G, H]
        After removing 'D' letters contains[A, B, C, E, F, G, H]
        H removed? false. Letters contains [A, B, C, E, F, G, H]
        List contains [E, F, G]
        [A, B, C, E]
        letters elements after retainAll operation: [A, B, C]
        letters ArrayList size = 3
        [A, B, D]
        */

    }


}
