package designpattern.decorative;

public class Pencil extends DecorativePattern{
    Pencil(Totalprice totalprice) {
        super(totalprice);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+5;
    }
}
