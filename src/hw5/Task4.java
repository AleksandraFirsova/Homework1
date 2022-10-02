package hw5;

public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 61;
        int day = 24;

        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает " + day + " ч.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day = day*2;
            System.out.println("Доставка занимает " + day + " ч.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = day*3;
            System.out.println("Доставка занимает " + day + " ч.");
        } else {
            System.out.println("Доставка в этой зоне не осуществляется");
        }
    }
}
