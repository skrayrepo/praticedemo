package comparator.list;

import pojo.Student;
import services.StudentDAO;

import java.util.Collections;
import java.util.List;

public class ComparatorMainClass {
    public static void main(String[] args) {
        StudentDAO studentService = new StudentDAO();
        List<Student> list = studentService.getStudentDetailsList();
        Collections.sort(list,new MyComparator());
        list.forEach(System.out::println);
    }

}
