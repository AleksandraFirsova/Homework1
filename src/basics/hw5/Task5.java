package basics.hw5;

import java.time.Month;

public class Task5 {
    public static void main(String[] args) {

        Month month = Month.MARCH;

        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case DECEMBER:
                System.out.println("Сейчас зима");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Сейчас весна");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Сейчас лето");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Что-то пошло не так! Программа выполняться не будет.");
        }
    }
}
