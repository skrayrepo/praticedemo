package stream.methodreference1;

import pojo.Employee;
import services.EmployeeDAO;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> empList = dao.getEmployeeList();
        HelperClass emp = new HelperClass();
        Collections.sort(empList,emp::sortByName);//Method object reference
        empList.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empList,emp::sortBySalary);
        empList.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empList,HelperStaticClass::sortByName); //Static method reference
        empList.forEach(System.out::println);

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Sant");
        queue.add("Cat");
        queue.add("Tap");
        queue.add("Arav");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
