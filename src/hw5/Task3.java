package hw5;

public class Task3 {
    public static void main(String[] args) {
        int year = 2700;

        if (year %4 == 0 && year %100 != 0 || year %400 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }
}
