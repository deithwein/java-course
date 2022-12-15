package Homeworks.Lesson21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programm {
    public static void main(String[] args) {
        System.out.println("✔️task 1 -> " + task1("somethin123"));
        System.out.println("✔️task 2. aaaapgdgdsq -> " + task2("aaaapgdgdsq"));
        System.out.println("✔️task 2. aaaapsfhsfh -> " + task2("aaaapsfhsfh"));
        System.out.println("✔️task 3. AgddHbnfFH_GDsgsg1dsgSdg3 -> " + task3("AgddHbnfFH_GDsgsg1dsgSdg3"));
        System.out.println("✔️task 3. KGHSDG8jm3!!@# -> " + task3("KGHSDG8jm3!!@#"));
        System.out.println("task 4. 2000 -> " + task4(2000));
        System.out.println("✔️task 5. +79064501530 -> " + task5("+79064501530"));
        System.out.println("✔️task 5. +7343158090 -> " + task5("+7343158090"));
        System.out.println("task 6. b+a/4=x*r -> " + task6("b+a/4=x*r"));
        System.out.println("✔️task 7. AbCd -> " + task7("AbCd"));
    }
    //Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
    public static Boolean task1(String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        return p.matcher(s).matches();
    }
    //Write a Java program that matches a string that has a 'p' followed by anything, ending in 'q'.
    //aaaapgdgdsq -> true
    //aaaapsfhsfh -> false
    public static Boolean task2(String s) {
        Pattern p = Pattern.compile(".*p.*q$");
        return p.matcher(s).matches();
    }
//    Write a Java program to match a string that contains only upper and lowercase letters, numbers, and underscores.
//    AgddHbnfFH_GDsgsg1dsgSdg3 -> true
//    KGHSDG8jm3!!@# -> false
    public static Boolean task3(String s) {
        Pattern p = Pattern.compile("[a-zA-Z0-9_]+");
        return p.matcher(s).matches();
    }
    //Write a Java program that takes a number and set thousands separator in that number. 2000 -> 2,000
    public static String task4(Integer n) {
        return "2000";
    }
    //Write a Java program to validate a given phone number.
    //Телефонные номера начинаются с + и имеют 1-3 символа кода страны, затем идет 3 символа кода оператора и
    //7 символов самого номера
    public static Boolean task5(String s) {
        Pattern p = Pattern.compile("^\\+\\d{1,3}\\d{3}\\d{7}$");
        return p.matcher(s).matches();
    }
    //Write a Java program to check if a given string is a Mathematical Expression or not.
    //Строка может содержать в себе буквы и цифры, разделенные символами +, -, *, /
    public static Boolean task6(String s) {
        Pattern p = Pattern.compile("(?:(?:^|[-+_*/=])(?:\\s*-?\\d+(\\.\\d+)?(?:[eE][+-]?\\d+)?\\s*))+$");
        return p.matcher(s).matches();
    }
    //Write a Java program to insert a dash (-) between an upper case letter and a lower case letter in a given string.
    //AbCd -> A-bC-d
    public static String task7(String s) {
        return s.replaceAll("(?<=[A-Z]).*?(?=[a-z])", "-");
    }
}
