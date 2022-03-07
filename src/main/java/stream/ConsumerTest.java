package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args){
        /*Consumer conTest = new Consumer<Integer>() { //Consumer interface override accept functional interface
            @Override
            public void accept(Integer o) {
                System.out.println("Consumer valur is "+o);
            }
        };*/
        Consumer conTest = (o) -> {
                System.out.println("Consumer value is "+o);
        };
        conTest.accept(50);

        List<Integer> list = Arrays.asList(7,5,3,2,1,9);
        list.stream().forEach((t) -> {                      //Foreach of stream takes Consumer interface as parameter
           t=t+1 ;
           System.out.println("Consumer value for labda is:" +t);
        });
    }
}
