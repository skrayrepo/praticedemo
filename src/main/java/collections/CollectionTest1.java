package collections;

import java.util.*;

public class CollectionTest1 {
    public static void main(String[] args){
        Integer[] intArray = new Integer[4];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 10;
        //Arrays.fill(intArray);
        Iterator it = Arrays.stream(intArray).iterator();
        while(it.hasNext()){
            System.out.println("Array=="+it.next());
        }
        System.out.println("----------------------------");
        List<Integer> intArrayList = Arrays.asList(intArray);
        Iterator itlist = intArrayList.iterator();
        while(itlist.hasNext()){
            System.out.println("Array=="+itlist.next());
        }
        //Arrays[] arrays = intArray.to
        Collection<String> co = new ArrayList<>();
        co.add("zzzzz");
        co.add("bbbb");
        co.add("cccc");
        Iterator itco = co.iterator();
        while(itco.hasNext()){
            String itco1= (String)itco.next();
            System.out.println(itco1);
        }
        System.out.println("----------------------");
        co.forEach(System.out::println);


    }
}
