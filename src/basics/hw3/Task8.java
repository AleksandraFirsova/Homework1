package basics.hw3;

public class Task8 {

    public static void main(String[] args) {
        int salaryMashaMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryKristinaMonth = 76230;

        int salaryMashaYear = salaryMashaMonth * 12;
        int salaryDenisYear = salaryDenisMonth * 12;
        int salaryKristinaYear = salaryKristinaMonth * 12;

        int newSalaryMashaMonth = ((salaryMashaMonth * 10)/100) + salaryMashaMonth;
        int newSalaryDenisMonth = ((salaryDenisMonth * 10)/100) + salaryDenisMonth;
        int newSalaryKristinaMonth = ((salaryKristinaMonth * 10)/100) + salaryKristinaMonth;

        int newSalaryMashaYear = newSalaryMashaMonth * 12;
        int newSalaryDenisYear = newSalaryDenisMonth * 12;
        int newSalaryKristinaYear = newSalaryKristinaMonth * 12;

        int difSalaryMasha = newSalaryMashaYear - salaryMashaYear;
        int difSalaryDenis = newSalaryDenisYear - salaryDenisYear;
        int difSalaryKristina = newSalaryKristinaYear - salaryKristinaYear;

        System.out.println("Маша теперь получает " + newSalaryMashaMonth + " рублей. Годовой доход вырос на " + difSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenisYear + " рублей. Годовой доход вырос на " + difSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristinaYear + " рублей. Годовой доход вырос на " + difSalaryKristina + " рублей");
    }
}
