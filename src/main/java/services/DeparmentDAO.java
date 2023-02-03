package services;

import pojo.Department;

import java.util.ArrayList;
import java.util.List;

public class DeparmentDAO {
    public List<Department>  getdepartmentList(){
        List<Department> departList = new ArrayList<>();
        departList.add(new Department(10,"IT"));
        departList.add(new Department(20,"Finance"));
        departList.add(new Department(30,"HR"));
        departList.add(new Department(40,"Facility"));
        return departList;
    }

}
