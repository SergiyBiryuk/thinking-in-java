package task_6;

public class Dog {
    void bark(String s, int i) {
        System.out.println(s + " " + i);
    }
    void bark(int i, String s) {
        System.out.println(i + " " + s);
    }
    void bark(double d) {
        System.out.println(d + " Double! Double! Double!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark("Wow! Wow! Wow!", 123);
        d.bark(123,"Wow! Wow! Wow!");
        d.bark(123);
        d.bark(1.1);
    }
}
