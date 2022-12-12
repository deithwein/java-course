package Lesson21;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(test());
        System.out.println("----------");
        System.out.println(test2());
    }

    public static String test2() throws IOException {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw new IOException();
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