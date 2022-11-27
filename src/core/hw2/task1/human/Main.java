package core.hw2.task1.human;

public class Main {

    public static void main(String[] args) {
        Human maksim = new Human(1987, "Максим", "Минск", "бренд менеджер");
        Human anya = new Human(1993, "Аня", "Moscow", "методист");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию");
        Human vladimir = new Human(1995, "Владимир", "Казань", "нет работы");

        maksim.getGreetingMessage(maksim.getName(), maksim.getCity(), maksim.getDateBirth(), maksim.getJobTitle());
        anya.getGreetingMessage(anya.getName(), anya.getCity(), anya.getDateBirth(), anya.getJobTitle());
        katya.getGreetingMessage(katya.getName(), katya.getCity(), katya.getDateBirth(), katya.getJobTitle());
        artem.getGreetingMessage(artem.getName(), artem.getCity(), artem.getDateBirth(), artem.getJobTitle());
        vladimir.getGreetingMessage(vladimir.getName(), vladimir.getCity(), vladimir.getDateBirth(), vladimir.getJobTitle());
    }
}
