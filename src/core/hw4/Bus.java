package core.hw4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bus extends Transport implements Competitors {
    private Set<Mechanic<Bus>> mechanics;
    private Capacity capacity;

    public Bus(String brand, String model, float volume,  Capacity capacity, Mechanic<Bus>... mechanics) {
        super(brand, model, volume);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        this.capacity = capacity;
    }
    public Set<Mechanic<Bus>> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanic<Bus>> mechanics) {
        this.mechanics = mechanics;
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
    public Boolean passDiagnostics() {
        System.out.println("Автобусу " + getBrand() + getModel() + " диагностика не требуется");
        return true;
    }

    @Override
    public void startMove() {
        System.out.println("Начало движения автобуса");
    }

    @Override
    public void finishMove() {
        System.out.println("Конец движения автобуса");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автобуса");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время для автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для автобуса");
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен");
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
        return "Автобус "+ super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(mechanics, bus.mechanics) && capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanics, capacity);
    }
}
