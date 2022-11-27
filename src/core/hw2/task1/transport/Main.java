package core.hw2.task1.transport;

import java.text.ParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ParseException {
        Car.Key key = new Car.Key("123", "456");
        Car.Insurance insurance = new Car.Insurance(LocalDate.of(2020,11, 12), 12.00, "456783456");

        Car fistCar = new Car("Lada", "Grande", "Россия", null, 3, 15, "желтый", null, "х000хх000", false, key, insurance);
        fistCar.setSummerRubberType(true);
        fistCar.changeRubber();
        fistCar.isValidateRegNumber(fistCar.getRegistrationNumber());
        fistCar.isValidateNumber(String.valueOf(insurance.getNumberOfInsurance()));
        System.out.println(fistCar);
        fistCar.isValidateDurationOfInsurance(insurance.getDurationOfInsurance());
    }
}
