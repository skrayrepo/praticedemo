package oops.abstraction;

public class Child extends Parents{
    //Parents obj = new Parents(); Abstract class never been instantiated
    String name = "Santosh";
    public Child(){
        //super.getMessage();
    }
    @Override
    public void getSchoolInfo() {
        System.out.println("Getting schoo information");
    }

    @Override
    public void getAge() {
        System.out.println("Getting Age......");
    }

    //Can't override final method
    /*@Override
    public void getMessage(){
        System.out.println("Getting the Child Message");
    }*/

    //Static method can't be override
    /*public void getFamily(){
        System.out.println("Geeting Child info");
    }*/

    public void getHouseDetails(){
        System.out.println("Geeting Child house details");
    }

    public void getChildDetails(){
        System.out.println("Child Details.....");
    }

}
