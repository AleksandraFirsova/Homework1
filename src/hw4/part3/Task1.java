package hw4.part3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в д.с");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        }
        else if (age >= 19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        }
        else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
        else if (age < 2) {
            System.out.println("ввод некорректен");
        }
    }
}
