package Lesson4;

public class Task {
    public static void main(String[] args) {
        Size pizzaSizes[] = Size.values();
        for(Size a : pizzaSizes) {
            System.out.println(a);
        }
        orderPizza(Size.LARGE);
    }
    public static void orderPizza(Size s) {
        String size = "";
        switch (s) {
            case SMALL -> size = "маленькую";
            case MEDIUM -> size = "среднюю";
            case LARGE -> size = "большую";
            case EXTRALARGE -> size = "очень большую";
        }
        System.out.println("Вы заказали " + size + " пиццу");
    }
}
