package hw4.part1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Ребенок может поступать в университет");
        } else if (age >= 24) {
            System.out.println("Ребенок закончил университет");
        } else if (age > 0 && age < 7) {
            System.out.println("Ребенок ходит в д/с");
        } else {
            System.out.println("Возраст введен некорректно");
        }
    }
}
