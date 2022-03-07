package stream;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args){
        Predicate predicate =  new Predicate<Integer>(){ //Prdicate interface override test functional interface
            public boolean test(Integer e){
                if(e%2 ==0) {
                    System.out.println("Return even");
                    return true;
                }
                else {
                    System.out.println("Return odd");
                    return false;
                }
            }
        };
        predicate.test(31);
        Predicate<Integer> lamdaPredicate = (i) ->{  //Convert to lamda
            if(i%2 ==0) {
                System.out.println("lamda Return even");
                return true;
            }
            else {
                System.out.println("lamda Return odd");
                return false;
            }
        };
        lamdaPredicate.test(10);
        System.out.println("-----------------------------------");
        List<Integer> list = Arrays.asList(6,7,3,9,2,4);
        list.stream().filter((i) -> i % 2 ==0).forEach((t) -> System.out.println("Even Number is:"+t));
        list.stream().filter((i) -> i % 2 !=0).forEach((t) -> System.out.println("Odd Number is:"+t));
        System.out.println("----------------------------------- Retrieve Employee whose names end with ck");
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employeeList =  dao.getEmployeeList();
        Predicate<Employee> empPredicate = e -> e.getName().endsWith("ck");
        employeeList.stream().filter(empPredicate).forEach((i) -> System.out.println("Employee name is "+i));
        System.out.println("----------------------------------- Retrieve Employee whose names end with ck by using Map");
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(3000,"Santosh");
        employeeMap.put(5000,"Vivek");
        employeeMap.put(2000,"Sangeeta");
        employeeMap.put(1000,"Ashok");

        /*Predicate mapPredicate = new Predicate<HashMap>(){
            @Override
            public boolean test(HashMap map) {
                return map.containsValue("San");
            }
        };*/
        employeeMap.entrySet().stream().filter(e->e.getValue().startsWith("San")).forEach(e -> System.out.println(e));

    }
}
