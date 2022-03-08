package stream;

import pojo.Employee;
import services.EmployeeDAO;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingTest {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList = dao.getEmployeeList();
        empList.stream().sorted(Comparator.comparing(e -> e.getName())).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        empList.stream().sorted((e1,e2) -> e1.getSalary() - e2.getSalary()).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        empList.stream().sorted(Comparator.comparing((e) -> e.getDateofJoining())).forEach(System.out::println);
        System.out.println("To collect result-------------------------------------------");
        empList= empList.stream().sorted(Comparator.comparing((e) -> e.getDateofJoining())).collect(Collectors.toList());
        empList.forEach(System.out::println);
        System.out.println("To collect result-------------------------------------------");
        List<String> list = empList.stream().map(Employee::getName).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
