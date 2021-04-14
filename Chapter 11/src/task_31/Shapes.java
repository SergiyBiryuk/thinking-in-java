package task_31;

public class Shapes {
    public static void main(String[] args) {
        Iterable<Shape> shapes = new RandomShapeGenerator(10);
        for(Shape shape : shapes) {
            shape.draw();
            shape.erase();
        }
    }
}