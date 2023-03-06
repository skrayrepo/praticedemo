package designpattern.decorative;

public class Pen extends DecorativePattern{
    Pen(Totalprice totalprice) {
        super(totalprice);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() + 5;
    }
}
