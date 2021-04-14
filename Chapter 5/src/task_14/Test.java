package task_14;

public class Test {

    public static void main(String[] args) {
        Str.print();
    }
}

class Str {

    static String s1 = "s1", s2;
    static {
        s2 = "s2";
        System.out.println("static s2");
    }

    Str() {
        System.out.println("constructor");
    }

    static void print() {
        System.out.println(s1);
        s1 = "changed s1";
        System.out.println(s1);
        System.out.println(s2);
    }
}
