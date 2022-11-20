package basics.hw6.part3;

public class Task2 {
    public static void main(String[] args) {
        int sumMonth = 29000;
        double total = 0;
        double percent = 0.01;

        for (int i = 1; i <= 12; i++) {
            total = (total + sumMonth) * (1 + percent);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
}
