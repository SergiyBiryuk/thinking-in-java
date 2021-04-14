package task_2;

public class TripleGeneric<T> {
    private T a, b, c;
    public TripleGeneric(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(T a) { this.a = a; }
    public void setB(T b) { this.b = b; }
    public void setC(T c) { this.c = c; }
    public T getA() { return a; }
    public T getB() { return b; }
    public T getC() { return c; }
    @Override public String toString() { return a.toString() + b + c; }

    public static void main(String[] args) {
        TripleGeneric<Integer> tg = new TripleGeneric<Integer>(1,2,3);
        System.out.println(tg);
        tg.setA(10);
        tg.setB(20);
        tg.setC(30);
        System.out.println(tg.getA().toString() + tg.getB() + tg.getC());
    }
}
