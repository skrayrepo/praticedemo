package sortedlist;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedListCollectionTest {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getEmployeeList();
        Collections.sort(list,(e1,e2) ->{return e1.getSalary() - e2.getSalary();});
        list.forEach(System.out::println);

    }
}
