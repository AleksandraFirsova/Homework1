package core.hw2.task1.human;

public class Main {

    public static void main(String[] args) {
        Human maksim = new Human(1987, "Maksim", "Minsk", "Brand manager");
        Human anya = new Human(1993, "Anya", "Moscow", "Metodist");
        Human katya = new Human(1994, "Katya", "Kaliningrad", "Product manager");
        Human artem = new Human(1995, "Artem", "Moscow", "Business development director");
        Human vladimir = new Human(1995, "Vladimir", "Kazan", "Не работает");

        maksim.getGreetingMessage(maksim.getName(), maksim.getCity(), maksim.getDateBirth(), maksim.getJobTitle());
        anya.getGreetingMessage(anya.getName(), anya.getCity(), anya.getDateBirth(), anya.getJobTitle());
        katya.getGreetingMessage(katya.getName(), katya.getCity(), katya.getDateBirth(), katya.getJobTitle());
        artem.getGreetingMessage(artem.getName(), artem.getCity(), artem.getDateBirth(), artem.getJobTitle());
        vladimir.getGreetingMessage(vladimir.getName(), vladimir.getCity(), vladimir.getDateBirth(), vladimir.getJobTitle());
    }
}
