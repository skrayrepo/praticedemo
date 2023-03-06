package threading.waitnotify;

public class NotifyinhClass implements Runnable{
    static Integer MAX_LIMIT = 10;
    Integer number = 1;
    public Integer input;
    public static Object lock =new Object();
    NotifyinhClass(Integer input){
        this.input = input;
    }
    @Override
    public void run() {
        while (number < MAX_LIMIT) {
            synchronized (lock) {
                while (number % 2 != input) { // wait
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
