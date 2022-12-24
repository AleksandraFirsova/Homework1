package core.hw4;

import core.Utils;

public abstract class Driver<T extends Transport> {
    private String firstName;
    private String middleName;
    private String lastName;
    private int experience;
    private T Car;

    public Driver(String firstName, String middleName, String lastName, int experience, T car) {
        this.firstName = Utils.validateString(firstName, "default");
        this.middleName = Utils.validateString(middleName, "default");
        this.lastName = Utils.validateString(lastName, "default");
        this.experience = Utils.validateIntNum(experience, 0);
        setCar(car);
    }

    public Driver(String firstName, String middleName, String lastName, int experience) {
        this.firstName = Utils.validateString(firstName, "default");
        this.middleName = Utils.validateString(middleName, "default");
        this.lastName = Utils.validateString(lastName, "default");
        this.experience = Utils.validateIntNum(experience, 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getExperience() {
        return experience;
    }


    public void setExperience(int experience) {
        this.experience = Utils.validateIntNum(experience, 0);
    }

    public T getCar() {
        return Car;
    }

    public void setCar(T car) {
        if (car == null) {
            throw new IllegalArgumentException("Необходимо указать категорию");
        }
        Car = car;
    }

    public void refuelCar() {
        System.out.println("заправить машину");
    }

    public void startMove() {
        System.out.println("начать движение");
    }

    public void finishMove() {
        System.out.println("остановиться");
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getMiddleName() + " " + getCar() + " " + getLastName() + " управляет автомобилем и будет участвовать в заезде";
    }
}
