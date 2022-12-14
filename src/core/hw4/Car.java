package core.hw4;

public class Car extends Transport implements Competitors {
    private BodyType bodyType;

    public Car(String brand, String model, float volume, BodyType bodyType) {
        super(brand, model, volume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public Boolean passDiagnostics() {
        return Math.random() > 0.5;
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
        return "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", volume=" + super.getVolume();
    }
}
