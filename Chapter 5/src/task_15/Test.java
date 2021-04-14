package task_15;

public class Test {
    public static void main(String[] args) {
        Str str = new Str();
    }
}

class Str {
    String str;
    {
        System.out.println("str BEFORE initialization:  " + str);
        str = "bla-bla-bla";
        System.out.println("str AFTER initialization: " + str);
    }

    public Str() {
        System.out.println("Constructor");
        System.out.println(str);
    }
}


