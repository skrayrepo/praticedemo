package interprocessthread;

public class ProcessThread {
    public static void main(String[] args){
        AccessProduceConsume access = new AccessProduceConsume();
        Produce produce = new Produce(access);
        Consume consume = new Consume(access);
        produce.t.start();
        consume.t.start();
    }
}
