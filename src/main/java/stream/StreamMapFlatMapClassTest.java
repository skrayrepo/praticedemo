package stream;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapFlatMapClassTest {
    public static void main(String[] args){
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList =  dao.getEmployeeDetails();
        List<List<String>> collecMapMobileNum =
                empList.stream()
                        .map(employee -> employee.getMobileNumber()).
                        collect(Collectors.toList());
        collecMapMobileNum.forEach(System.out::println);
        List<String> collectFlatMobileNum =
                empList.stream()
                        .flatMap(employee -> employee.getMobileNumber().stream())
                        .collect(Collectors.toList());
        System.out.println("--------------------------------------------------");
        collectFlatMobileNum.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        List<String> san =
                empList.stream()
                .filter(employee -> employee.getName().startsWith("San"))
                .map(e -> e.getName())
                .collect(Collectors.toList());
        san.forEach(System.out::println);
    }
}
