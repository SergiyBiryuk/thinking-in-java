package task_6;

import java.util.List;
import java.util.Arrays;

abstract class Shape {
    boolean flag;
    void draw() { System.out.println(this + ".draw() | " + (flag ? "up" : "down")); }
    @Override abstract public String toString();
}

class Circle extends Shape {
    @Override public String toString() { return "Circle"; }
}

class Square extends Shape {
    @Override public String toString() { return "Square"; }
}

class Triangle extends Shape {
    @Override public String toString() { return "Triangle"; }
}

public class Shapes {
    public static void setFlag(List<Shape> shapeList, Class type) {
        for(Shape shape : shapeList)
            if( shape.getClass() == type )
                shape.flag = true;
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Circle(), new Triangle(), new Circle());
        System.out.println();
        for(Shape shape : shapeList)
            shape.draw();
        setFlag(shapeList, Circle.class);
        System.out.println();
        for(Shape shape : shapeList)
            shape.draw();
        setFlag(shapeList, Triangle.class);
        System.out.println();
        for(Shape shape : shapeList)
            shape.draw();
    }
}
