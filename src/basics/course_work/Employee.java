package basics.course_work;

import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private String department;
    private int id;

    public Employee(String name, int salary, String department) {
        id = Utils.GetId();
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary
                && Objects.equals(name, employee.name)
                && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, department);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", имя сотрудника: " + name +
                ", зарплата: " + salary +
                ", отдел: " + department;
    }
}
