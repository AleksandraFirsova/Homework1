package hw7.part3;

public class Task1 {
    public static void main(String[] args) {
        int currentYear = 2022;
        int beforeCurrentYear = currentYear - 200;
        int afterCurrentYear = currentYear + 100;

        for (int i = beforeCurrentYear; i <= afterCurrentYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
