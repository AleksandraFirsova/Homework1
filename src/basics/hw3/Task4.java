package basics.hw3;

public class Task4 {
    public static void main(String[] args) {
        byte performanceForOneMin = 8;
        byte performanceForTwoMin = 16;
        int performanceForTwentyMin = performanceForOneMin * 20;
        int performanceForDay = performanceForOneMin * 1440;
        int performanceForThreeDay = performanceForDay * 3;
        // В месяце 31 день
        int performanceForMonth = performanceForDay * 31;

        System.out.println("За 20 минут машины произвела бутылок " + performanceForTwentyMin + " штук");
        System.out.println("За сутки машины произвела бутылок " + performanceForDay + " штук");
        System.out.println("За три дня машины произвела бутылок " + performanceForThreeDay + " штук");
        System.out.println("За месяц машины произвела бутылок " + performanceForMonth + " штук");
    }
}
