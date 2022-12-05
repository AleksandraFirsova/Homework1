package core.hw2.task1.transport;

import core.hw2.task1.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final String country;
    private final String bodyType;
    private final int seatsNumber;
    private float volume;
    private String color;
    private String transmission;
    private String registrationNumber;
    private Boolean isSummerRubberType;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, String country, String bodyType, int seatsNumber, float volume, String color, String transmission, String registrationNumber, Boolean isSummerRubberType, Key key, Insurance insurance) {
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
        this.key = key;
        this.insurance = insurance;
    }

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = Utils.validateString(remoteEngineStart, "Default");
            this.keylessAccess = Utils.validateString(keylessAccess, "Default");
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private LocalDate durationOfInsurance;
        private Double costOfInsurance;
        private String numberOfInsurance;

        public Insurance(LocalDate durationOfInsurance, Double costOfInsurance, String numberOfInsurance) {
            this.durationOfInsurance = durationOfInsurance;
            this.costOfInsurance = Utils.validateDoubleNum(costOfInsurance, 100);
            this.numberOfInsurance = Utils.validateString(numberOfInsurance, "123123");
        }

        public LocalDate getDurationOfInsurance() {
            return durationOfInsurance;
        }

        public Double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }
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

    public Boolean isValidateNumber(String number) {
        if (Pattern.matches("\\d{9}", number)) {
            return true;
        } else {
            System.out.println("Номер некорректный");
            return false;
        }
    }
    public void isValidateDurationOfInsurance(LocalDate durationOfInsurance) {
        if (LocalDate.now().isAfter(durationOfInsurance)) {
            System.out.println("Страховка просрочена");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", volume=" + volume +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", isSummerRubberType=" + isSummerRubberType +
                ", key=" + key.keylessAccess +
                ", key=" + key.remoteEngineStart +
                ", insurance=" + insurance.durationOfInsurance +
                ", insurance=" + insurance.costOfInsurance +
                ", insurance=" + insurance.numberOfInsurance +
                '}';
    }
}
