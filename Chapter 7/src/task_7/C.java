package task_7;

import java.util.Random;

public class C extends A {
    public C() {
        super(new Random().nextInt(100));
        System.out.println("C constructor");
    }

    static B c;
    static { c = new B(500); }

    public static void main(String[] args) {
        C c = new C();
    }
}
