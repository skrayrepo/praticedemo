package stream.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ManinClassImpl{
    public static void main(String[] args) {
        TestFunInterface obj = new TestFunInterface(){
            @Override
            public void display(String arg) {
                System.out.println("Welcome to functional interface:"+arg);
            }
        };
        obj.display("Santosh");
        System.out.println(obj.getMessage());

        List<Integer> list = Arrays.asList(10,20,40,30,70);

        //External iteration
        for (Integer i:list) {
            System.out.print(" "+i);
        }
        System.out.println();

        //Internal iteration
        Consumer<Integer> co =new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.print(" "+o);
            }
        };
        list.forEach(co);
        System.out.println();
        //using Stream API
        list.stream().forEach(co);

        //Implement consumer functional interface with lamda expression
        list.forEach((i)->System.out.println(i));
        list.forEach(System.out::println); //Method reference

    }

}
