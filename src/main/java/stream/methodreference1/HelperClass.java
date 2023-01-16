package stream.methodreference1;

import pojo.Employee;

public class HelperClass {

    public int sortByName(Employee e1,Employee e2){
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}
