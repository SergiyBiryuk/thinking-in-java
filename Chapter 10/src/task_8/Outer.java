package task_8;

public class Outer {
    Outer() {}
    public class Inner {
        public Inner() {}
        private int i;
        private void f() {}
    }
    public void doSomething() {
        Inner i = new Inner();
        i.i = 5;
        i.f();
    }
}

class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.doSomething();
        Outer.Inner i = o.new Inner();
    }
}
