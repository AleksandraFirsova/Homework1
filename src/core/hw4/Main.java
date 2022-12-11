package core.hw4;

public class Main {
    public static void main(String[] args) {

        Car fistCar = new Car("Lada", "Grande", 20);
        Car secondCar = new Car("Toyota", "Prada", 50);
        Car thirdCar = new Car("Mercedes", "Benz", 60);
        Car fourthCar = new Car("Volkswagen", "AG", 70);

        Bus firstBus = new Bus("Lada", "Grande", 20);
        Bus secondBus = new Bus("Toyota", "Prada", 50);
        Bus thirdBus = new Bus("Mercedes", "Benz", 60);
        Bus fourthBus = new Bus("Volkswagen", "AG", 70);

        Truck firstTruck = new Truck("Lada", "Grande", 20);
        Truck secondTruck = new Truck("Toyota", "Prada", 50);
        Truck thirdTruck = new Truck("Mercedes", "Benz", 60);
        Truck fourthTruck = new Truck("Volkswagen", "AG", 70);

        DriverA driverA = new DriverA("Ivan", "Ivanovich", "Ivanov", 5, fistCar);
        System.out.println(driverA);
    }
}
