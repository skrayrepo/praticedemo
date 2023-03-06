package defaultinterface;

public interface Vehicle {
    void speed();
    default void engine(){
        System.out.println("capacity of the engine");
    }
    static void getLicense() {
        System.out.println("Please renew license");
    }
}
