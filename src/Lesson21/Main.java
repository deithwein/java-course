package Lesson21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "www.telran.de";
        String s1 = "https://www.google.com";

        Pattern p = Pattern.compile("((http://)|(https://))?www\\.[a-z0-9]+\\.[a-z]{2,3}");

        System.out.println(p.matcher(s).matches());         // true
        System.out.println(p.matcher(s1).matches());        // true

        String st1 = "telran.de";
        String st2 = "My telephone number is +10000000000";

        writePositionsString(st1);
        writePositionsString(st2);

    }

    static void writePositionsString(String s) {
        Pattern p = Pattern.compile("tel");
        Matcher m = p.matcher(s);
        int start, end;
        if (m.find()) {
            start = m.start();
            end = m.end();
        }
        else {
            start = -1;
            end = -1;
        }
        //Вычислить start и end для первой и второй строк
        System.out.println("For the string " + s + " pattern found at positions from " + start + " to " + end);
    }

    public static String test2() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw new RuntimeException();
        } finally {
            System.out.println("log record");
        }
    }
    public static String test() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            return "exception";
        } finally {
            System.out.println("log record");
        }
    }
}
