public enum  Plane {

    BOEING747(50,200),
    HELLICOPTER(5,12),
    CONCORDE(45,150);

    private final int capacity;
    private final int totalWeight;


    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
    public int getCapacity(){return this.capacity;}
}
