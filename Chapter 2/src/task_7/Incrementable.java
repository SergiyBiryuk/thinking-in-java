package task_7;

public class Incrementable {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
    static void increment() { StaticTest.i++; }
}

class StaticTest {
    static int i = 47;
}