package task_13;

public class Test {
    public static void main(String[] args) {
        Inherited i = new Inherited();
        i.func();
        i.func(1);
        i.func(1.1f);
        i.func(true);
    }
}
