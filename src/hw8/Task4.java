package hw8;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = i + 1;
                arr[i] = arr[i] + 1;
                System.out.print(arr[i]);
            } else {
                arr[i] = i + 1;
                System.out.print(arr[i]);
            }
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

