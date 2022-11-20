package core.hw1.task3;

public class Car {
    private String brand;
    private String model;
    private float volume;
    private String color;
    private int yearProduction;
    private String country;

    public Car(String brand, String model, float volume, String color, int yearProduction, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (volume == 0) {
            this.volume = 1.5F;
        } else {
            this.volume = volume;
        }
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (yearProduction == 0) {
            this.yearProduction = 2000;
        } else {
            this.yearProduction = yearProduction;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }
    public int getYearProduction() {
        return yearProduction;
    }
    public String getCountry() {
        return country;
    }
}
