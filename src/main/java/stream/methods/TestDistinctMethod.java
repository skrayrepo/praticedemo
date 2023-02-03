package stream.methods;

import java.util.Arrays;
import java.util.List;

public class TestDistinctMethod {
    public static void main(String[] args) {
        List<String> distinctList = Arrays.asList("SAN","WAN","DAN","SAN");
        //Removed duplicates
        distinctList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
