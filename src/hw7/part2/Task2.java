package hw7.part2;

public class Task2 {
    public static void main(String[] args) {
        int sumMonth = 15000;
        long total = 0;
        double percent = 0.07;
        int monthNum = 1;

        while (total <= 12000000) {
            total = (long) ((total + sumMonth) * (1 + percent));
            if (monthNum % 6 == 0) {
                System.out.println("Месяц " + monthNum + " , сумма накоплений равна " + total + " рублей");
            }
            monthNum++;
        }
    }
}
