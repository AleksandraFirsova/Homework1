package core.hw4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Truck extends Transport implements Competitors {
    private Set<Mechanic<Truck>> mechanics;
    private LoadType loadType;

    public Truck(String brand, String model, float volume, LoadType loadType, Mechanic<Truck>... mechanics) {
        super(brand, model, volume);
        this.mechanics = new HashSet<>(Arrays.asList(mechanics));
        this.loadType = loadType;
    }

    public Set<Mechanic<Truck>> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanic<Truck>> mechanics) {
        this.mechanics = mechanics;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public Boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void startMove() {
        System.out.println("Начало движения грузовой машины");
    }

    @Override
    public void finishMove() {
        System.out.println("Конец движения грузовой машины");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для грузовой машины");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время для грузовой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для грузовой машины");
    }

    @Override
    public void repair() {
        System.out.println("Грузовая машина " + getBrand() + " " + getModel() + " починена");
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
        return "Грузовик " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(mechanics, truck.mechanics) && loadType == truck.loadType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanics, loadType);
    }
}
