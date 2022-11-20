package basics.hw5;

public class Task1 {
    public static void main(String[] args) {
        String entryMethod = "Mobile version";
        int clientOS = 1;

        if (entryMethod.equals("Desktop") || entryMethod.equals("Mobile app")) {
            System.out.println("Рекламы нет");
        } else if (entryMethod.equals("Mobile version")) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
