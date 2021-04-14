package task_6;

public class Test {
    static void action() {
        Store s = new Store();
        System.out.println(s.i);
        System.out.println(s.s);
        System.out.println(s.d);
        System.out.println(s.b);
    }
    public static void main(String[] args) {
        action();
    }
}

class Store {
    Store() {
        System.out.println("Store constructor.");
    }
    protected int i = 100;
    protected String s = "String";
    protected double d = 4.4;
    protected boolean b = true;
}