package Lesson2;

public class Aspirant extends Student {
    String scienceWorkName;

    public Aspirant(String firstName, String lastName, String group, String scienceWorkName) {
        super(firstName, lastName, group);
        this.scienceWorkName = scienceWorkName;
    }
    @Override
    public int getScholarship() {
        int sum;
        if (getAvgMark() == 5) sum = 200;
        else sum = 180;
        return sum;
    }
}
