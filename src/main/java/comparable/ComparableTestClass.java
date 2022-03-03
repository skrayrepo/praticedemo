package comparable;

import comparator.list.MyComparator;
import pojo.Student;
import services.StudentDAO;

import java.util.Collections;
import java.util.List;

public class ComparableTestClass {
    public static void main(String[] args) {
        EmployeeDAO empl = new EmployeeDAO();
        List<Employee> list = empl.getEmployeeDetailsList();
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
