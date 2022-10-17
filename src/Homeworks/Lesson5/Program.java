package Homeworks.Lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("word", "letter", "another", "something", "boat", "flame", "daze"));
        List<String> fourLetters = new ArrayList<>();
        for (String w : words) {
            if (w.length() == 4) fourLetters.add(w);
        }
        System.out.println("four-letter words: " + fourLetters);

        List<Integer> numbers = new ArrayList<>();
        for (int i=1;i<=10;i++) {
            numbers.add(i);
        }
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) iterator.remove();
        }
        System.out.println("Even numbers: " + numbers);


        List<String> dubs = new ArrayList<>(Arrays.asList("word", "letter", "another", "word", "boat", "letter", "daze"));
        System.out.println("duplicates: " + dubs);
        List<String> noDubs = new ArrayList<>();
        for (String word : dubs) {
            if (!noDubs.contains(word)) noDubs.add(word);
        }
        System.out.println("After removing duplicates: " + noDubs);
        noDubs.removeIf(new Predicate<String>() {
            public boolean test(String s) {
                return s.length() <= 4;
            }
        });
        System.out.println("After removing short words: " + noDubs);
    }
}
