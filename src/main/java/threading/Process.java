package threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Process {

        public void process1() throws InterruptedException {
            synchronized (this) {
                System.out.println("Executing process1 thread");
                wait();
                System.out.println("Resume the execution of process1 thread");
            }
        }

        public void process2() throws InterruptedException {
            synchronized (this) {
                System.out.println("Executing process2 thread");
                notify();
                //sleep(5000);
            }
        }

        //Locking mechanism similiar to synchronization
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void process3() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("Executing process1 thread");
            condition.await();
            System.out.println("Resume the execution of process1 thread");
        }finally {
            lock.unlock();
        }

    }

    public void process4() throws InterruptedException {
            Thread.sleep(5000);
            lock.lock();
            try {
                System.out.println("Executing process2 thread");
                condition.signal();
            }finally {
                lock.unlock();
            }

    }

}
