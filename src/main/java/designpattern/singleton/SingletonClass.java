package designpattern.singleton;

public class SingletonClass {

    //Eager
    //public static SingletonClass INSTANCE = new SingletonClass();
    public static SingletonClass INSTANCE;
    private SingletonClass(){

    }
    //Lazy
    public static SingletonClass getINSTANCE(){
        if(INSTANCE == null){
            synchronized(SingletonClass.class){
                INSTANCE = new SingletonClass();
            }
        }
        return INSTANCE;
    }
    public void connection(){
        System.out.println("DB connection established....");
    }

}
