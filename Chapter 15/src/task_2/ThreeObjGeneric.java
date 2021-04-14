package task_2;

public class ThreeObjGeneric<T> {
    T first, second, third;
    ThreeObjGeneric(T first, T second, T third) {
        this.first = first; this.second = second; this.third = third;
    }
    T getFirst() { return first; }
    T getSecond() { return second; }
    T getThird() { return third; }
    void setFirst(T a) { first = a; }
    void setSecond(T a) { second = a; }
    void setThird(T a) { third = a; }

    public static void main(String[] args) {
        ThreeObjGeneric<Integer> qwe = new ThreeObjGeneric<Integer>(1,2,3);
        System.out.println(qwe.getFirst().toString() + qwe.getSecond() + qwe.getThird());
        qwe.setFirst(2);
        qwe.setSecond(3);
        qwe.setThird(1);
        System.out.println(qwe.getFirst().toString() + qwe.getSecond() + qwe.getThird());
    }
}
