package genericclass;

public class GenericMethodClass {

    <K>void getMessage(K value){
        System.out.println("Result is "+value.getClass().getName());
    }
}
