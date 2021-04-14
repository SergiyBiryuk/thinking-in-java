package task_31;

import java.util.Random;
import java.util.Iterator;

public class RandomShapeGenerator implements Iterable<Shape> {

    Shape[] shapes;
    public RandomShapeGenerator(int n) {
        shapes = new Shape[n];
        for(int i = 0; i < n; i++)
            shapes[i] = next();
    }

    private Random rand = new Random(47);
    private Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    @Override public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;
            @Override public boolean hasNext() { return count < shapes.length; }
            @Override public Shape next() { return shapes[count++]; }
            @Override public void remove() { throw new UnsupportedOperationException(); }
        };
    }

}
