package core.hw4;

public class Bus extends Transport implements Competitors {
    public Bus(String brand, String model, float volume) {
        super(brand, model, volume);
    }

    @Override
    public void startMove() {
        System.out.println("Bus start");
    }

    @Override
    public void finishMove() {
        System.out.println("Bus finish");
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
        return "Bus{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", volume=" + super.getVolume();
    }
}
