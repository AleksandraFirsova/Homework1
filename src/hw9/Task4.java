package hw9;

public class Task4 {
    public static void main(String[] args) {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            char temp = 0;
            temp = reverseFullName[i];
            temp++;
            System.out.print(reverseFullName[i]);
        }
    }
}
