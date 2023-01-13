package oops.abstraction;

public abstract class Parents {

    public abstract void getSchoolInfo();
    public abstract void getAge();
    public final void getMessage(){
        System.out.println("Getting the Parent Message");
    }
    public static void getFamily(){
        System.out.println("Geeting family info");
    }
    public void getHouseDetails(){
        System.out.println("Geeting Parents house details");
    }
}
