package lambdaexpression;

interface DisplayLamdaExpression{
    public void show();
    default void display(){
        System.out.println("Display defalut method.....");
    }
}
public class LamdaTestClass {
    public static void  main(String[] args){
        DisplayLamdaExpression expression = () -> System.out.println("Show lamda method.....");
        expression.display();
        expression.show();
    }
}
