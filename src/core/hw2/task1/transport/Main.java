package core.hw2.task1.transport;

public class Main {
    public static void main(String[] args) {
        Car fistCar = new Car("Lada", "Grande", "Россия", null, 3, 15, "желтый", null, "х000хх000", false);
        fistCar.changeRubber();
        fistCar.isValidateRegNumber(fistCar.getRegistrationNumber());
        System.out.println(fistCar);
    }
}
