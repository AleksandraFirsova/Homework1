package core.hw1.task1_2;

public class Human {
    private int dateBirth;
    private String name;
    private String city;

    private String jobTitle;

    public Human(int dateBirth, String name, String city, String jobTitle) {
        if (dateBirth < 0) {
            this.dateBirth = 0;
        } else {
            this.dateBirth = dateBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
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
