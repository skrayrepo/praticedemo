package stream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TakeWhileDropWhile {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(30,50,10,40,60);
        Path path = Files.createTempFile(Paths.get("text"),".txt","File created");
        System.out.println(path);
    }
}
