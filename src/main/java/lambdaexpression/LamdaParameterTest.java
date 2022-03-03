package lambdaexpression;

interface LambdaParameterInt{
    public int getSumResult(int a,int b);
    default void show(int result){
        System.out.println("Display result" +result);
    }
}
public class LamdaParameterTest {
    public static void main(String [] args){
        LambdaParameterInt exp = (a,b) -> {
            int sum = a+b;
            return sum;
        };
        exp.show(exp.getSumResult(3,4));
    }
}
