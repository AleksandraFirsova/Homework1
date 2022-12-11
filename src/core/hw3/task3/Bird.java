package core.hw3.task3;

import core.hw3.Utils;

import java.util.Objects;

public abstract class Bird extends Animal {

    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Utils.validateString(livingEnvironment, "default");
    }

    public abstract void hunt();

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Utils.validateString(livingEnvironment, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
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
                ", класс - " + Bird.this.getClass().getSimpleName() +
                ", среда обитания - " + livingEnvironment;
    }
}
