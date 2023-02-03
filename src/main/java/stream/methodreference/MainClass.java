package stream.methodreference;

import java.util.Comparator;
import java.util.function.BiFunction;

public class MainClass {
    public static void main(String[] args) {
        HelperInterface obj = new HelperClass();
        BiFunction<Integer, Integer, Boolean> sum = obj::getSum;//Method reference
        boolean result = sum.apply(8,5);
        System.out.println(result);

        BiFunction<Integer,Integer,Boolean> check = new BiFunction<Integer, Integer, Boolean>() {
            @Override
            public Boolean apply(Integer a, Integer b) {
                if(a > b){
                    return true;
                }
                return false;
            }
        };
        boolean result1 =check.apply(4,9);
        System.out.println(result1);

        BiFunction<Integer,Integer,Boolean> check1 =(a,b) ->a > b;

        check1.apply(3,4);

    }
}
