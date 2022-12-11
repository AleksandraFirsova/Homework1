package core.hw3.task1_2;

import core.Utils;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        this.brand = Utils.validateString(brand, "Default");
        this.model = Utils.validateString(model, "Default");
        this.year = Utils.validateIntNum(year, 2000);
        this.country = Utils.validateString(country, "Default");
        this.color = Utils.validateString(color, "Default");
        this.maxSpeed = Utils.validateIntNum(maxSpeed, 200);
        this.fuelPercentage = Utils.validateDoubleNum(fuelPercentage, 0);
    }

    public abstract String refill(Fuel fuel);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    protected void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0.00 || fuelPercentage > 100.00) {
            System.out.println("Значение может быть в пределах от 0.00 до 100.00");
        } else {
            System.out.println(Utils.validateDoubleNum(this.fuelPercentage,0) + "%");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && Double.compare(transport.fuelPercentage, fuelPercentage) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }
}
