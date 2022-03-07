package stream;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Arrays;
import java.util.List;
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
        System.out.println("----------------------------------- Retrieve Employee whone names end with ck");
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employeeList =  dao.getEmployeeList();
        Predicate<Employee> empPredicate = e -> e.getName().endsWith("ck");
        employeeList.stream().filter(empPredicate).forEach((i) -> System.out.println("Employee name is "+i));


    }
}
