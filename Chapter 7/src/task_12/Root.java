package task_12;

public class Root {
    Root() {
        System.out.println("Root constructor");
    }
    void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }

    static Component1 c1 = new Component1();
    static Component2 c2 = new Component2();
    static Component3 c3 = new Component3();
}
