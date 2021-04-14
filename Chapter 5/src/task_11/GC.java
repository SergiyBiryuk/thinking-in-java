package task_11;

public class GC {

    public static void main(String[] args) {
        new Test();
        System.gc();
    }
}

class Test {
    public void finalize() {
        System.out.println("Finalize method.");
    }
}
