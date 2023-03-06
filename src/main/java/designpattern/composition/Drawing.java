package designpattern.composition;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    private List<Shape> shapeList =  new ArrayList<>();

    @Override
    public void draw(String color) {
        for(Shape s:shapeList){
            s.draw(color);
        }
    }

    public void addShape(Shape s){
        this.shapeList.add(s);
    }

    public void removeShape(Shape s){
        this.shapeList.remove(s);
    }

    public void clear(){
        this.shapeList.clear();
        System.out.println("Clearing all the shapes");
    }
}
