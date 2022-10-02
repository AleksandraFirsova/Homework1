package hw5;

public class Task3 {
    public static void main(String[] args) {
        int year = 2017;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Год високосный");
                }
            } else {
                System.out.println("Год високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
    }
}
