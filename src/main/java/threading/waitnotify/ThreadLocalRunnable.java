package threading.waitnotify;

public class ThreadLocalRunnable implements Runnable{
    // ThreadLocal of Integer type
    private ThreadLocal<Integer> tl = new ThreadLocal<Integer>();
    //int t1;

    @Override
    public void run() {
            synchronized (this) {
                //t1 = (int) (Math.random() * 10);
                tl.set((int) (Math.random() * 10));
            }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName()+":"+tl.get());
    }
}
