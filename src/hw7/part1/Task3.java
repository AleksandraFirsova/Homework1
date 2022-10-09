package hw7.part1;

public class Task3 {
    public static void main(String[] args) {
        int population = 12000000;
        int fertilityYear = 17 * population / 1000;
        int mortalityYear = 8 * population / 1000;

        for (int i = 1; i <= 10; i++) {
            population = population + fertilityYear;
            population = population - mortalityYear;
            System.out.println("Год " + i + " , численность населения составляет " + population);
        }
    }
}
