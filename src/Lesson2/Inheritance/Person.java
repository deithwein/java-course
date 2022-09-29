package Lesson2.Inheritance;

public class Person {
    //Создать класс Person с одним параметром name
    //Создать конструктор для Person
    //Создать метод display для вывода имени сотрудника
    //Пример:
    //"Name" + name
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Name " + name);
    }
}

