package basics.hw10;

public class Task2 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        String changeName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + changeName);
    }
}
