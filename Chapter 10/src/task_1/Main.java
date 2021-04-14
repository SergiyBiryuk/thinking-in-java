package task_1;

class Outer {
    public Outer() { System.out.println("Outer.Outer()"); }
    class Inner {
        public Inner() { System.out.println("Inner.Inner()"); }
    }
    public Inner getInner() {
        System.out.println("Outer.getInner()");
        return new Inner();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.getInner();
    }
}
