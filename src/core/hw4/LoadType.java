package core.hw4;

public enum LoadType {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float minLoadType;
    private final Float maxLoadType;

    LoadType(Float minLoadType, Float maxLoadType) {
        this.minLoadType = minLoadType;
        this.maxLoadType = maxLoadType;
    }
}
