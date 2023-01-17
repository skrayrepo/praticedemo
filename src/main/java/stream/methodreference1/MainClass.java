package stream.methodreference1;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList = dao.getEmployeeList();
        HelperClass emp = new HelperClass();
        Collections.sort(empList,emp::sortByName);//Method object reference
        empList.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empList,emp::sortBySalary);
        empList.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empList,HelperStaticClass::sortByName); //Static method reference
        empList.forEach(System.out::println);
    }
}
