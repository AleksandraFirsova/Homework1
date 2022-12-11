package core.hw4;

public class Bus extends Transport implements Competitors {
    private Capacity capacity;

    public Bus(String brand, String model, float volume, Capacity capacity) {
        super(brand, model, volume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printType() {

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
