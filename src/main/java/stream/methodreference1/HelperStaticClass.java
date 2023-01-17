package stream.methodreference1;

import pojo.Employee;

public class HelperStaticClass {

    public static int sortByName(Employee e1,Employee e2){
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}
