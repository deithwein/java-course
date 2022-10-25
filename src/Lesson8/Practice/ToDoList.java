package Lesson8.Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ToDoList {
    //public LinkedHashSet<String> tasks = new LinkedHashSet<>();
    public ArrayList<String> tasks = new ArrayList<>();

    public void list() {
        if (tasks.size() == 0) {
            System.out.println("Задач не найдено");
            return;
        }
        for (int i=0;i<tasks.size();i++) {
            System.out.println(i + " " + tasks.get(i));
        }
    }
    public void add(String text) {
        tasks.add(text);
        System.out.println("Задача добавлена");
    }
    public void add(int index, String text) {
        if (index >= tasks.size()) {
            tasks.add(text);
        } else {
            int size = tasks.size();
            tasks.add("");
            for (int i=size;i>index;i--) {
                tasks.set(i,tasks.get(i-1));
            }
            tasks.set(index,text);
        }
    }
    public void edit(int index, String text) {
        tasks.set(index,text);
    }

    public void delete(int index) {
        String task = tasks.get(index);
        tasks.remove(index);
        System.out.println("Задача \"" + task + "\" удалена.");
    }
}
