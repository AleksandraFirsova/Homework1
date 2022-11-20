package core.hw1.task1_2;

public class Human {
    private int dateBirth;
    private String name;
    private String city;

    private String jobTitle;

    public Human(int dateBirth, String name, String city, String jobTitle) {
        this.dateBirth = dateBirth;
        this.name = name;
        this.city = city;
        this.jobTitle = jobTitle;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
