package task_3;

class F {
    float f;
}

public class Test {
    static void f(F f) {
        f.f = 2.2f;
    }

    public static void main(String[] args) {
        F f = new F();
        f.f = 1.1f;
        System.out.println("1: f.f = " + f.f);
        f(f);
        System.out.println("2: f.f = " + f.f);
    }
}
