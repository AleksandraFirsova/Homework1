package basics.hw11;

public class Task1 {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkLeapYear(int year) {
        if (isLeapYear(year) == true) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void main(String[] args) {
        int year = 2017;
        checkLeapYear(year);
    }
}
