package task_18;

public class Test {
    public static void main(String[] args) {
        Str[] str = { new Str("obj_1"), new Str("obj_2"), new Str("obj_3") };
    }
}

class Str {
    Str(String s) {
        System.out.println(s);
    }
}
