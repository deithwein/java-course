package Lesson3.Practice;

public enum Season {
    WINTER(-12.5),
    SPRING(7.8),
    SUMMER(20) {
        @Override
        public void getDescription() {
            System.out.println("Hot season");
        }
    },
    AUTUMN(14.2);

    private double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void getDescription() {
        System.out.println("Cold season");
    }
}
