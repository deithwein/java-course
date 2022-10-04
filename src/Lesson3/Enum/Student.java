package Lesson3.Enum;

public enum Student {
    DAN(14),
    MARK(15),
    STEVE(16);

    private int age;

    public int getAge() {
        return age;
    }
    Student(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s;
        System.out.println("Age of Dan: " + Student.DAN.getAge());
    }
}
