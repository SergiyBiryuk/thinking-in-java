package task_13;

interface Anon {
    void f();
}

public class Main {
    public Main() { System.out.println("Main.Main()"); }
    public Anon geteAnon() {
        return new Anon() {
            { System.out.println("Anonymous.Anonymous()"); }
            @Override public void f() { System.out.println("Anonymous.f()"); }
        };
    }

    public static void main(String[] args) {
        Main m = new Main();
        Anon a = m.geteAnon();
        a.f();
    }
}
