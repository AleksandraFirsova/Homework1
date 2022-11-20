package basics.hw4.part1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите сидячее место? Y/N");
        String ticket = sc.nextLine();

        short capacityOneCarriage = 102;
        short seatCapacityOneCarriage = 60;
        int standingCapacityOneCarriage = capacityOneCarriage - seatCapacityOneCarriage;

        if (ticket.equals("Y")) {
            if (seatCapacityOneCarriage > 0) {
                System.out.println("Сидячие места остались");
            } else {
                System.out.println("Сидячих мест не осталось");
            }
        } else if (ticket.equals("N")) {
            if (standingCapacityOneCarriage > 0) {
                System.out.println("Стоячие места остались");
            } else {
                System.out.println("Стоячих мест не осталось");
            }
        }
        else {
            System.out.println("Ввод некорректен");
        }
    }
}
