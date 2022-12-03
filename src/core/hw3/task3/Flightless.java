package core.hw3.task3;

import core.hw3.Utils;

import java.util.Objects;

public class Flightless extends Bird {
    private String typeMove;

    public Flightless(String name, int age, String livingEnvironment, String typeMove) {
        super(name, age, livingEnvironment);
        this.typeMove = Utils.validateString(typeMove, "default");
    }

    public String getTypeMove() {
        return typeMove;
    }

    public void setTypeMove(String typeMove) {
        this.typeMove = Utils.validateString(typeMove, "default");
    }

    public void walk() {
        System.out.println("гуляет");
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public void sleep() {
        System.out.println("спит");
    }

    @Override
    public void move() {
        System.out.println("двигается");
    }

    @Override
    public void hunt() {
        System.out.println("охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeMove, that.typeMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMove);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "имя - " + super.getName() +
                ", возраст - " + super.getAge() +
                ", класс - " + Flightless.this.getClass().getSimpleName() +
                ", среда обитания - " + livingEnvironment +
                ", тип передвижения - " + typeMove;
    }
}
