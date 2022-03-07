package services;

import pojo.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> getEmployeeList(){
        List empList = new ArrayList<Employee>();
        try {
            empList.add(new Employee("Santosh",5000,"WE98UY", new SimpleDateFormat("dd/MM/yyyy").parse("25/03/2018")));
            empList.add(new Employee("Mack",3000,"WE68UZ", new SimpleDateFormat("dd/MM/yyyy").parse("10/09/2020")));
            empList.add(new Employee("Jack",70000,"WE93UY", new SimpleDateFormat("dd/MM/yyyy").parse("15/09/2015")));
            empList.add(new Employee("Jill",9000,"WE97UY", new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2013")));
            empList.add(new Employee("Zammei",3000,"WE99UY", new SimpleDateFormat("dd/MM/yyyy").parse("19/09/2021")));
            empList.add(new Employee("AraVind",2000,"WE61UY", new SimpleDateFormat("dd/MM/yyyy").parse("31/09/2019")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return empList;
    }
}
