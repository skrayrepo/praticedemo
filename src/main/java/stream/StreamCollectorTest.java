package stream;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorTest {
    public static void  main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList = dao.getEmployeeList();
        empList= empList.stream().sorted(Comparator.comparing((e) -> e.getDateofJoining())).collect(Collectors.toList());
        empList.forEach(System.out::println);
        System.out.println("To collect result-------------------------------------------");
        List<String> list = empList.stream().map(Employee::getName).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("-------------------------------------------");
        String joined = empList.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(joined);
        System.out.println("-------------------------------------------");
        // Compute sum of salaries of employee
        int totalSalary = empList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("Total salaries of employee="+totalSalary);
        // Group employees by department
    }
}
