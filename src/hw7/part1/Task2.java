package hw7.part1;

public class Task2 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        i--;
        System.out.println();

        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
