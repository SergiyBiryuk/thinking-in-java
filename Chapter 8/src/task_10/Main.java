package task_10;

class Basic {
    public void f() {
        System.out.println("Basic f()");
        g();
    }
    public void g() {
        System.out.println("Basic g()");
    }
}
class Inherited extends Basic {
    @Override public void g() {
        System.out.println("Inherited g()");
    }
}

public class Main {
    public static void main(String[] args) {
        Basic o = new Inherited();
        o.f();
    }
}
