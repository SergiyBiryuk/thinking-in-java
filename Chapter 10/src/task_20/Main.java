package task_20;

interface Interface {
    void f();
    class Class implements Interface {
        @Override public void f() { System.out.println("f()"); }
    }
}

public class Main {
    public static void main(String[] args) {
        Interface.Class ic = new Interface.Class();
        ic.f();
    }
}
