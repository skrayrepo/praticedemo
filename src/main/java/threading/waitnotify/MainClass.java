package threading.waitnotify;

public class MainClass {
    public static void main(String[] args) {

        /*NotifyinhClass notifyinhClass = new NotifyinhClass(0);
        NotifyinhClass notifyinhClass1 = new NotifyinhClass(1);
        Thread threadEven = new Thread(notifyinhClass,"Thread1");
        Thread threadOdd = new Thread(notifyinhClass1,"Thread2");
        threadEven.start();
        threadOdd.start();
        try {
            threadEven.join();
            threadOdd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        String test = "test";
        test.intern();
        String test2 = new String("test");
        if(test==test2){
            System.out.println("Successfully");
        }

    }
}
