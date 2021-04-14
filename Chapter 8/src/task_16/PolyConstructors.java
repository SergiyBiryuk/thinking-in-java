package task_16;

class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius );
    }
}
class RectangularGlyph extends Glyph {
    private int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    RectangularGlyph(int... coords) {
        x1 = coords[0]; y1 = coords[1]; x2 = coords[2]; y2 = coords[3];
        System.out.println("RectangularGlyph.RectangularGlyph()");
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
    }
    void draw() {
        System.out.println("RectangularGlyph.draw()");
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println();
        new RectangularGlyph(1, 2, 3, 4);
        System.out.println();
        new RectangularGlyph((new int[] {5, 6, 7, 8}));
        int[] b = {9, 10, 11, 12};
        new RectangularGlyph(b);
    }
}
