package Lesson21;

public class Main {
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println("----------");
        System.out.println(test2());
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
