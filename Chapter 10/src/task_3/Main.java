package task_3;

class Outer {

    private String str;

    public Outer(String str) {
        System.out.println("Outer.Outer()");
        this.str = str;
    }
    class Inner {
        public Inner() { System.out.println("Inner.Inner()"); }
        @Override public String toString() { return str; }
    }
    public Inner getInner() {
        System.out.println("Outer.getInner()");
        return new Inner();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer[] o = new Outer[3];
        Outer.Inner[] oi = new Outer.Inner[3];
        for(int i = o.length - 1; i >= 0; i--) {
            o[i] = new Outer("Number " + i);
            oi[i] = o[i].getInner();
        }
        for(Outer.Inner q : oi)
            System.out.println(q);
    }
}
