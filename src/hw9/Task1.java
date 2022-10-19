package hw9;

import static hw9.RandomArray.generateRandomArray;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
}
