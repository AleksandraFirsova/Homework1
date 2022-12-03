package core.hw3.task3;

import core.hw3.Utils;

import java.util.Objects;

public class Predator extends Mammal {
    private String food;

    public Predator(String name, int age, String livingEnvironment, double movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed);
        this.food = Utils.validateString(food, "default");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = Utils.validateString(food, "default");
    }

    public void hunts() {
        System.out.println("охотится");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void walk() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(food, predator.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "имя - " + super.getName() +
                ", возраст - " + super.getAge() +
                ", класс - " + Predator.this.getClass().getSimpleName() +
                ", среда обитания - " + livingEnvironment +
                ", скорость передвижения - " + movementSpeed +
                ", тип пищи - " + food;
    }
}
