package stream.methods;

import com.sun.deploy.util.SyncAccess;
import stream.StreamMapFlatMapClassTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamConcatMethod {

    public static void main(String[] args) {
        Stream s1 = Stream.of("Santosh","Saurvi");
        Stream s2 =  Stream.of("Tapaswini","Sragvi");

        Stream.concat(s1,s2).forEach(System.out::println);
        System.out.println("-----------------------------------------");
        Stream s3 = Stream.of("Santosh","Saurvi");
        Stream s4 =  Stream.of("Tapaswini","Sragvi");
        List<String> list = (List<String>) Stream.concat(s4,s3)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
