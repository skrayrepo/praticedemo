package threading;

public class ExecutorTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ruuning the process "+Thread.currentThread().getId());
        }
    }
}
