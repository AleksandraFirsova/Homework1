package hw11;

public class Task3 {
    public static void checkAmountDeliveryDays(int deliveryDistance) {
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

    public static void main(String[] args) {
        checkAmountDeliveryDays(95);
    }
}
