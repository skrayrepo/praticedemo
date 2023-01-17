package comparator.list;

import pojo.Student;
import services.StudentDAO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMainClass {
    public static void main(String[] args) {
        StudentDAO studentService = new StudentDAO();
        List<Student> list = studentService.getStudentDetailsList();
        Collections.sort(list,new MyComparator());
        list.forEach(System.out::println);
        System.out.println("");
        //using Anonymous class
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        Collections.sort(list,com);
        list.forEach(System.out::println);
        System.out.println("");
        //Using Lamda expression
        Collections.sort(list,(s1,s2)->{
            return s1.getName().compareToIgnoreCase(s2.getName());
        });

        list.forEach(System.out::println);
    }

}
