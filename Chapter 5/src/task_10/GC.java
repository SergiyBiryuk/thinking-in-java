package task_10;

public class GC {
    public void finalize() {
        System.out.println("Finalize method.");
    }
    public static void main(String[] args) {
        GC gc = new GC();
    }
}
