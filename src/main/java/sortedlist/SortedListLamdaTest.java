package sortedlist;

import services.EmployeeDAO;
import pojo.Employee;
import pojo.Student;
import services.StudentDAO;

import java.util.Comparator;
import java.util.List;

public class SortedListLamdaTest {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.getEmployeeList();
        /*Comparator<Employee> com =(e1,e2) ->{
            return e1.getName().compareToIgnoreCase(e2.getName());
        };*/
        Comparator<Employee> com =(e1,e2) ->{
            return e1.getDateofJoining().compareTo(e2.getDateofJoining());
        };
        list.sort(com);
        list.forEach(System.out::println);
    }
}
