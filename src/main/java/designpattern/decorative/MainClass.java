package designpattern.decorative;

public class MainClass {
    public static void main(String[] args) {
        Totalprice totalprice = new Pencil(new Pen(new DefaultPrice()));
        System.out.println(totalprice.getTotalPrice());
    }
}
