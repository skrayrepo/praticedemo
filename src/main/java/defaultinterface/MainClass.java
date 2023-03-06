package defaultinterface;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Hyundai();
        vehicle.engine();
        Vehicle.getLicense();
    }
}
