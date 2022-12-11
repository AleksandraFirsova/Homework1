package core.hw3.task3;

import core.Utils;

import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Utils.validateString(livingEnvironment, "default");
    }

    public void hunt() {
        System.out.println("охотятся");
    }

    @Override
    public void eat() {
        System.out.println("едят насекомых");
    }

    @Override
    public void sleep() {
        System.out.println("спят в норе");
    }

    @Override
    public void move() {
        System.out.println("ползают или плавают");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Животное: " +
                "имя - " + super.getName() +
                ", возраст - " + super.getAge() +
                ", класс - " + Amphibian.this.getClass().getSimpleName() +
                ", среда обитания - " + livingEnvironment;
    }
}
