package syncthreadexample;

public class Caller {
    synchronized void show(String message){
        System.out.println("["+message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
