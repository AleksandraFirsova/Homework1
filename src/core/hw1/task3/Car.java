package core.hw1.task3;

public class Car {
    private String brand;
    private String model;
    private float volume;
    private String color;
    private int yearProduction;
    private String country;

    public Car(String brand, String model, float volume, String color, int yearProduction, String country) {
        this.brand = brand;
        this.model = model;
        this.volume = volume;
        this.color = color;
        this.yearProduction = yearProduction;
        this.country = country;
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
