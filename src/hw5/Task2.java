package hw5;

public class Task2 {
    public static void main(String[] args) {
        int dateManufacture = 2016;
        String entryMethod = "Mobile version";
        int clientOS = 1;

        if (entryMethod.equals("Desktop") || entryMethod.equals("Mobile app")) {
            System.out.println("Рекламы нет");
        } else if (entryMethod.equals("Mobile version")) {
            if (clientOS == 0 && dateManufacture > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else if (clientOS == 0 && dateManufacture < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 1 && dateManufacture > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if (clientOS == 1 && dateManufacture < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }


}
