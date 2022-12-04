package core.hw4;

public class DriverA<T extends Car> extends Driver {
    public DriverA(String firstName, String middleName, String lastName, int experience) {
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

    public String getMessage(T car) {
        return "водитель " + getFirstName() + " " + getMiddleName() + " " + getLastName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде";
    }
}
