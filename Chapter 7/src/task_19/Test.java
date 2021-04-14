package task_19;

public class Test {

    final String s;

    Test() {
        this("Pikabu");
    }
    Test(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Test());
        System.out.println(new Test("BlaBlaBLa"));
    }
}
