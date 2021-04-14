package task_17;

public class Frog extends Amphibian {
    @Override protected void f1() { System.out.println("Frog F1"); }
    @Override protected void f2() { System.out.println("Frog F2"); }
    @Override protected void f3() { System.out.println("Frog F3"); }
    @Override protected void f4() { System.out.println("Frog F4"); }
}

class Main {
    public static void main(String[] args) {
        Amphibian a = new Frog();
        a.f1();
        a.f2();
        a.f3();
        a.f4();
        a = new Amphibian();
        a.f1();
        a.f2();
        a.f3();
        a.f4();
    }
}
