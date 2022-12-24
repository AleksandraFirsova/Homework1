package core.hw4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car extends Transport implements Competitors {
    private Set<Mechanic<Car>> mechanics;
    private BodyType bodyType;

    public Car(String brand, String model, float volume,  BodyType bodyType, Mechanic<Car>... mechanics) {
        super(brand, model, volume);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        this.bodyType = bodyType;
    }
    public Set<Mechanic<Car>> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanic<Car>> mechanics) {
        this.mechanics = mechanics;
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
        System.out.println("Начало движения легковой машины");
    }

    @Override
    public void finishMove() {
        System.out.println("Конец движения легковой машины");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для легковой машины");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время для легковой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для легковой машины");
    }

    @Override
    public void repair() {
        System.out.println("Легковая машина " + getBrand() + " " + getModel() + " починена");
    }

    @Override
    public Boolean service() {
        return Math.random() > 0.7;
    }

    @Override
    public Set<?> mechanics() {
        return getMechanics();
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(mechanics, car.mechanics) && bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanics, bodyType);
    }
}
