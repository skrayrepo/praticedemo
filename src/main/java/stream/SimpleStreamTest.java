package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SimpleStreamTest {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,5,3,8,9);
        list.stream().forEach(t -> {
            t = t+1;
            System.out.println("Array values "+t);
        }); //foreach parameter should be consumer
        //list.forEach();

    }
}
