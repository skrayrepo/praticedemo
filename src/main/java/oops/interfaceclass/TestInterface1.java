package oops.interfaceclass;

public interface TestInterface1 {
    void getMessage();

    //Below code possible  above java1.8 ver, will be error in java1.7
    default void show(){
        System.out.println("Executing TestInterface1");
    }
    static void calculate(){
        System.out.println("Executing Calculate");
    }
}
