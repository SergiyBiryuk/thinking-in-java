package task_9;

public class GenericMethods {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getSimpleName() + " " + b.getClass().getSimpleName() + " " + c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 0xACBF);
        gm.f(gm, gm, 'q');
        gm.f(1.0, 1F, true);
        gm.f(false, gm, " qweqweqweqwe");
    }
}
