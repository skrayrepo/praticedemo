package adapterdesignpattern;

public class PenAdapter implements Pen{

    FountainPen pen = new FountainPen();
    @Override
    public String write(String write) {
        return pen.message(write);
    }
}
