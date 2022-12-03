package core.hw3.task3;

public class Main {
    public static void isEqual(Animal firstObj, Animal secondObj) {
        if (firstObj.equals(secondObj)) {
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты не равны");
        }
    }

    public static void main(String[] args) {
        Amphibian frog = new Amphibian("Лягушка", 2, "озера и пруды");
        System.out.println(frog);
        frog.eat();
        frog.hunt();
        frog.move();

        Herbivore gazelle = new Herbivore("Газель", 5, "саванна", 30, "трава");
        System.out.println(gazelle);
        gazelle.move();
        gazelle.eat();
        gazelle.sleep();
        gazelle.walk();

        Predator hyena = new Predator("Гиена", 5, "джунгли", 30, "мясо");
        System.out.println(hyena);
        hyena.move();
        hyena.eat();
        hyena.sleep();
        hyena.walk();

        Flying gull = new Flying("Чайка", 12, "средняя полоса", "летает");
        System.out.println(gull);
        gull.move();
        gull.eat();
        gull.sleep();
        gull.hunt();

        Flightless firstPeacock = new Flightless("Павлин", 10, "Африка", "не летает");
        System.out.println(firstPeacock);
        firstPeacock.move();
        firstPeacock.eat();
        firstPeacock.sleep();
        firstPeacock.hunt();

        Flightless secondPeacock = new Flightless("Павлин", 10, "Африка", "не летает");
        System.out.println(secondPeacock);
        secondPeacock.move();
        secondPeacock.eat();
        secondPeacock.sleep();
        secondPeacock.hunt();

        isEqual(firstPeacock, gull);
        isEqual(firstPeacock, secondPeacock);
    }
}
