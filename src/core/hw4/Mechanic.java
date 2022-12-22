package core.hw4;

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

    public Boolean service(T car) {
        return car.service();
    }

    public void repair(T car) {
        car.repair();
    }
}
