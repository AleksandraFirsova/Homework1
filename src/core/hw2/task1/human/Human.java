package core.hw2.task1.human;

import core.hw2.task1.Utils;

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

    public void setDateBirth(int dateBirth) {
        this.dateBirth = Utils.validateIntNum(dateBirth, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Utils.validateString(name, "Информация не указана");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = Utils.validateString(city, "Информация не указана");
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = Utils.validateString(jobTitle, "Информация не указана");
    }

    public void getGreetingMessage(String name, String city, int dateBirth, String jobTitle) {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + dateBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!");
    }
}
