package oops;

import pojo.Employee;
import pojo.Student;

public class MainClass{
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        DefaultConstructor obj3 = new DefaultConstructor(15,60);
        obj3.getMessage1();
        SuperClassConstructor obj4 = new DefaultConstructor(20,90);
        obj4.message();
        Student emp = new Student("santosh",22,"A");
        obj3.length=88;
    }
}
