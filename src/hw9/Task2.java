package hw9;

import static hw9.RandomArray.generateRandomArray;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
    }
}
