package task_14;

public class Test {
    static void logString(String s, String f) {
        s = "qwe";
        System.out.println(s == f);
        System.out.println(s.equals(f));

        System.out.println(s != f);
        System.out.println("" + !s.equals(f) + '\n');
    }
    public static void main(String[] args) {
        String s, f;
        s = "qwe";
        f = "qwe";
        logString("qwe", f);
        logString("qwe", "qwe");
        logString("qwe", "asd");

    }
}
