package Lesson3.Enum;

public enum Colors {
    BLACK, RED, GREEN, YELLOW, PINK;

    public static void main(String[] args) {
        Colors c;
        Colors cAr[] = Colors.values();
        for(Colors a : cAr) {
            System.out.println(a);
        }
        c = Colors.valueOf("RED");
        System.out.println("I like " + c);
        System.out.println(Colors.RED.name());
        System.out.println(Colors.RED.ordinal());
    }
}
