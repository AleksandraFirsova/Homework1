package core.hw2.task1.flower;

import core.hw2.task1.Utils;

public class Flower {

    private String flowerColor;
    private String country;
    private float cost;

    private String name;
    int lifeSpan;

    public Flower(String flowerColor, String country, float cost, String name, int lifeSpan) {
        this.flowerColor = Utils.validateString(flowerColor, "White");
        this.country = Utils.validateString(country, "Russia");
        this.cost = cost;
        this.name = Utils.validateString(name, "Нет информации");
        this.lifeSpan = Utils.validateIntNum(lifeSpan, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
