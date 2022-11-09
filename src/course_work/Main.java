package course_work;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void getEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
    }
    public static float getMonthSum(Employee[] employee) {
        float sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeWithMinSalary(Employee[] employee) {
        if (employee.length == 0) {
            return null;
        }
        Employee employeeMinSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() <= employeeMinSalary.getSalary()) {
                employeeMinSalary = employee[i];
            }
        }
        return employeeMinSalary;
    }
    public static Employee getEmployeeWithMaxSalary(Employee[] employee) {
        Employee employeeMaxSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee[i];
            }
        }
        return employeeMaxSalary;
    }
    public static float getAverageMonthSum(Employee[] employee) {
        float sum = getMonthSum(employee) / Arrays.stream(employee).filter(Objects::nonNull).count();
        return sum;
    }

    public static void getFullNameEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getName());
            }
        }
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1000, "1");
        employee[1] = new Employee("Сергеева Анна Юрьевна", 4000, "2");
        employee[2] = new Employee("Соколова Елена Алексеевна", 5000, "3");

        getEmployees(employee);
        System.out.println("Сумма затрат на зарплаты в месяц: " + getMonthSum(employee));
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employee));
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employee));
        System.out.println("Среднее значение зарплат: " + getAverageMonthSum(employee));
        getFullNameEmployees(employee);
    }
}
