package Lesson2.Inheritance;

public class Employee extends Person {
    String company;

    public Employee(String name, int age, String company) {
        super(name,age);
        this.company = company;
    }
    @Override
    public void display() {
        super.display();
        System.out.printf("Company: %s", company);
    }
}
