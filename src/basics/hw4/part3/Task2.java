package basics.hw4.part3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age < 5) {
            System.out.println("Если возраст человека равен" + age + " , то он не может кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст человека равен" + age + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age > 14) {
            System.out.println("Если возраст человека равен" + age + " , то он может кататься без сопровождения взрослого");
        }
    }
}
