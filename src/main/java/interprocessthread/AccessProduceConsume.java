package interprocessthread;

public class AccessProduceConsume {
    synchronized void produceMessage(int count){
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producing inventory"+count);
        notify();
    }
    synchronized void consumeMessage(int count){
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("consuming inventory"+count);
        notify();
    }
}
