package task_26;

class FirstOuter {
    public FirstOuter() {
        System.out.println("FirstOuter.FirstOuter()");
    }
    class FirstInner {
        public FirstInner(String s) {
            System.out.println("FirstInner.FirstInner() " + s);
        }
    }
}

class SecondOuter {
    public SecondOuter() {
        System.out.println("SecondOuter.SecondOuter()");
    }
    class SecondInner extends FirstOuter.FirstInner {
        public SecondInner(FirstOuter x) {
            x.super("hello");
            System.out.println("SecondInner.SecondInner()");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        SecondOuter so = new SecondOuter();
        so.new SecondInner(fo);
    }
}