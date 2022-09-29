package Lesson2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Anton", "Khudiakov", "35e"));
        students.add(new Aspirant("Ben", "Stiller", "44F", "TEST WORK"));
        students.add(new Aspirant("Antony", "Hopkins", "44F", "MY WORK"));
        students.get(0).setAvgMark(5);
        students.get(1).setAvgMark(3.5);
        students.get(2).setAvgMark(5);
        for (Student st : students) {
            System.out.println("Name: " + st.getFirstName() + " " + st.getLastName() + ". Scholarship = " + st.getScholarship());
        }
    }
}
