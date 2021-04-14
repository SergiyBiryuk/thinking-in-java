package task_13;

interface Basic {
    void f1();
}

interface Inherited_1 extends Basic {
    void f2();
}
interface Inherited_2 extends Basic {
    void f2();
    void f3();
}
interface Inherited_3 extends Inherited_1, Inherited_2 {
    void f4();
}

public class Main implements Inherited_3 {
    public void f1() {}
    public void f2() {}
    public void f3() {}
    public void f4() {}

    public static void main(String[] args) {
        Inherited_1 i1 = new Main();
        Inherited_2 i2 = new Main();
        Inherited_3 i3 = new Main();
        Basic b = new Main();
    }
}
