package Homeworks.Lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //firstTask();
        //System.out.println(readMap());
        secondTask();
    }
    static Map<?, ?> readMap() {
        Map returnMap = null;

        while (scanner.hasNext()) {
            Object key = readValue();
            Object value = readValue();

            if (key instanceof String && value instanceof String) {                         // str - str
                returnMap = returnMap == null ? new HashMap<String, String>() : returnMap;
            } else if (key instanceof String && value instanceof Integer) {                 // str - int
                returnMap = returnMap == null ? new HashMap<String, Integer>() : returnMap;
            } else if (key instanceof String && value instanceof Double) {                  //str - double
                returnMap = returnMap == null ? new HashMap<String, Double>() : returnMap;
            } else if (key instanceof Double && value instanceof Double) {                  // double - double
                returnMap = returnMap == null ? new HashMap<Double, Double>() : returnMap;
            } else if (key instanceof Double && value instanceof String) {                  // double - str
                returnMap = returnMap == null ? new HashMap<Double, String>() : returnMap;
            } else if (key instanceof Double && value instanceof Integer) {                 // double - int
                returnMap = returnMap == null ? new HashMap<Double, Integer>() : returnMap;
            } else if (key instanceof Integer && value instanceof Integer) {                // int - int
                returnMap = returnMap == null ? new HashMap<Integer, Integer>() : returnMap;
            } else if (key instanceof Integer && value instanceof Double) {                 // int - double
                returnMap = returnMap == null ? new HashMap<Integer, Double>() : returnMap;
            } else {                                                                        // int - str
                returnMap = returnMap == null ? new HashMap<Integer, String>() : returnMap;
            }

            returnMap.put(key, value);
        }

        return returnMap;
    }

    static Object readValue() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            return scanner.next();
        }
    }
    public static void firstTask() {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<Double, String> map2 = new HashMap<>();
        HashMap<String, Double> map3 = new HashMap<>();
        HashMap<Double, Double> map4 = new HashMap<>();
        String line, val1, val2, type;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.equalsIgnoreCase("EXIT")) {
                break;
            }
            val1 = line.split("=")[0];
            val2 = line.split("=")[1];
            type = (isNumeric(val1)?"Double":"String") + "," + (isNumeric(val2)?"Double":"String");
            switch (type) {
                case "String,String":
                    map1.put(val1,val2);
                    break;
                case "Double,String":
                    map2.put(Double.parseDouble(val1),val2);
                    break;
                case "String,Double":
                    map3.put(val1,Double.parseDouble(val2));
                    break;
                case "Double,Double":
                    map4.put(Double.parseDouble(val1),Double.parseDouble(val2));
                    break;
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);
    }
    public static void secondTask() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String line, key;
        Integer val;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.equalsIgnoreCase("EXIT")) {
                break;
            }
            key = line.split("=")[0];
            val = Integer.valueOf(line.split("=")[1]);
            map.put(key,val);
        }
        System.out.println(map);
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
