package oops;

public class DefaultConstructor extends SuperClassConstructor{
    protected int length = 10;
    DefaultConstructor(int length,int width){
        super(width);//super always call first
        this.length = length;
        System.out.println("calling DefaultConstructor class");
    }
    public void getMessage1(){
        System.out.println("Calling Default class method"+length+"width"+width);
    }
}
