package Lesson3.Practice;

import Lesson3.Enum.Colors;

public class Program {
    public static void main(String[] args) {
        Season fav = Season.AUTUMN;
        System.out.println("Favourite season: " + descrSeason(fav) + " (" + fav.ordinal() + ")");
        System.out.println("Average temp is " + fav.getAvgTemp());

        Season seasons[] = Season.values();
        for(Season s : seasons) {
            System.out.println(s.name() + " / " + s.getAvgTemp());
            s.getDescription();
        }
    }
    public static String descrSeason(Season s) {
        String res = "";
        switch (s) {
            case WINTER -> res = "Это зима";
            case SPRING -> res = "это весна";
            case SUMMER -> res = "это лето";
            case AUTUMN -> res = "это осень";
        }
        return res;
    }
}
