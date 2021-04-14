package task_8;

public class Test {
    void func1() {
        func2();
        this.func2();
    }
    void func2() {}

    public static void main(String[] args) {
        new Test().func1();
    }
}
