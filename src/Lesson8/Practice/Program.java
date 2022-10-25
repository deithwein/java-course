package Lesson8.Practice;

import java.util.Scanner;

public class Program {
    public static String cmd = "x";
    public static ToDoList tdl = new ToDoList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (!cmd.equals("EXIT")) {
            getCommand(sc);
            execCommand(cmd);
        }
        System.out.println("Завершение...");
    }
    public static void getCommand(Scanner sc) {
        System.out.println("Введите команду");
        cmd = sc.nextLine();
    }

    public static void execCommand(String cmd) {
        if (cmd.isEmpty()) return;
        String[] blocks = cmd.split(" ");
        String command = blocks[0];
        int index;
        String text;
        switch (command) {
            case "HELP":
                showHelp();
                break;
            case "LIST":
                tdl.list();
                break;
            case "ADD":
                try {
                    index = Integer.parseInt(blocks[1]);
                    text = cmd.substring(ordinalIndexOf(cmd," ", 2));
                    tdl.add(index, text);
                } catch (Exception e) {
                    text = cmd.substring(ordinalIndexOf(cmd," ", 1));
                    tdl.add(text);
                }
                break;
            case "EDIT":
                index = Integer.parseInt(blocks[1]);
                text = cmd.substring(ordinalIndexOf(cmd," ", 2));
                tdl.edit(index, text);
                break;
            case "DELETE":
                index = Integer.parseInt(blocks[1]);
                tdl.delete(index);
                break;
        }
    }

    public static void showHelp() {
        System.out.println("Доступные команды:");
        System.out.println("HELP: вывести доступные команды");
        System.out.println("LIST: вывести текущие задачи");
        System.out.println("ADD: добавить задачу");
        System.out.println("EDIT: редактировать задачу");
        System.out.println("DELETE: редактировать задачу");
    }

    public static int ordinalIndexOf(String str, String chr, int n) {
        int pos = str.indexOf(chr);
        while (--n > 0 && pos != -1) {
            pos = str.indexOf(chr, pos + 1);
        }
        return pos;
    }
}
