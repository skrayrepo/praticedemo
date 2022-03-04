package sortedlist;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Comparator;
import java.util.List;

public class SortedListComparatorLamda {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getEmployeeList();
        list.sort(Comparator.comparing(e -> e.getName()) );
        list.forEach(System.out::println);
    }
}
