package threading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ForkAndJoinFramework {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,4,6,7,8,9,0,5,3);
        ForkJoinPool poll = new ForkJoinPool();
        //poll.invoke(new PrintNumbers(list));
        System.out.println(poll.invoke(new FibonaciNumber(8)));
    }
}
