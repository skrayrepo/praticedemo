package lambdaexpression;

interface SHowLambda{
    public void show();
}
public class AnonymousClass {
    public static void main(String[] args){
       /* SHowLambda lamda = new SimpleLamda();
        lamda.show();*/
        SHowLambda lamda = new SHowLambda() {
            public void show() {
                System.out.println("Show lamda expression");
            }
        };
        lamda.show();
    }

}
