package core.hw3.task1_2;

import core.hw3.Utils;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;

public class Car extends Transport {
    private final int seatsNumber;
    private float volume;
    private String transmission;
    private String registrationNumber;
    private Boolean isSummerRubberType;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, int seatsNumber, float volume, String transmission, String registrationNumber, Boolean isSummerRubberType, Key key, Insurance insurance, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        this.seatsNumber = Utils.validateIntNum(seatsNumber, 4);
        this.volume = Utils.validateFloatNum(volume, 15);
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

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = Utils.validateFloatNum(volume, 15);
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
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", country='" + super.getCountry() + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", volume=" + volume +
                ", color='" + super.getColor() + '\'' +
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

    @Override
    public String refill(Fuel fuel) {
        if (fuel.equals(Fuel.DIESEL) || fuel.equals(Fuel.PETROL) || fuel.equals(Fuel.ELECTRICITY)) {
            super.setFuelPercentage(65.3);
            return fuel.name;
        } else {
            return "Данный вид топлива не доступен";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seatsNumber == car.seatsNumber && Float.compare(car.volume, volume) == 0 && Objects.equals(transmission, car.transmission) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(isSummerRubberType, car.isSummerRubberType) && Objects.equals(key, car.key) && Objects.equals(insurance, car.insurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatsNumber, volume, transmission, registrationNumber, isSummerRubberType, key, insurance);
    }
}
