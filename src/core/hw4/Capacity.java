package core.hw4;

public enum Capacity {
    VERY_LITTLE(null, 10),
    LITTLE(null, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    VERY_BIG(100, 120);

    private final Integer minCapacity;
    private final Integer maxCapacity;

    Capacity(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "minCapacity=" + minCapacity +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
