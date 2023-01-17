package comparable;

import comparator.list.MyComparator;
import pojo.Student;
import services.StudentDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTestClass {
    public static void main(String[] args) {
        EmployeeDAO empl = new EmployeeDAO();
        List<Employee> list = empl.getEmployeeDetailsList();
        Collections.sort(list);
        list.forEach(System.out::println);

        List<Employee> newList = new ArrayList<>();
        for(Employee emp:list){
            if(emp.getName().equalsIgnoreCase("Anil")){
                newList.add(emp);
            }else if(emp.getName().equalsIgnoreCase("Santosh")){
                newList.add(emp);
            }else if(emp.getName().equalsIgnoreCase("Ashok")){
                newList.add(emp);
            }


        }
        for(Employee e:list) {
            //int found = Collections.binarySearch(newList,e);
            if(Collections.binarySearch(newList,e) > -1){
                System.out.println("Name found:"+e.getName());
            }
            else{
                System.out.println("Name doesn't found");
            }
            //System.out.println(found);
        }
    }
}
