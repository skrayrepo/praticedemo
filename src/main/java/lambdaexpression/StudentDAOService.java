package lambdaexpression;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDAOService {
    public List<Student> getStudentSortedList(){
        StudentDAO service = new StudentDAO();
        List<Student> studentList= service.getStudentList();
       // Collections.sort(studentList, new MyComparator()); //calling MyComparator class without lamda expression
        Collections.sort(studentList,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        return studentList;
    }
    public static void main(String[] args){
        System.out.println(new StudentDAOService().getStudentSortedList());
    }

   /* public class MyComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }*/
}


