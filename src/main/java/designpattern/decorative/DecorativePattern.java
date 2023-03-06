package designpattern.decorative;

public abstract class DecorativePattern implements Totalprice{
    private Totalprice totalprice;
    DecorativePattern(Totalprice totalprice){
        this.totalprice = totalprice;
    }
    @Override
    public int getTotalPrice() {
        return totalprice.getTotalPrice();
    }
}
