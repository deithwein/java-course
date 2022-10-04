package Lesson3.Practice;

public enum ClothSize {
    XXS(32){
        @Override
        public void getDescription() {
            System.out.println("Детский размер");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    ClothSize(int euroSize) {
        this.euroSize = euroSize;
    }
    public void getDescription() {
        System.out.println("Взрослый размер");
    }
}
