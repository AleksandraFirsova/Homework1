package core.hw4;

import core.Utils;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private float volume;
    private HashMap<String,Sponsor> sponsors;

    public Transport(String brand, String model, float volume) {
        this.brand = Utils.validateString(brand, "Default");
        this.model = Utils.validateString(model, "Default");
        this.volume = Utils.validateFloatNum(volume, 0);
        this.sponsors = new HashMap<>();
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

    public void addSponsor(Sponsor... sponsors) {
        for (Sponsor sponsor: sponsors) {
            this.sponsors.put(sponsor.toString(), sponsor);
        }
    }

    public abstract void repair();

    public abstract Boolean service();

    public abstract Set<?> mechanics();

    public String mechanicInfo() {
        List<?> mechanics = new ArrayList<>(mechanics());
        StringBuilder result = new StringBuilder();
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.brand).append(" ").append(this.model).append(" ");

        if (!sponsors.values().isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (Sponsor sponsor: sponsors.values() ) {
            result.append(sponsor.toString()).append(", ");
        }
        return String.valueOf(result.append("\n").append(mechanicInfo().toString()));
    }
}
