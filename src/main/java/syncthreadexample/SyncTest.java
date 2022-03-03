package syncthreadexample;

public class SyncTest {
    public  static void main(String[] args) throws InterruptedException {
        Caller caller = new Caller();
        Callme callme1 =  new Callme(caller,"Calling");
        Callme callme2 =  new Callme(caller,"Thread");
        Callme callme3 =  new Callme(caller,"Synchronised");

        callme1.t.start();
        callme2.t.start();
        callme3.t.start();
        System.out.println("Thread1 Alive"+callme1.t.isAlive());
        System.out.println("Thread2 Alive"+callme2.t.isAlive());
        System.out.println("Thread3 Alive"+callme3.t.isAlive());

        callme1.t.join();
        callme2.t.join();
        callme3.t.join();
        System.out.println("Main thread closing here");
    }
}
