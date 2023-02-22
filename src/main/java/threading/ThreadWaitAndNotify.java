package threading;

import static java.lang.Thread.sleep;

public class ThreadWaitAndNotify {


    public static void main(String[] args) throws InterruptedException {
        Process process = new Process();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //process.process1();
                    process.process3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //process.process2();
                    process.process4();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
