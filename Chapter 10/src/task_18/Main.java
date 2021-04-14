package task_18;

class Outer {
    public Outer() { System.out.println("Outer.Outer()"); }
    public static class Inner {
        public Inner() { System.out.println("Inner.Inner()"); }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
    }
}
