package Lesson3.Practice;

public class Shirt implements ManClothes, WomanClothes{

    @Override
    public void putOnMan() {
        System.out.println("put on a man's shirt");
    }

    @Override
    public void putOnWoman() {
        System.out.println("put on a woman's shirt");
    }
}
