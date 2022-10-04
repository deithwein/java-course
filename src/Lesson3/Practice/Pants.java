package Lesson3.Practice;

public class Pants implements ManClothes, WomanClothes{
    @Override
    public void putOnMan() {
        System.out.println("put on a man's pants");
    }

    @Override
    public void putOnWoman() {
        System.out.println("put on a woman's pants");
    }
}
