package core.hw3.task3;

import core.hw3.Utils;

import java.util.Objects;

public abstract class Mammal extends Animal {

    String livingEnvironment;
    double movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age);
        this.livingEnvironment = Utils.validateString(livingEnvironment, "default");
        this.movementSpeed = Utils.validateDoubleNum(movementSpeed, 0);
    }

    public abstract void walk();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Utils.validateString(livingEnvironment, "default");
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = Utils.validateDoubleNum(movementSpeed, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Double.compare(mammal.movementSpeed, movementSpeed) == 0 && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "имя - " + super.getName() +
                ", возраст - " + super.getAge() +
                ", класс - " + Mammal.this.getClass().getSimpleName() +
                ", среда обитания - " + livingEnvironment +
                ", скорсть передвижения - " + movementSpeed;
    }
}
