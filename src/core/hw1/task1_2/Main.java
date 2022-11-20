package core.hw1.task1_2;

public class Main {
    public static void getGreetingMessage(String name, String city, int dateBirth, String jobTitle) {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + dateBirth + " году. Я работаю на должности " + jobTitle + " Будем знакомы!");
    }

    public static void main(String[] args) {
        Human maksim = new Human(1987, "Maksim", "Minsk", "Brand manager");
        Human anya = new Human(1993, "Anya", "Moscow", "Metodist");
        Human katya = new Human(1994, "Katya", "Kaliningrad", "Product manager");
        Human artem = new Human(1995, "Artem", "Moscow", "Business development director");

        getGreetingMessage(maksim.getName(), maksim.getCity(), maksim.getDateBirth(), maksim.getJobTitle());
        getGreetingMessage(anya.getName(), anya.getCity(), anya.getDateBirth(), anya.getJobTitle());
        getGreetingMessage(katya.getName(), katya.getCity(), katya.getDateBirth(), katya.getJobTitle());
        getGreetingMessage(artem.getName(), artem.getCity(), artem.getDateBirth(), artem.getJobTitle());
    }
}
