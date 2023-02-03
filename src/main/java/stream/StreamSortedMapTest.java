package stream;

import pojo.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StreamSortedMapTest {
    public static void main(String[] args){
        Map<Integer,Employee> employeeMap = new HashMap<>();
        try {
            employeeMap.put(10,new Employee("Santosh",50000,"WE98UY", new SimpleDateFormat("dd/MM/yyyy").parse("25/03/2018"), ""));
            employeeMap.put(11,new Employee("Ashok",70000,"AB90UY", new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2020"), ""));
            employeeMap.put(12,new Employee("Vivek",30000,"DE98UY", new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2021"), ""));
            employeeMap.put(13,new Employee("Ramesh",60000,"NM98UY", new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), ""));

            employeeMap.entrySet().stream()
                    .sorted((e1,e2) ->e1.getValue().getSalary() - e2.getValue().getSalary())
                    .forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------");
            employeeMap.entrySet().stream()
                    .sorted(Comparator.comparing(e -> e.getValue().getName()))
                    .forEach(System.out::println);
            System.out.println("------------------------------Reversed Order-------------------------------------------");
           // Stream<Map.Entry<Integer, Employee>> empset = employeeMap.entrySet().stream();
            employeeMap.entrySet().stream()
                    .sorted((e1,e2) -> -e1.getValue().getName().compareTo(e2.getValue().getName()))
                    .forEach(System.out::println);
            System.out.println("------------------------------Reversed Order-------------------------------------------");
            employeeMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary).reversed()))
                    .forEach(System.out::println);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
