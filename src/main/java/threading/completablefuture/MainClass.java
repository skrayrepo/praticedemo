package threading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainClass {
    public static void main(String[] args) {
        HelloHelper helloHelper = new HelloHelper();

        CompletableFuture.supplyAsync(helloHelper::hello)
                .thenApply(String::toUpperCase)
                .thenAccept(result->System.out.println(result));
        System.out.println("Main thread");

        String result = CompletableFuture.supplyAsync(helloHelper::hello)
                .thenCompose(previous->helloHelper.hellowWorld(previous))
                .join();
        System.out.println(result);
    }
}
