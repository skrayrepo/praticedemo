package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Customer;
import pojo.Employee;
import services.EmployeeDAO;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollectMethod {
    public static void main(String[] args) {
        Map<Integer,Customer> custMap = CustomerEmptyDAO.getCustomerInfo();
        custMap.entrySet().stream().forEach(System.out::println);
        System.out.println("********************************");
        List<Customer> custList = custMap.entrySet().stream()
                .map(e->e.getValue())
                .sorted(Comparator.comparing(e->e.getCustomerName()))
                .collect(Collectors.toList());
        custList.forEach(System.out::println);

        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList = dao.getEmployeeList();
        int sum = empList.stream()
                .collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(sum);

        String name = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(",Mr ","Mr ",""));
        System.out.println(name);
        List<Employee> empDeptList = dao.getEmployeeList();
        System.out.println("************Retrive the employee list whose employe code is************");
        empDeptList.forEach(System.out::println);
        Map<String, List<Employee>> map=empDeptList.stream()
                .filter(e->e.getEmpCode().equals("WE98UY"))
                .collect(Collectors.groupingBy(Employee::getEmpCode));
        System.out.println(map);
        System.out.println("*************Find out the sum of salary whose emp code is ****************");
        Map<String, Integer> mapSalary=empDeptList.stream()
                .filter(e->e.getEmpCode().equals("WE98UY"))
                .collect(Collectors.groupingBy(Employee::getEmpCode,Collectors.summingInt(Employee::getSalary)));
        System.out.println(mapSalary);
        System.out.println("****************Create a Map from a list************************");
        Map<String,Integer> mapEmp = empDeptList.stream()
                .collect(Collectors.toMap(Employee::getName,Employee::getSalary));
        mapEmp.entrySet().forEach(System.out::println);

    }
}
