package basics.hw8;

public class Task3 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double doubleArr[] = {1.57, 7.654, 9.986};
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        String str[] = {"One", "Two", "Three"};
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
