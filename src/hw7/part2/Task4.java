package hw7.part2;

public class Task4 {
    public static void main(String[] args) {
        int firstFriday = 5;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
        }
    }
}
