package core.hw4;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> mechanicCar = new Mechanic<Car>("Петр", "Philips");
        Mechanic<Bus> mechanicBus = new Mechanic<Bus>("Дмитрий", "Toyota");
        Mechanic<Truck> mechanicTruck = new Mechanic<Truck>("Сергей", "Lada");

        Sponsor sponsorPhilips = new Sponsor("Илья", 5);
        Sponsor sponsorToyota = new Sponsor("Антон", 1);
        Sponsor sponsorLada = new Sponsor("Федор", 3);


        Car car = new Car("Lada", "Grande", 20, BodyType.SEDAN, mechanicCar);
        car.addSponsor(sponsorLada);
//        car.addSponsor(sponsorPhilips);
//        car.addSponsor(sponsorLada);
//        car.addSponsor(sponsorLada);
//        car.addSponsor(sponsorLada);

//        Bus bus = new Bus("Lada", "Grande", 20, Capacity.LITTLE, mechanicBus);
//        bus.addSponsor(sponsorPhilips);
//        Truck truck = new Truck("Lada", "Grande", 20, LoadType.N2, mechanicTruck);
//        truck.addSponsor(sponsorToyota);
//
        sponsorLada.addTransport(car);
        sponsorLada.addTransport(car);
//        sponsorLada.addTransport(car);
//
//        sponsorLada.addTransport(bus);
//
//
        DriverA driverA = new DriverA("Андрей", "Сергеевич", "Прохоров", 5, car);
//        DriverB driverB = new DriverB("Максим", "Сергеевич", "Шолохов", 3, bus);
//        DriverC driverC = new DriverC("Кирилл", "Иванович", "Цветков", 4, truck);
//
        System.out.println(driverA + "\n");
//        System.out.println(driverB + "\n");
//        System.out.println(driverC + "\n");
//
//        service(car, bus, truck);
//
//        car.printType();
//
//        List<Transport> transports = List.of(car, bus, truck);
//
//        ServiceStation serviceStation = new ServiceStation();
//        serviceStation.addCar(car);
//        serviceStation.addTruck(truck);
//
//        serviceStation.service();
//        serviceStation.service();
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
