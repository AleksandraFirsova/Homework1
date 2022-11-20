package basics.hw4.part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        short adulthood = 18;
        if (age >= adulthood) {
            System.out.println("Поздравляем!");
        } else if (age < adulthood && age > 0) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        } else {
            System.out.println("Возраст введен некорректно");
        }
    }
}
