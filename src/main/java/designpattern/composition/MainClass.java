package designpattern.composition;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle  = new Triangle();
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(triangle);
        drawing.draw("Red");
        drawing.removeShape(circle);
        drawing.draw("Blue");
    }
}
