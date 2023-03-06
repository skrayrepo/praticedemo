package defaultinterface;

public class Hyundai implements Vehicle{

    @Override
    public void speed() {

    }

    @Override
    public void engine() {
        Vehicle.super.engine();
    }
}
