package threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainExecutorClass {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            //Thread.sleep(2000);
            executorService.execute(new ExecutorTest());
        }
    //executorService.awaitTermination(1000, TimeUnit.MICROSECONDS);
        if(!executorService.isShutdown()){
            executorService.shutdownNow();
        }

    }
}
