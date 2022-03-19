package pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Employee {
    String name;
    int salary;
    String empCode;
    String dateOfJoin;
    Date dateofJoining;
    List<String> mobileNumber;

    public Date getDateofJoining() {
        return dateofJoining;
    }

    public void setDateofJoining(Date dateofJoining) {
        try {
            this.dateofJoining = new SimpleDateFormat("dd/MM/yyyy").parse(this.dateOfJoin);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Employee(String name, int salary, String empCode, String dateOfJoin) {
        this.name = name;
        this.salary = salary;
        this.empCode = empCode;
        this.dateOfJoin = dateOfJoin;
    }

    public Employee(String name, int salary, List<String> mobileNumber) {
        this.name = name;
        this.salary = salary;
        this.mobileNumber = mobileNumber;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Employee(String name, int salary, String empCode, Date dateOfJoin) {
        this.name = name;
        this.salary = salary;
        this.empCode = empCode;
        this.dateofJoining = dateOfJoin;
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
                ", dateofJoining=" + dateofJoining+
                '}';
    }
}
