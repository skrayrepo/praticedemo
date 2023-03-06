package stream.methods;

import dao.CustomerEmptyDAO;
import pojo.Customer;
import pojo.Employee;
import services.EmployeeDAO;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;

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

        System.out.println("*****************Average Salary of all employee**************");
        double salary = empDeptList.stream()
                .mapToInt(e->e.getSalary())
                .average()
                .getAsDouble();
        System.out.println("Salary ="+salary);

        System.out.println("**********find out most expensive salary person************");
        Optional<Employee> maxEmpSal = Optional.of(empDeptList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(new Employee("test", 323, "111", "")));

        System.out.println(maxEmpSal);
        System.out.println("****************find three top most salary employee************");
        List<Employee> list = empDeptList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("**********find duplicate salary entries *****************");
        Set<Integer> salarySet = new HashSet<>();
        empDeptList.stream()
                .filter(e->!salarySet.add(e.getSalary()))
                .collect(Collectors.toList()).forEach(System.out::println);

        List<String> resultList = Arrays.asList("san","tap","sau","san","tap");
        resultList.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("*********Find address of Santosh*************");
        custList = CustomerEmptyDAO.getCustomerList();
        custList.parallelStream()
                .filter(c -> c.getCustomerName().equalsIgnoreCase("Santosh"))
                .map(a -> a.getAddress())
                .forEach(System.out::println);

        EmployeeDAO dao1 = new EmployeeDAO();
        List<Employee> empDetails = dao1.getEmployeeDetails();
        System.out.println("*******************************************");
        System.out.println(empDetails);
        System.out.println("*************find all the mobile numbers of Employee using flatMap*********");
        List<String> mobileList = empDetails.stream()
                .flatMap(e->e.getMobileNumber().stream())
                .collect(Collectors.toList());
        mobileList.forEach(System.out::println);

        Integer[] arr = {3,1,5,6};
        Arrays.stream(arr).sorted();
        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).
                sorted(Comparator.comparing(Integer::intValue).reversed())
                .forEach(System.out::println);

        System.out.println("*************Find out maximum salary employee****************");
        Optional<Employee> salMap = empDeptList.stream()
                .collect(reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(salMap);
        Optional<Employee> saleMap1 = empDeptList.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(salMap);

        Map<String,Date> mapList = empDeptList.stream()
                .collect(Collectors.toMap(Employee::getName,Employee::getDateofJoining));
        mapList.entrySet().forEach(System.out::println);

        System.out.println("******Loop Fusion and Short-circuiting, for these streams are faster then external loop");
        empDeptList.stream()
                .filter(e->{
                    if(e.getSalary() > 3000) {
                        System.out.println("filter");
                    }
                    return true;
                })
                .map(e-> {
                    System.out.println("map");
                    return e.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        String[] strArr = {"santosh","Tapaswini","Saurvi","Sree"};
        List<Integer> length = Stream.of(strArr).map(String::length).collect(Collectors.toList());
        length.stream().forEach(System.out::print);
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("san",1);
        map1.put("dav",4);
        map1.put("zap,",2);
        map1.entrySet().stream().sorted(Comparator.comparing(String::valueOf)).forEach(System.out::println);
        Set<Map.Entry<String, Integer>> mapset = map1.entrySet();
        for(Map.Entry maps:mapset){
            maps.getValue();
        }
    }
}
