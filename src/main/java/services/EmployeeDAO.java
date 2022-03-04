package services;

import pojo.Employee;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployeeList(){
        List empList = new ArrayList<Employee>();
        empList.add(new Employee("Santosh",5000,"WE98UY", "01/09/2008"));
        empList.add(new Employee("AraVind",3000,"WE68UZ", "25/03/2006"));
        empList.add(new Employee("Jack",70000,"WE93UY", "01/03/2018"));
        empList.add(new Employee("Zammei",9000,"WE97UY", "10/09/2016"));
        empList.add(new Employee("Zammei",3000,"WE97UY", "10/09/2016"));
        empList.add(new Employee("AraVind",2000,"WE97UY", "10/09/2016"));
        return empList;
    }
}
