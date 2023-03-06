package designpattern.composition;

public class Triangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Draw the triangle shape with color: "+color);
    }
}
