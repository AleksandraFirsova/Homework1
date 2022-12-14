package core.hw4;

import core.Utils;

public abstract class Transport {
    private String brand;
    private String model;
    private float volume;

    public Transport(String brand, String model, float volume) {
        this.brand = Utils.validateString(brand, "Default");
        this.model = Utils.validateString(model, "Default");
        this.volume = Utils.validateFloatNum(volume, 0);
    }

    public abstract void printType();

    public abstract Boolean passDiagnostics();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = Utils.validateString(brand, "Default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = Utils.validateString(model, "Default");
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = Utils.validateFloatNum(volume, 0);
    }

    public abstract void startMove();

    public abstract void finishMove();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }
}
