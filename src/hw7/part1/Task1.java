package hw7.part1;

public class Task1 {
    public static void main(String[] args) {
        int sumMonth = 15000;
        double total = 0;
        double finishTotal = 2_459_000;
        double percent = 0.01;
        int monthNum = 1;

        while (total < finishTotal) {
            total = (total + sumMonth) * (1 + percent);
            System.out.println("Месяц " + monthNum + " , сумма накоплений равна " + total + " рублей");
            monthNum++;
        }
    }
}
