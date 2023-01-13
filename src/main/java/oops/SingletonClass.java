package oops;

public class SingletonClass {
    private SingletonClass() {

    }
    private static SingletonClass instance; //static because same instance been used for all other class
    public static SingletonClass getInstance(){
        //if one object not created then create one object
        if(instance == null ){
            instance = new SingletonClass();
            System.out.println("Instance created*****");
        }
        return instance;
    }
}
