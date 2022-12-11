package core.hw4;

public class Truck extends Transport implements Competitors{

    public Truck(String brand, String model, float volume) {
        super(brand, model, volume);
    }

    @Override
    public void startMove() {
        System.out.println("Car start");
    }

    @Override
    public void finishMove() {
        System.out.println("Car finish");
    }

    @Override
    public void pitStop() {
        System.out.println("Pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Best time");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", volume=" + super.getVolume();
    }
}