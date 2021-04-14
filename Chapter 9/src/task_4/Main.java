package task_4;

abstract class Basic {
    public Basic() {
        System.out.println("Basic.Basic()");
    }
    /*_1_*///
    /*_2_*/public abstract void g();
}

class Inherited extends Basic {
    public Inherited() { System.out.println("Inherited.Inherited()"); }
    public void g() { System.out.println("Ingerited.g()"); }
}
public class Main {
    public static void f(Basic b) {
        /*_1_*///((Inherited)b).g();
        /*_2_*/b.g();
    }
    public static void main(String[] args) {
        Main.f(new Inherited());
    }
}
