package collections;

import services.StudentDAO;

import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args){
        StudentDAO dao = new StudentDAO();
        List list = dao.getStudentDetailsList();
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println("Student object=="+it.next());
        }
        Iterator it2 = list.stream().iterator();
        while(it2.hasNext()){
            System.out.println("Student object=="+it2.next());
        }
    }
}
