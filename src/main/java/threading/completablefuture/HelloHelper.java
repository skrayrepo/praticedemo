package threading.completablefuture;

import java.util.concurrent.CompletableFuture;

public class HelloHelper {
    public String hello(){
        return "Hello CompletableFuture.......";
    }

    public CompletableFuture<String> hellowWorld(String param){
        return CompletableFuture.supplyAsync(()->param+"world");
    }
}
