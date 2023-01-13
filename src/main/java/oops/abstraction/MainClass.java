package oops.abstraction;

public class MainClass {
    public static void main(String[] args) {
        Parents obj = new Child();
        obj.getAge();
        obj.getSchoolInfo();
        obj.getMessage();
        Parents.getFamily();
        obj.getHouseDetails();
    }
}
