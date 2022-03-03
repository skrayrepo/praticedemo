package interprocessthread;

public class Produce implements Runnable {
    AccessProduceConsume access;
    Thread t;
    Produce(AccessProduceConsume target){
        access= target;
        t = new Thread(this);
    }
    public void run() {
        for(int i=0;i<5;i++) {
            access.produceMessage(i);
        }
    }
}
