package threading;

public class MultiThreading {
    public static int counter1;
    public static int counter2;
    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    public static  void counterIncr1(){
        synchronized (obj1) {
            counter1++;
            //System.out.println("thread1");
        }
    }
    public static void counterIncr2(){
        synchronized (obj2) {
            counter2++;
            //System.out.println("Thread2");
        }
    }
    public static void numberOfCounter() throws InterruptedException {

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                   counterIncr1();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counterIncr2();
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Total number of counter is "+counter1);
        System.out.println("Total number of counter is "+counter2);
    }

    public static void main(String[] args) throws InterruptedException {

        numberOfCounter();
    }
}
