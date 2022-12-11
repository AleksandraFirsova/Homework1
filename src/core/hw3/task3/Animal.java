package core.hw3.task3;

import core.Utils;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public Animal(String name, int age) {
        this.name = Utils.validateString(name, "default");
        this.age = Utils.validateIntNum(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Utils.validateString(name, "default");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Utils.validateIntNum(age, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "имя - " + name +
                ", возраст - " + age;
    }
}
