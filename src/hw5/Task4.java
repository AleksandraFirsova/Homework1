package hw5;

public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        if (deliveryDistance > 100) {
            day++;
        }
        System.out.println("Потребуется дней: " + day);
    }
}
