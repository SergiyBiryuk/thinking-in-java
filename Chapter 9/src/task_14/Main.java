package task_14;

interface First {
    void first_1();
    void first_2();
}
interface Second {
    void second_1();
    void second_2();
}
interface Third {
    void third_1();
    void third_2();
}
interface Inherited extends First, Second, Third {
    void inherited();
}

class BasicClass {
    public void inherited() {}
}
class InheritedClass extends BasicClass implements Inherited {
    @Override public void first_1() {}
    @Override public void first_2() {}
    @Override public void second_1() {}
    @Override public void second_2() {}
    @Override public void third_1() {}
    @Override public void third_2() {}
    //@Override public void inherited() {}
}

public class Main {
    public static void a(First x) { System.out.println("Method A, " + x.getClass().getSimpleName()); }
    public static void b(Second x) { System.out.println("Method B, " + x.getClass().getSimpleName()); }
    public static void c(Third x) { System.out.println("Method C, " + x.getClass().getSimpleName()); }
    public static void d(Inherited x) { System.out.println("Method D, " + x.getClass().getSimpleName()); }

    public static void main(String[] args) {
        InheritedClass x = new InheritedClass();
        a(x);
        b(x);
        c(x);
        d(x);
    }
}
