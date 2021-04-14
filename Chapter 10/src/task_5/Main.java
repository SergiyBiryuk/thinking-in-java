package task_5;

class Outer {
    public Outer() { System.out.println("Outer.Outer()"); }
    class Inner {
        public Inner() { System.out.println("Inner.Inner()"); }
        @Override public String toString() { return "Inner.toString()"; }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Outer().new Inner());
    }
}
