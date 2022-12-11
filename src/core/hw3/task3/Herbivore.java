package core.hw3.task3;

import core.Utils;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String food;

    public Herbivore(String name, int age, String livingEnvironment, double movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed);
        this.food = Utils.validateString(food, "default");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = Utils.validateString(food, "default");
    }

    public void graze() {
        System.out.println("пасется");
    }

    @Override
    public void eat() {
        System.out.println("ест траву");
    }

    @Override
    public void sleep() {
        System.out.println("спит на земле");
    }

    @Override
    public void move() {
        System.out.println("бегает");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(food, herbivore.food);
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
                ", класс - " + Herbivore.this.getClass().getSimpleName() +
                ", среда обитания - " + super.getLivingEnvironment() +
                ", скорость передвижения - " + super.getMovementSpeed() +
                ", тип пищи - " + food;
    }
}
