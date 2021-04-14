package task_21;

interface Interface {
    String f();
    String g();
    class Class {
        public Class() { System.out.println("Class.Class()"); }
        public static void x(Interface i) {
            System.out.println("x()");
            System.out.println(i.f());
            System.out.println(i.g());
        }
    }
}

class Qwe implements Interface {
    public Qwe() { System.out.println("Qwe.Qwe()"); }
    @Override public String f() { return "f()"; }
    @Override public String g() { return "g()"; }
}

public class Main {
    public static void main(String[] args) {
        Interface.Class.x(new Qwe());
    }
}
