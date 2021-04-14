package task_4;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
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

class Rhomboid extends Shape {
    @Override public String toString() { return "Rhomboid"; }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList( new Circle(), new Square(), new Triangle() );
        for(Shape shape : shapeList)
            shape.draw();

        Rhomboid r = new Rhomboid();
        Shape s = r;

        Circle c = null;
        if(s instanceof Circle)
            ((Circle) s).draw();
        else if(!(s instanceof Circle))
            System.out.println("(Shape)r is not a Circle");
    }
}
