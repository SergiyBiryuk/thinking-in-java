package task_23;

import java.util.Random;

interface U {
    void first();
    void second();
    void third();
}

class A {
    public U a() {
        return new U() {
            @Override public void first() {}
            @Override public void second() {}
            @Override public void third() {}
        };
    }
}

class B {
    public int i = 0;
    public U[] u = new U[100];
    public void add(U u) {
        this.u[i++] = u;
    }
    public void delete(int i) { u[i] = null; }
    public void action() {
        for(int i = 0; i < u.length; i++)
            if(u[i] != null) {
                u[i].first();
                u[i].second();
                u[i].third();
            }
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        for (int i = 0; i < 100; i++)
            b.add(new A().a());
        for(U i : b.u) {
            i.first();
            i.second();
            i.third();
        }
        for(int i = 0; i < 100; i++)
            b.u[new Random().nextInt(b.i)] = null;
//        for(U i : b.u) {
//            i.first();
//            i.second();
//            i.third();
//        }
    }

}
