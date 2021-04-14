package task_5;

public class Dog {
    void bark(String s) {
        System.out.println(s);
    }
    void bark(int i) {
        System.out.println(i + " Int! Int! Int!");
    }
    void bark(double d) {
        System.out.println(d + " Double! Double! Double!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark("Wow! Wow! Wow!");
        d.bark(123);
        d.bark(1.1);
    }
}
