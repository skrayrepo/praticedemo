package oops.interfaceclass;

public interface TestInterface2 {

    void getMessage();
    default void show(){
        System.out.println("Executing TestInterface2");
    }
}
