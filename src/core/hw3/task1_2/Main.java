package core.hw3.task1_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car.Key key = new Car.Key("123", "456");
        Car.Insurance insurance = new Car.Insurance(LocalDate.of(2020, 11, 12), 12.00, "456783456");

        Car fistCar = new Car("Lada", "Grande", 2001, "Russia", "red", 200, 4, 15.0f, null, null, true, key, insurance, 14.4);
        fistCar.setSummerRubberType(true);
        fistCar.changeRubber();
        fistCar.isValidateRegNumber(fistCar.getRegistrationNumber());
        fistCar.isValidateNumber(String.valueOf(insurance.getNumberOfInsurance()));
        System.out.println(fistCar);
        fistCar.isValidateDurationOfInsurance(insurance.getDurationOfInsurance());

        Train firstTrain = new Train(null, "B-901", 2011, "Russia", null, 301, 3500, 0, "Lastochka", "Минск-Пассажирский", 11, 16);
        Train secondTrain = new Train(null, "D-125", 2019, "Russia", null, 270, 1700, 0, "Leningrad", "Ленинград-Пассажирский", 8, 34.6);
        System.out.println(firstTrain + "\n" + secondTrain);


        Bus firstBus = new Bus(null, "B-901", 2011, "Russia", null, 301, 3500, "Минск-Пассажирский", 11, 78);
        Bus secondBus = new Bus(null, "D-125", 2019, "Russia", null, 270, 1700, "Ленинград-Пассажирский", 8, 99);
        Bus thirdBus = new Bus(null, "C-155", 1998, "the USA", "green", 126, 55, "Arizona", 15, 100);

        System.out.println(firstBus + "\n" + secondBus + "\n" + thirdBus);

        System.out.println("Вид топлива: " + fistCar.refill(Fuel.PETROL));
        System.out.println("Вид топлива: " + firstTrain.refill(Fuel.DIESEL));
        System.out.println("Вид топлива: " + firstBus.refill(Fuel.ELECTRICITY));
    }
}
