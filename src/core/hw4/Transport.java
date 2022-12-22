package core.hw4;

import core.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private float volume;
    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

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

    public void addDriver(Driver<?> ... driver) {
        drivers.addAll(Arrays.asList(driver));
    }

    public void addMechanic(Mechanic<?> ... mechanic) {
        mechanics.addAll(Arrays.asList(mechanic));
    }

    public void addSponsor(Sponsor ... sponsor) {
        sponsors.addAll(Arrays.asList(sponsor));
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                '}';
    }

    public abstract void repair();

    public abstract Boolean service();
}
