package task_2;

public class Test {

    String s1 = "1";
    String s2;

    Test() { s2 = "2"; }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.s1);
        System.out.println(t.s2);
    }
}
