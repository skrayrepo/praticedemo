package sortedlist;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedListWIthComparatorClassTest {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getEmployeeList();
        //Comparator com = Comparator.comparing(Employee::getName);
        Comparator com = Comparator.comparing((Employee::getName));
        //Comparator com = Comparator.comparing(Employee::getName).reversed();
        Collections.sort(list,com);
        list.forEach(System.out::println);
        List<String> namesList = Arrays.asList("Santosh","san","Mond","santosh ray");
        Comparator com1 = Comparator.comparingInt(String::length).reversed();
        namesList.sort(com1);
        namesList.forEach(System.out::println);
        System.out.println("---------------------------------------");
        Comparator com2 = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);
        Collections.sort(list,com2);
        list.forEach(System.out::println);

    }
}
