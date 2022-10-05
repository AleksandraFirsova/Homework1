package hw6.part2;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0) {
                System.out.println(i + " - является високосным годом");
            } else {
                System.out.println(i + " - не является високосным годом");
            }
        }
    }
}
