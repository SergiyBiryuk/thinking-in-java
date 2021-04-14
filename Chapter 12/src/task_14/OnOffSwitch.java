package task_14;

public class OnOffSwitch {
    public static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException("qwerty");
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
