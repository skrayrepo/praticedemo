package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FindFrequencyInString {
    public static void main(String[] args) {
        String name = "success";

        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), counting()));
        collect.entrySet().stream().forEach(System.out::println);

    }
}
