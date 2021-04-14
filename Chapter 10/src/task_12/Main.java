package task_12;

class Outer {

    private int field;
    private void f() { System.out.println("Outer.f()"); }
    protected void fAnon() {}

    public Outer(final int i) {
        System.out.println("Outer.Outer()");
        field = i;
    }

    public Outer getAnonymous(final int i) {
        Outer a = new Outer(i) {
            { System.out.println("Anon Initialization"); }
            @Override protected void fAnon() {
                field++;
                f();
            }
        };
        a.fAnon();
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer(11111);
        Outer a = o.getAnonymous(22222);
        a.fAnon();
    }
}