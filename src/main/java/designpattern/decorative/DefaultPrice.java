package designpattern.decorative;

public class DefaultPrice implements Totalprice{
    @Override
    public int getTotalPrice() {
        return 5;
    }
}
