package hw8;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double doubleArr[] = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if (i != doubleArr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        String str[] = {"One", "Two", "Three"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if (i != str.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
