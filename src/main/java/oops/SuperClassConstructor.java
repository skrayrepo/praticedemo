package oops;

public class SuperClassConstructor {
    int width = 20;
    SuperClassConstructor(){
        System.out.println("Calling SuperClass Constructor");
    }
    SuperClassConstructor(int width){
        this.width = width;
    }
    public void message(){
        System.out.println("Accessing super class method");
    }

}
