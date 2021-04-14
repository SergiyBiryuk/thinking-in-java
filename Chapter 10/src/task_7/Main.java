package task_7;

class Outer {

    public Outer() {}
    private int i;
    private void outer_1() {}
    public void outer_2() {
        Inner inner = new Inner();
        inner.inner();
    }
    private class Inner {
        private Inner() {}
        private void inner() {
            i++;
            outer_1();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outer_2();
    }
}
