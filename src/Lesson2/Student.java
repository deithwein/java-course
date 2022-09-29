package Lesson2;

public class Student {
    private String firstName, lastName, group;
    private double avgMark;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScholarship() {
        int sum;
        if (avgMark == 5) sum = 100;
        else sum = 80;
        return sum;
    }
}
