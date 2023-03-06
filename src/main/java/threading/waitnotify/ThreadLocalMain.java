package threading.waitnotify;

public class ThreadLocalMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalRunnable tl = new ThreadLocalRunnable();

        Thread t1 = new Thread(tl,"Thread1");
        Thread t2 = new Thread(tl,"Thread2");
        Thread t3 = new Thread(tl,"Thread3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
