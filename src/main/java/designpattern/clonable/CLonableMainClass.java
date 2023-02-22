package designpattern.clonable;

public class CLonableMainClass
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee("Santosh","terrr",44);
        Employee emp1 = emp; //Sallow cloning
        //emp1.setName("Sant");
        System.out.println(emp);
        System.out.println(emp1);

        Employee emp2 = (Employee) emp.clone(); //Deep Cloning
        emp2.setCode("KKKK");
        emp2.setName("Tap");
        System.out.println(emp2);
    }
}
