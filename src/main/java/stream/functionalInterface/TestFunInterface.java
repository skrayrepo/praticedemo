package stream.functionalInterface;

@FunctionalInterface
public interface TestFunInterface {

    void display(String arg);
    boolean equals(Object ob);//Object class methos cann't be consider as SAM
    default String getMessage(){
        return "Welcome to default method";
    }
}
