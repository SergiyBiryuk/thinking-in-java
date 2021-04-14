package task_12;

public class Stem extends Root {
    Stem() {
        System.out.println("Stem constructor");
    }
    void dispose() {
        System.out.println("Stem dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }

    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
}
