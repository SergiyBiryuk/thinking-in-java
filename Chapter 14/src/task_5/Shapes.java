package task_5;

import java.util.List;
import java.util.Arrays;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    void rotate(int deg) {
        if(this instanceof Circle) {
            System.out.println("It's a Circle mazafaka! Fuck you bitch!");
            return;
        }
        /* ... action ... */
        System.out.println("rotation of " + this + " to " + deg + " degrees.");
    }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Trinagle"; }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle());
        for(Shape shape : shapeList)
            shape.draw();
        for(Shape shape : shapeList)
            shape.rotate(90);
    }
}
