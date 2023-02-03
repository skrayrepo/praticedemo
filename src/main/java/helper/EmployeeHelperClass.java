package helper;

import pojo.Employee;

public class EmployeeHelperClass {

    public static int totalSalary(Employee e1,Employee e2){
        return e1.getSalary() + e2.getSalary();
    }
}
