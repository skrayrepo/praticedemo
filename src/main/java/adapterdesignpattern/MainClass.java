package adapterdesignpattern;

public class MainClass {

    public static void main(String[] args) {
        Pen penAdapter = new PenAdapter();
        String message = penAdapter.write("I want to write something");
        System.out.println(message);
    }
}
