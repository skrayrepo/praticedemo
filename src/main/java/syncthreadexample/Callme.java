package syncthreadexample;

public class Callme implements Runnable{
    String messg;
    Thread t;
    Caller target;
    Callme(Caller call,String message){
        target = call;
        messg = message;
        t = new Thread(this);
    }
    public void run() {
        //synchronized statement
        /*synchronized (target) {
            target.show(messg);
        }*/
        target.show(messg); //synchronized method
    }
}
