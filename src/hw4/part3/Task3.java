package hw4.part3;

public class Task3 {
    public static void main(String[] args) {
        int one = 7;
        int two = 11;
        int three = 3;

        int [] mas = {one, two, three};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] < mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Наибольшее число равно " + mas[0]);
    }
}
