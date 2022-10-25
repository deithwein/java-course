package Homeworks.Lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        for (int i=0;i<Math.pow(10,8);i++) {
            data.add((int)Math.round(Math.random()*1024));
        }
        System.out.println("Кол-во элементов:" + data.size());
        measureTime(()-> { func1(data); });
        measureTime(()-> { func2(data); });
        measureTime(()-> { func3(data); });
        measureTime(()-> { func4(data); });
        measureTime(()-> { func5(data); });
        measureTime(()-> { func6(data); });
        measureTime(()-> { func7(data); });

    }
    public static void func1(List<Integer> data) {
        System.out.println("внутри тела кладем i-тый элемент в переменную temp");
        for (int i=0;i<data.size();i++) {
            int temp = data.get(i);
        }
    }
    public static void func2(List<Integer> data) {
        System.out.println("перебрать for-each loop");
        for(int d : data){
            int temp = d;
        }
    }
    public static void func3(List<Integer> data) {
        System.out.println("classic for и вызываем list.size() для каждой итерации");
        for (int i=0;i<data.size();i++) {
            data.size();
        }
    }
    public static void func4(List<Integer> data) {
        System.out.println("classic for, но list.size() определяем в переменную");
        for (int i=0;i<data.size();i++) {
            int temp = data.size();
        }
    }
    public static void func5(List<Integer> data) {
        System.out.println("classic for, list.size() определяем в переменную, перебираем с конца (i--)");
        for (int i=data.size(); i >= 0; i--) {
            int temp = data.size();
        }
    }
    public static void func6(List<Integer> data) {
        System.out.println("Используя Iterator");
        Iterator<Integer> it = data.iterator();
        while (it.hasNext()) {
            int cur = it.next();
        }
    }
    public static void func7(List<Integer> data) {
        System.out.println("Используя ListIterator");
        ListIterator<Integer> it = data.listIterator();
        while (it.hasNext()) {
            int cur = it.next();
        }
    }
    public static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long result = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + result + "ms");
    }
}
