package hw9;

import static hw9.RandomArray.generateRandomArray;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int dayInMonth = 30;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double mid = sum/dayInMonth;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");
    }
}
