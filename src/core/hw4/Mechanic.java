package core.hw4;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Boolean service(T transport) {
        return transport.service();
    }

    public void repair(T transport) {
        transport.repair();
    }

    @Override
    public String toString() {
        return "Имя механика: " + name +
                ", компания: " + company;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
