package comparable;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployeeDetailsList(){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Santosh",5000,40));
        list.add(new Employee("ashok",2000,20));
        list.add(new Employee("Jack",5000,50));
        list.add(new Employee("Anil",7000,30));
        list.add(new Employee("Bhavani",9000,20));
        list.add(new Employee("Zammie",10000,10));
        return list;
    }
}
