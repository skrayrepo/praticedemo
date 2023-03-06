package helper;

import pojo.Employee;

import java.sql.SQLOutput;

public class EmployeeHelperClass {

    String test = new String("test");
    public static int totalSalary(Employee e1,Employee e2){
        return e1.getSalary() + e2.getSalary();
    }
}
