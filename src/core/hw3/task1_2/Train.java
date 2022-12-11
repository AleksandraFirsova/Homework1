package core.hw3.task1_2;

import core.Utils;

import java.util.Objects;

public class Train extends Transport {

    private double cost;
    private int time;
    private String name;
    private String endingStation;
    private int amount;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed, double cost, int time, String name, String endingStation, int amount, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        this.cost = Utils.validateDoubleNum(cost, 2000);
        this.time = Utils.validateIntNum(time, 15);
        this.name = Utils.validateString(name, "Default");
        this.endingStation = Utils.validateString(endingStation, "Default");
        this.amount = Utils.validateIntNum(amount, 15);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", country='" + super.getCountry() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", cost=" + cost +
                ", time=" + time +
                ", name=" + name +
                ", endingStation=" + endingStation +
                ", amount=" + amount +
                '}';
    }

    @Override
    public String refill(Fuel fuel) {
        if (fuel.equals(Fuel.DIESEL)) {
            super.setFuelPercentage(35.3);
            return fuel.name;
        } else {
            return "Данный вид топлива не доступен";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Double.compare(train.cost, cost) == 0 && time == train.time && amount == train.amount && Objects.equals(name, train.name) && Objects.equals(endingStation, train.endingStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, time, name, endingStation, amount);
    }
}
