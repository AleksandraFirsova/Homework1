package core.hw4;

import core.Utils;

public abstract class Driver {
    private String firstName;
    private String middleName;
    private String lastName;
    private int experience;
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

    public abstract void refuelCar();
    public abstract void startMove();
    public abstract void finishMove();

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
