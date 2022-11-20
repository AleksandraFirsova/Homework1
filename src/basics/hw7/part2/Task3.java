package basics.hw7.part2;

public class Task3 {
    public static void main(String[] args) {
        int sumMonth = 15000;
        long total = 0;
        double percent = 0.07;
        int monthNum = 1;

        for (int i = 1; i < 9 * 12; i += 6) {
            long totalBefore = total;
            total = (long) ((total + sumMonth) * (1 + percent));
            if (monthNum % 6 == 0) {
                System.out.println("Месяц " + monthNum + " , сумма накоплений равна " + (total - totalBefore) + " рублей");
            }
            monthNum++;
        }
    }
}

