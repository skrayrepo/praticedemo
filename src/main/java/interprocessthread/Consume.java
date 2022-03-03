package interprocessthread;

public class Consume implements  Runnable{
    AccessProduceConsume access;
    Thread t;
    Consume(AccessProduceConsume target){
        access= target;
        t = new Thread(this);
    }
    public void run() {
        for(int i=0;i<5;i++) {
            access.consumeMessage(i);
        }
    }
}
