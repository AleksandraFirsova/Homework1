package hw6.part3;

public class Task1 {
    public static void main(String[] args) {
        int sumMonth = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + sumMonth;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
}
