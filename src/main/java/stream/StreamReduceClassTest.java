package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceClassTest {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,6,9,2,3,8);
        int sum =
                list.stream()
                        .mapToInt(i -> i).sum();
        System.out.println("Sum of all number="+sum);
        System.out.println("----------------------------");
        Integer reduce =
                list.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all reduce number="+reduce);
        Optional<Integer> reduce1 =
                list.stream().
                        reduce(Integer::sum);
        System.out.println("Sum of all reduce number="+reduce1.get());
        Integer reduce2 =
                list.stream()
                        .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Largest number="+reduce2);
        Integer reduce3 =
                list.stream()
                        .min(Integer::compare).get();
        System.out.println("Smallest number="+reduce3);
        Integer reduce4 =
                list.stream()
                        .max(Integer::compare).get();
        System.out.println("Largest number by max="+reduce4);
    }
}
