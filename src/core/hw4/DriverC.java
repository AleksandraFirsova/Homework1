package core.hw4;

public class DriverC<T extends Truck> extends Driver {
    public DriverC(String firstName, String middleName, String lastName, int experience) {
        super(firstName, middleName, lastName, experience);
    }

    @Override
    public void refuelCar() {
        System.out.println("заправить машину");
    }

    @Override
    public void startMove() {
        System.out.println("начать движение");
    }

    @Override
    public void finishMove() {
        System.out.println("остановиться");
    }

    public String getMessage(T truck) {
        return "водитель " + getFirstName() + " " + getMiddleName() + " " + getLastName() + " управляет автомобилем " + truck.getBrand() + " и будет участвовать в заезде";
    }
}
