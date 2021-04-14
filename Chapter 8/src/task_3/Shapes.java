package task_3;

import java.util.Random;

class Shape {
    public void draw() {}
    public void erase() {}
    public void write() { System.out.println("Shape.write()"); }
}

class Circle extends Shape {
    @Override public void draw() { System.out.println("Circle.draw()"); }
    @Override public void erase() { System.out.println("Circle.erase()"); }
    @Override public void write() { System.out.println("Circle.write()"); }
}

class Square extends Shape {
    @Override public void draw() { System.out.println("Square.draw()"); }
    @Override public void erase() { System.out.println("Square.erase()"); }
    @Override public void write() { System.out.println("Square.write()"); }
}

class Triangle extends Shape {
    @Override public void draw() { System.out.println("Triangle.draw()"); }
    @Override public void erase() { System.out.println("Triangle.erase()"); }
    @Override public void write() { System.out.println("Triangle.write()"); }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for(Shape shp : s) {
            shp.draw();
            shp.write();
        }
    }
}