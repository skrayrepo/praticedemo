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
        Collections.sort(empList,emp::sortByName);
        empList.forEach(System.out::println);
    }
}
