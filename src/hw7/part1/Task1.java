package hw7.part1;

public class Task1 {
    public static void main(String[] args) {
        int sumMonth = 15000;
        double total = 0;
        double finishTotal = 2_459_000;
        double percent = 0.01;

        while (total < finishTotal) {
            for (int i = 1; i <= 12; i++) {
                total = (total + sumMonth) * (1 + percent);
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            }
        }
    }
}
