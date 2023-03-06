package designpattern.composition;

public class Circle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Draw the circle with color"+color);
    }
}
