package services;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public List<Student> getStudentDetailsList(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Santosh",30,"A"));
        list.add(new Student("ashok",20,"B"));
        list.add(new Student("Jack",50,"C"));
        list.add(new Student("Anil",70,"C"));
        list.add(new Student("Bhavani",90,"A"));
        list.add(new Student("Zammie",10,"B"));
        return list;
    }
}
