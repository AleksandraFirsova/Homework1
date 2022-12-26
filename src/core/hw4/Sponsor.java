package core.hw4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class Sponsor {
    private String name;
    private Integer amount;
    private HashMap<String, Transport> transport = new HashMap<>();

    public Sponsor(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Collection<Transport> getTransport() {
        return transport.values();
    }

    public void addTransport(Transport transport) {
        this.transport.put(transport.getBrand()+transport.getModel(),transport);
    }

    public void sponsorRace() {
        System.out.println("Спонсировать заезд");
    }
    @Override
    public String toString() {
        StringBuilder cars = new StringBuilder();
        for (Transport t: transport.values()) {
            cars.append(t.getBrand()).append(" ").append(t.getModel()).append(" ");
        }

        if (transport.isEmpty()) {
            cars.append("Нет спонсируемых автомобилей");
        }

        return "Имя спонсора: " + name +
                ", сумма поддержки: " + amount +
                ", транспорт: " + cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name) && Objects.equals(amount, sponsor.amount) && Objects.equals(transport, sponsor.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, transport);
    }
}
