package reflectionapi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Generally reflection API uses in unit test case where we can test private fields and method.
// Also reflection used in spring to create object from class by using dependency Injection
public class ReflectionTestMainClass {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Santosh",30,"NPS");
        //Reflection API starts here
        String name = student.getClass().getName();
        System.out.println(name);

        Field[] fields = student.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            System.out.println(field.getName());
            if(field.getName().equals("schoolName")){
                field.set(student,"DPS");
            }
        }
        System.out.println("Updated school name is"+student.getSchoolName());

        Method[] methods = student.getClass().getDeclaredMethods();
        for (Method method:methods){
            if(method.getName().equals("getStudentFees")){
                method.setAccessible(true);
                method.invoke(student);
            }
            if(method.getName().equals("getSchoolNameDetails")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
