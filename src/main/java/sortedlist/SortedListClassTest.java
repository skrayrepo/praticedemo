package sortedlist;

import pojo.Student;
import services.StudentDAO;

import java.util.Comparator;
import java.util.List;

public class SortedListClassTest {
    public static void main(String[] args){
        StudentDAO dao = new StudentDAO();
        List  list = dao.getStudentDetailsList();
        Comparator<Student>  com = new Comparator<Student>(){ //Anonymous class
            public int compare(Student s1,Student s2){
                //return s1.getName().compareToIgnoreCase(s2.getName()); //Ascending order
                //return -s1.getName().compareToIgnoreCase(s2.getName()); //Descending order
                return s1.getRollNo() - s2.getRollNo();
            }
        };
        list.sort(com);//here sort method takes comparator as parameter
        list.forEach(System.out::println);
    }


}
