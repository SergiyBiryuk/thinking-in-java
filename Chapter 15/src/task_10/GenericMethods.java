package task_10;

public class GenericMethods {
    public <A, B> void f(A a, B b, Boolean c) {
        System.out.println(a.getClass().getSimpleName() + " " + b.getClass().getSimpleName() + " " + c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, false);
        gm.f(gm, gm, false);
        gm.f(1.0, 1F, true);
        gm.f(false, gm, true);
    }
}
