package core.hw4;

public class Main {
    public static void main(String[] args) {

        Car firstCar = new Car("Lada", "Grande", 20, BodyType.SEDAN);
        Car secondCar = new Car("Toyota", "Prada", 50, BodyType.HATCHBACK);
        Car thirdCar = new Car("Mercedes", "Benz", 60, BodyType.COUPE);
        Car fourthCar = new Car("Volkswagen", "AG", 70, BodyType.CROSSOVER);

        Bus firstBus = new Bus("Lada", "Grande", 20, Capacity.LITTLE);
        Bus secondBus = new Bus("Toyota", "Prada", 50, Capacity.BIG);
        Bus thirdBus = new Bus("Mercedes", "Benz", 60, Capacity.MIDDLE);
        Bus fourthBus = new Bus("Volkswagen", "AG", 70, Capacity.VERY_BIG);

        Truck firstTruck = new Truck("Lada", "Grande", 20, LoadType.N2);
        Truck secondTruck = new Truck("Toyota", "Prada", 50, LoadType.N3);
        Truck thirdTruck = new Truck("Mercedes", "Benz", 60, LoadType.N1);
        Truck fourthTruck = new Truck("Volkswagen", "AG", 70, LoadType.N2);

        service(firstCar, secondCar, thirdCar, fourthCar);

        DriverA driverA = new DriverA("Ivan", "Ivanovich", "Ivanov", 5, firstCar);
        System.out.println(driverA);
        firstCar.printType();
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
}
