package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Santosh",30,"A"));
        studentList.add(new Student("Ashok",50,"B"));
        studentList.add(new Student("Jack",40,"C"));
        return studentList;
    }

}
