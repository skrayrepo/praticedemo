package pojo;

import java.util.Date;

public class Employee {
    String name;
    int salary;
    String empCode;
    String dateOfJoin;

    public Employee(String name, int salary, String empCode, String dateOfJoin) {
        this.name = name;
        this.salary = salary;
        this.empCode = empCode;
        this.dateOfJoin = dateOfJoin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empCode='" + empCode + '\'' +
                ", dateOfJoin=" + dateOfJoin +
                '}';
    }
}
