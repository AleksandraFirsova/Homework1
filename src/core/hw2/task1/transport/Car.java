package core.hw2.task1.transport;

import core.hw2.task1.Utils;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final String country;
    private final String bodyType;
    private final int seatsNumber;
    float volume;
    String color;
    String transmission;
    String registrationNumber;
    Boolean isSummerRubberType;
    public Car(String brand, String model, String country, String bodyType, int seatsNumber, float volume, String color, String transmission, String registrationNumber, Boolean isSummerRubberType) {
        this.brand = Utils.validateString(brand, "Default");
        this.model = Utils.validateString(model, "Default");
        this.country = Utils.validateString(country, "Russia");
        this.bodyType = Utils.validateString(bodyType, "Default");
        this.seatsNumber = Utils.validateIntNum(seatsNumber, 4);
        this.volume = Utils.validateFloatNum(volume, 15);
        this.color = Utils.validateString(color, "Default");
        this.transmission = Utils.validateString(transmission, "Default");
        this.registrationNumber = Utils.validateString(registrationNumber, "х000хх000");
        this.isSummerRubberType = isSummerRubberType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = Utils.validateFloatNum(volume, 15);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Utils.validateString(color, "Default");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Utils.validateString(transmission, "Default");
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = Utils.validateString(registrationNumber, "х000хх000");
    }

    public Boolean getSummerRubberType() {
        return isSummerRubberType;
    }

    public void setSummerRubberType(Boolean summerRubberType) {
        isSummerRubberType = summerRubberType;
    }

    public void changeRubber() {
        setSummerRubberType(!this.isSummerRubberType);
    }
    public Boolean isValidateRegNumber(String regNumber) {
        if (Pattern.matches("\\D\\d{3}\\D{2}\\d{3}", regNumber)) {
            return true;
        } else {
            System.out.println("Номер некорректный");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Машина: марка = '" + brand + '\'' +
                ", модель = '" + model + '\'' +
                ", страна = '" + country + '\'' +
                ", тип кузова = '" + bodyType + '\'' +
                ", количество мест = " + seatsNumber +
                ", объем = " + volume +
                ", цвет = '" + color + '\'' +
                ", коробка передач = '" + transmission + '\'' +
                ", регистрационный номер = " + registrationNumber +
                ", тип резины - летний = " + isSummerRubberType;
    }
}
