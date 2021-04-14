package task_15;

import java.util.Random;

class Basic {
    public Basic(final int i) {
        System.out.println("Basic.Basic(" + i + ')');
    }
}

class Outer {
    public Outer() {
        System.out.println("Outer.Outer()");
    }

    public Basic getBasic(final int i) {
        return new Basic(i) {
            {
                System.out.println("Anonymous.Anonymous()");
            }
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Basic b = o.getBasic(new Random().nextInt(100));
    }
}
